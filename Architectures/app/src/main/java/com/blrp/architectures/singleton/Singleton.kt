package com.blrp.architectures.singleton

import com.blrp.architectures.eventbus.EventBus

object Singleton {

    // Patrón singleton -> Acceso a un sola instancia
    private val eventBusInstance: EventBus by lazy { EventBus() }

    fun eventBusInstance() = eventBusInstance

}