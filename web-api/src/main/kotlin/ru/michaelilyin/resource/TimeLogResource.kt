package ru.michaelilyin.resource

import ru.michaelilyin.domain.TimeLog
import ru.michaelilyin.dto.TimeLogDTO
import ru.michaelilyin.service.TimeLogService
import javax.ejb.EJB
import javax.ejb.Stateless
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.PathParam
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

/**
 * Created by micha on 25.03.2017.
 */
@Path("/")
@Stateless
@Produces(MediaType.APPLICATION_JSON)
open class TimeLogResource {

    @EJB
    private lateinit var timeLogService: TimeLogService

    @GET
    @Path("/users/{id}/logs")
    open fun getLogsForUser(@PathParam("id") id: Long): Iterable<TimeLogDTO> {
        val logs = timeLogService.getTimeLogsForUser(id)
        return logs.map(::TimeLogDTO)
    }
}
