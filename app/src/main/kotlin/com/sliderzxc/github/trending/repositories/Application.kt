package com.sliderzxc.github.trending.repositories

import com.sliderzxc.github.trending.repositories.services.setupApplicationRouting
import io.ktor.server.application.Application
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty

fun main() {
    embeddedServer(Netty, 8785) {
        startApplication()
    }.start(true)
}

fun Application.startApplication() {
    println("Github Trending Repositories Server started ")
    setupApplicationRouting()
}