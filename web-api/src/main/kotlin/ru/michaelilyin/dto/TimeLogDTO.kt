package ru.michaelilyin.dto

import ru.michaelilyin.domain.TimeLog

/**
 * Created by micha on 25.03.2017.
 */
class TimeLogDTO(
    var id: Long = 0,
    var userId: Long = 0,
    var userName: String = "",
    var actionId: Long = 0,
    var actionName: String = "",
    var timeBegin: Long = 0,
    var timeEnd: Long? = 0,
    var comment: String? = ""
) {
    constructor(model: TimeLog) : this(
        id = model.id,
        userId = model.user.id,
        userName = model.user.name,
        actionId = model.action.id,
        actionName = model.action.name,
        timeBegin = model.timeBegin.toInstant().toEpochMilli(),
        timeEnd = model.timeEnd?.toInstant()?.toEpochMilli(),
        comment = model.comment
    )
}
