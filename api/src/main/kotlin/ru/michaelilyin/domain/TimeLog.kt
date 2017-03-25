package ru.michaelilyin.domain

import java.time.Instant
import java.util.*
import javax.persistence.*

/**
 * Created by micha on 24.03.2017.
 */
@NamedQuery(name = TimeLog.Query.logsForUser,
    query = "select tl from TimeLog tl where tl.user.id = :userId")
@Entity
@Table(name = "time_logs")
open class TimeLog(
    @Id
    @Column(name = "id", nullable = false)
    open var id: Long = 0,

    @JoinColumn(name = "user_id", nullable = false)
    @ManyToOne(targetEntity = User::class, optional = false,
        fetch = FetchType.EAGER, cascade = arrayOf(CascadeType.REMOVE))
    open var user: User = TimeLog.defaultUser,

    @JoinColumn(name = "action_id", nullable = false)
    @ManyToOne(targetEntity = Action::class, optional = false,
        fetch = FetchType.EAGER, cascade = arrayOf(CascadeType.REMOVE))
    open var action: Action = TimeLog.defaultAction,

    @Column(name = "time_begin", nullable = false)
    open var timeBegin: Date = TimeLog.defaultTime,

    @Column(name = "time_end", nullable = true)
    open var timeEnd: Date? = null,

    @Column(name = "comment")
    open var comment: String? = null
) {
    companion object {
        private val defaultUser = User()
        private val defaultAction = Action()
        private val defaultTime = Date.from(Instant.parse("2017-01-01T00:00:00.00Z"))
    }

    object Query {
        const val logsForUser = "logsForUser"
    }
}
