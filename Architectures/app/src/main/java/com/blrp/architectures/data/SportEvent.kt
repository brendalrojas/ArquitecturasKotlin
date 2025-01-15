package com.blrp.architectures.data

import com.blrp.architectures.R

sealed class SportEvent {

    data class ResultSuccess(
        val sportKey: Int? = null,
        val sportName: String? = null,
        val results: List<String>? = null,
        val isWarning: Boolean? = false,
        val getImgRest: Int? = when (sportKey) {
            1 -> R.drawable.ic_soccer
            2 -> R.drawable.ic_weight_lifter
            3 -> R.drawable.ic_gymnastics
            4 -> R.drawable.ic_water_polo
            5 -> R.drawable.ic_baseball_bat
            6 -> R.drawable.ic_rugby
            7 -> R.drawable.ic_tennis_ball
            else -> R.drawable.ic_timer
        },
    ) : SportEvent()

    data class ResultError(
        val code: Int? = null,
        val msg: String? = null,
    ) : SportEvent()

    data object AddEvent : SportEvent()

    data object SaveEvent: SportEvent()
    data object CloseEvent: SportEvent()
}