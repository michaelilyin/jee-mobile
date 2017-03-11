FROM jboss/wildfly

RUN echo $POSTGRES_HOST

ARG WILDFLY_ADMIN
ARG WILDFLY_PASSWORD
ARG POSTGRES_USER
ARG POSTGRES_PASSWORD
ARG POSTGRES_HOST
ARG POSTGRES_PORT
ARG POSTGRES_DB

RUN echo $POSTGRES_HOST

RUN curl -o /tmp/psql-jdbc.jar https://jdbc.postgresql.org/download/postgresql-9.4-1201.jdbc41.jar
#RUN curl -o /tmp/postgis-jdbc.jar http://postgis.net/stuff/postgis-jdbc-2.1.3.jar
ADD image/config.sh /tmp/
ADD image/batch.cli /tmp/
USER root
RUN chmod o+rx /tmp/config.sh
RUN chmod o+rx /tmp/batch.cli
USER jboss

RUN /tmp/config.sh
RUN rm -r /opt/jboss/wildfly/standalone/configuration/standalone_xml_history

RUN /opt/jboss/wildfly/bin/add-user.sh -u ${WILDFLY_ADMIN} -p ${WILDFLY_PASSWORD} -e -cw

ADD web-api/build/libs/*.war /opt/jboss/wildfly/standalone/deployments/ROOT.war
ADD service/build/libs/*.war /opt/jboss/wildfly/standalone/deployments/service.war

CMD ["/opt/jboss/wildfly/bin/standalone.sh", "-b", "0.0.0.0", "-bmanagement", "0.0.0.0"]
