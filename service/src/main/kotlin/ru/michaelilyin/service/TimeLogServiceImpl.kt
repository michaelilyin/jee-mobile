package ru.michaelilyin.service

import ru.michaelilyin.domain.TimeLog
import ru.michaelilyin.repository.TimeLogRepository
import javax.ejb.Stateless
import javax.inject.Inject

/**
 * Created by micha on 25.03.2017.
 */
@Stateless
open class TimeLogServiceImpl : TimeLogService {

    @Inject
    private lateinit var timeLogRepository: TimeLogRepository

    override fun getTimeLogsForUser(userId: Long): List<TimeLog> {
        return timeLogRepository.getTimeLogsForUser(userId)
    }
}
