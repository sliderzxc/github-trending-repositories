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
        implementation("org.slf4j:slf4j-log4j12:1.7.32")
        implementation("org.jsoup:jsoup:1.14.3")
    }
}