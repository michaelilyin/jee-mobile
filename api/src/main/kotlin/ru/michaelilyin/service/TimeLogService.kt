package ru.michaelilyin.service

import ru.michaelilyin.domain.TimeLog

/**
 * Created by micha on 25.03.2017.
 */
interface TimeLogService {
    fun getTimeLogsForUser(userId: Long): List<TimeLog>
}
