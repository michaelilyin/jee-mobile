package ru.michaelilyin.domain

import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table
import javax.persistence.Id

/**
 * Created by micha on 01.04.2017.
 */
class TimeTestDTO(
    var id: Long = 0,
    var tswt: Long? = null,
    var tswot: Long? = null,
    var date: Long? = null,
    var timewt: Long? = null,
    var timewot: Long? = null
    ) {
    constructor(timeTest: TimeTest) : this(
        id = timeTest.id,
        tswt = timeTest.tswt?.toInstant()?.toEpochMilli(),
        tswot = timeTest.tswot?.toInstant()?.toEpochMilli(),
        date = timeTest.date?.toInstant()?.toEpochMilli(),
        timewt = timeTest.timewt?.toInstant()?.toEpochMilli(),
        timewot = timeTest.timewot?.toInstant()?.toEpochMilli()
    )
}
