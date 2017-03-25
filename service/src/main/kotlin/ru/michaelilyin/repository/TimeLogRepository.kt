package ru.michaelilyin.repository

import ru.michaelilyin.domain.TimeLog

/**
 * Created by micha on 25.03.2017.
 */
interface TimeLogRepository {
    fun getTimeLogsForUser(userId: Long): List<TimeLog>
}
