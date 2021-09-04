package com.hoon.event

import org.springframework.context.ApplicationEventPublisher
import org.springframework.stereotype.Service

@Service
class MoveReservationService(
    private val moveReservationRepository: MoveReservationRepository,
    private val eventListener: ApplicationEventPublisher
) {

    fun reserve(moveReservation: MoveReservation) {
        val reserved = moveReservationRepository.save(moveReservation)

        eventListener.publishEvent(LogEvent(reserved))
    }

}