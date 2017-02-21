package ru.michaelilyin.resource.demo

import ru.michaelilyin.Demo
import javax.ejb.Stateless
import javax.persistence.EntityManager
import javax.persistence.PersistenceContext
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

/**
 * TODO: javadoc
 * Created by Michael Ilyin on 19.02.2017.
 */
@Stateless
@Path("/demo")
@Produces(MediaType.APPLICATION_JSON)
class DemoResource {

    @PersistenceContext
    private lateinit var entityManager: EntityManager

    @GET
    fun getDemos(): List<Demo> {
        return entityManager.createNamedQuery(Demo.Query.selectAll, Demo::class.java).resultList
    }

}