package com.sliderzxc.github.trending.repositories

import com.sliderzxc.github.trending.repositories.services.configureMonitoring
import io.ktor.server.application.Application
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty

fun main() {
    embeddedServer(Netty, 8080) {
        startApplication()
    }.start(true)
}

fun Application.startApplication() {

}