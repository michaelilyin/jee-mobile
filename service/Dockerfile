FROM jboss/wildfly

ARG WILDFLY_ADMIN
ARG WILDFLY_PASSWORD
ARG POSTGRES_USER
ARG POSTGRES_PASSWORD
ARG POSTGRES_HOST
ARG POSTGRES_PORT
ARG POSTGRES_DB

RUN curl -o /tmp/psql-jdbc.jar https://jdbc.postgresql.org/download/postgresql-9.4-1201.jdbc41.jar
#RUN curl -o /tmp/postgis-jdbc.jar http://postgis.net/stuff/postgis-jdbc-2.1.3.jar
ADD image/config.sh /tmp/
ADD image/batch.cli /tmp/
RUN chmod a+rx /tmp/config.sh
RUN chmod a+rx /tmp/batch.cli

RUN /tmp/config.sh
RUN rm -r /opt/jboss/wildfly/standalone/configuration/standalone_xml_history

RUN /opt/jboss/wildfly/bin/add-user.sh -u ${WILDFLY_ADMIN} -p ${WILDFLY_PASSWORD} -e -cw

ADD build/libs/*.war /opt/jboss/wildfly/standalone/deployments/ROOT.war

CMD ["/opt/jboss/wildfly/bin/standalone.sh", "-b", "0.0.0.0", "-bmanagement", "0.0.0.0"]
