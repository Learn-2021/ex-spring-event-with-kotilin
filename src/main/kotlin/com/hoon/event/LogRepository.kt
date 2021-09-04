package com.hoon.event

import org.springframework.stereotype.Repository

@Repository
class LogRepository {
    fun save(log: Log): Log {
        println("requested by : ${log.requestedBy}")
        return log
    }
}
