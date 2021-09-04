package com.hoon.event

import java.time.LocalDateTime

class Log(
    var requestedBy: String,
    var requestedAt: LocalDateTime,
    var message: String
)