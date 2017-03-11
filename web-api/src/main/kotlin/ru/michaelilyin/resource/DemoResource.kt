package ru.michaelilyin.resource

import ru.michaelilyin.domain.Demo
import ru.michaelilyin.service.DemoService
import javax.ejb.EJB
import javax.ejb.Stateless
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

/**
 * TODO: javadoc
 * Created by Michael Ilyin on 19.02.2017.
 */
@Path("/demo")
@Stateless
@Produces(MediaType.APPLICATION_JSON)
open class DemoResource {

    @EJB
    private lateinit var demoService: DemoService

    @GET
    open fun getDemos(): Iterable<Demo> {
        return demoService.getDemos()
    }

}
