package com.hoon.event

import org.springframework.context.event.EventListener
import org.springframework.stereotype.Component

@Component
class LogEventHandler(
    private val logService: LogService
    ) {
    @EventListener
    fun reserved(event: LogEvent) = logService.reserveLog(event.moveReservation)
}