package ru.michaelilyin.service

import ru.michaelilyin.domain.TimeLog
import ru.michaelilyin.domain.TimeTest

/**
 * Created by micha on 25.03.2017.
 */
interface TimeLogService {
    fun getTimeLogsForUser(userId: Long): List<TimeLog>
    fun getTimeTests(): List<TimeTest>
}
