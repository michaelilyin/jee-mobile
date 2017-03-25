package ru.michaelilyin.repository.impl

import ru.michaelilyin.domain.TimeLog
import ru.michaelilyin.repository.TimeLogRepository
import javax.ejb.Stateless
import javax.persistence.EntityManager
import javax.persistence.PersistenceContext

/**
 * Created by micha on 25.03.2017.
 */
@Stateless
open class TimeLogRepositoryImpl : TimeLogRepository {

    @PersistenceContext
    private lateinit var entityManager: EntityManager

    override fun getTimeLogsForUser(userId: Long): List<TimeLog> {
        return entityManager
            .createNamedQuery(TimeLog.Query.logsForUser, TimeLog::class.java)
            .setParameter("userId", userId)
            .resultList
    }
}
