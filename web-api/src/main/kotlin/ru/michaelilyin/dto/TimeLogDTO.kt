package ru.michaelilyin.dto

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
}
