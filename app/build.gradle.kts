plugins {
    alias(libs.plugins.kotlinJvm)
}

kotlin {
    dependencies {
        implementation(libs.ktor.call.logging)
        implementation(libs.ktor.content.negotiation)
        implementation(libs.ktor.core.jvm)
        implementation(libs.ktor.netty.jvm)
        implementation(libs.ktor.netty.core)
    }
}