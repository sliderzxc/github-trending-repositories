package com.sliderzxc.github.trending.repositories.services

import io.ktor.server.application.Application
import io.ktor.server.routing.get
import io.ktor.server.routing.routing

fun Application.setupApplicationRouting() {
    routing {
        get("/trending") {

        }
    }
}