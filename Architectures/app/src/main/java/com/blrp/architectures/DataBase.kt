package com.blrp.architectures

import com.blrp.architectures.eventbus.Result
import com.blrp.architectures.eventbus.SportEvent


fun getEventsInRealtime() = listOf(
    Result(sportKey = 1, sportName = "Fútbol", results = listOf("Italia", "Perú", "Corea del Sur")),
    Result(sportKey = 2, sportName = "Levantamiento de Pesas", results = listOf("Mongolia", "Alemania", "Turquía")),
    Result(sportKey = 3, sportName = "Gimnasia Rítmica", results = listOf("Rusia", "USA", "Francia")),
    Result(sportKey = 4, sportName = "Polo Acuático", results = listOf("España", "Vietnam", "USA")),
    Result(sportKey = 5, sportName = "Béisbol", results = null, isWarning = true),
    Result(sportKey = 6, sportName = "Rugby", results = listOf("Sudáfrica", "Qatar", "Rumanía")),
    Result(sportKey = 7, sportName = "Tenis", results = listOf("España", "México", "Colombia"))
)

fun getResultEventsInRealtime() = listOf(
    SportEvent.ResultSuccess(1, "Fútbol", listOf("Italia", "Perú", "Corea del Sur")),
    SportEvent.ResultSuccess(
        2,
        "Levantamiento de Pesas",
        listOf("Mongolia", "Alemania", "Turquía")
    ),
    SportEvent.ResultError(10, "Error de red."),
    SportEvent.ResultSuccess(3, "Gimnasia Rítmica", listOf("Rusia", "USA", "Francia")),
    SportEvent.ResultSuccess(4, "Polo Acuático", listOf("España", "Vietnam", "USA")),
    SportEvent.ResultSuccess(5, "Béisbol", null, true),
    SportEvent.ResultError(20, "Error de permisos."),
    SportEvent.ResultSuccess(6, "Rugby", listOf("Sudáfrica", "Qatar", "Rumanía")),
    SportEvent.ResultSuccess(7, "Tenis", listOf("España", "México", "Colombia"))
)

fun getAdEventsInRealtime() = listOf(
    SportEvent.AddEvent,
    SportEvent.AddEvent
)

