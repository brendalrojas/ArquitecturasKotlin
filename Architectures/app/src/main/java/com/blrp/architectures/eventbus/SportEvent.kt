package com.blrp.architectures.eventbus

sealed class SportEvent {

    data class ResultSuccess(
        val sportKey: Int? = null,
        val sportName: String? = null,
        val results: List<String>? = null,
        val isWarning: Boolean? = false,
    ): SportEvent()

    data class ResultError(
        val code: Int? = null,
        val msg: String? = null
    ): SportEvent()

    data object AddEvent: SportEvent()

}