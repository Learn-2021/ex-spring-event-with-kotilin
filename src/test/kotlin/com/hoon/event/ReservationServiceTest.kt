package com.hoon.event

import org.junit.jupiter.api.Test
import org.mockito.Mockito.*
import org.mockito.Spy
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.boot.test.mock.mockito.SpyBean
import org.springframework.context.ApplicationEventPublisher
import java.time.LocalDate

@SpringBootTest
class ReservationServiceTest {
    @Autowired
    lateinit var moveReservationService: MoveReservationService
    @MockBean
    lateinit var moveReservationRepo: MoveReservationRepository
    @SpyBean
    lateinit var logService: LogService

    @Test
    fun `입주 예약하면 로깅까지` () {
        // given
        val moveReservation = MoveReservation(
            id = 1,
            block = 201,
            house = 101,
            date = LocalDate.of(2021, 11, 12)
        )

        doReturn(moveReservation).`when`(moveReservationRepo).save(moveReservation)

        // when
        moveReservationService.reserve(moveReservation)

        // then
        verify(logService, times(1)).reserveLog(moveReservation)
    }
}