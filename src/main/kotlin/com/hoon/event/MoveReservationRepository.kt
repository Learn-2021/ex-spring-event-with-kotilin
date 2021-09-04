package com.hoon.event

import org.springframework.stereotype.Repository

@Repository
class MoveReservationRepository {
    fun save(moveReservation: MoveReservation): MoveReservation {
        println("${moveReservation.block}동 ${moveReservation.house}호 입주예약 완료")
        return moveReservation
    }
}