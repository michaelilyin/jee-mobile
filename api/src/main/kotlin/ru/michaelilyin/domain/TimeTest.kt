package ru.michaelilyin.domain

import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table
import javax.persistence.Id

/**
 * Created by micha on 01.04.2017.
 */
@Entity
@Table(name = "test_time")
class TimeTest(
    @Id
    @Column(name = "id", nullable = false)
    open var id: Long = 0,

    @Column(name = "tswt", nullable = false)
    open var tswt: Date? = null,

    @Column(name = "tswot", nullable = false)
    open var tswot: Date? = null,

    @Column(name = "date", nullable = false)
    open var date: Date? = null,

    @Column(name = "timewt", nullable = false)
    open var timewt: Date? = null,

    @Column(name = "timewot", nullable = false)
    open var timewot: Date? = null

    ) {
}
