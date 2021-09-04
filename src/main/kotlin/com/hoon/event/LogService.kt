package com.hoon.event

import org.springframework.stereotype.Service
import java.time.LocalDateTime

@Service
class LogService(val logRepository: LogRepository) {
    fun reserveLog(moveReservation: MoveReservation) {
        val log = Log(
            requestedBy = "TESTER",
            requestedAt = LocalDateTime.now(),
            message = "${moveReservation.block}동 ${moveReservation.house}호 입주예약 신청"
        )

        logRepository.save(log)
    }
}
