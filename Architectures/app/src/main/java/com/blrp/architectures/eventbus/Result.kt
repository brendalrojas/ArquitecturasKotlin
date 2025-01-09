package com.blrp.architectures.eventbus

data class Result(
    val sportKey: Int? = null,
    val sportName: String? = null,
    val results: List<String>? = null,
    val isWarning: Boolean = false,
)