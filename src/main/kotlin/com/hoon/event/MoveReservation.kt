package com.hoon.event

import java.time.LocalDate

class MoveReservation(
    var id: Int,
    var block: Int,
    var house: Int,
    var date: LocalDate
)