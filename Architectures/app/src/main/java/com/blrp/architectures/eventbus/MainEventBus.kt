package com.blrp.architectures.eventbus

import com.blrp.architectures.getAdEventsInRealtime
import com.blrp.architectures.getEventsInRealtime
import com.blrp.architectures.getResultEventsInRealtime
import com.blrp.architectures.singleton.Singleton
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.random.Random

private lateinit var eventBus: EventBus

fun main() {
    initEventBus()
    runBlocking {
        setupSubscriber(CoroutineScope(Dispatchers.IO))
        setupSubscriberTwo(CoroutineScope(Dispatchers.IO))
        setupPublisher()

        setupSubscriberSuccess(CoroutineScope(Dispatchers.IO))
        setupSubscriberError(CoroutineScope(Dispatchers.IO))
        setupPublisherResults()
        setupSubscriberAnalytics(CoroutineScope(Dispatchers.IO))
        setupPublisherResults()

    }
}

fun initEventBus() {
    // eventBus = EventBus()
    eventBus = Singleton.eventBusInstance()
}

// Data class
suspend fun setupSubscriber(coroutineScope: CoroutineScope) {
    coroutineScope.launch {
        eventBus.subscribe<Result> { result ->
            println(result.sportName)
        }
    }
}

suspend fun setupSubscriberTwo(coroutineScope: CoroutineScope) {
    coroutineScope.launch {
        eventBus.subscribe<Result> { result ->
            if (result.isWarning)
                println("Warning: ${result.sportName}")
        }
    }
}

// Sealed class
fun setupSubscriberSuccess(coroutineScope: CoroutineScope) {
    coroutineScope.launch {
        eventBus.subscribe<SportEvent.ResultSuccess> { result ->
            println(result.sportName)
        }
    }
}

fun setupSubscriberError(coroutineScope: CoroutineScope) {
    coroutineScope.launch {
        eventBus.subscribe<SportEvent.ResultError> { result ->
            println("Code: ${result.code}, Message: ${result.msg}")
        }
    }
}

//
fun setupSubscriberAnalytics(coroutineScope: CoroutineScope) {
    coroutineScope.launch {
        eventBus.subscribe<SportEvent.AddEvent> { result ->
            println("Add click, send data to server")

        }
    }
}

suspend fun setupPublisher() {
    getEventsInRealtime().forEach {
        delay(500)
        eventBus.publish(it)
    }
}

suspend fun setupPublisherResults() {
    getResultEventsInRealtime().forEach {
        delay(someTime())
        eventBus.publish(it)
    }

    CoroutineScope(Dispatchers.IO)
        .launch {
            getAdEventsInRealtime().forEach {
                delay(someTime() * 2)
                eventBus.publish(it)
            }
        }
}

fun someTime(): Long = Random.nextLong(500, 2_000)