package com.app.logicprogram

fun solution(S: String): Int {
    val callLogs = S.split("\n")
    val callDurations = HashMap<String, Int>()

    for (log in callLogs) {
        val (duration, phoneNumber) = log.split(",")
        val (hours, minutes, seconds) = duration.split(":").map { it.toInt() }
        val totalSeconds = hours * 3600 + minutes * 60 + seconds

        callDurations[phoneNumber] = (callDurations[phoneNumber] ?: 0) + totalSeconds

    }

    var longestDuration = 0
    var freePhoneNumber = ""

    for ((phoneNumber, duration) in callDurations) {
        if (duration > longestDuration) {
            longestDuration = duration
            freePhoneNumber = phoneNumber
        } else if (duration == longestDuration && phoneNumber < freePhoneNumber) {
            freePhoneNumber = phoneNumber
        }
    }

    if (longestDuration == 0) {
        return 0
    }

    callDurations.remove(freePhoneNumber)

    var totalCost = 0

    for ((_, duration) in callDurations) {
        totalCost += if (duration >= 300) {
            ((duration + 59) / 60) * 150
        } else {
            duration * 3
        }
    }

    return totalCost
}

fun main() {
    val S ="00:01:07,400-234-090\n00:05:01,701-080-080\n00:05:00,400-234-090"
    val result = solution(S)
    println("Amount to pay: $result cents")
}