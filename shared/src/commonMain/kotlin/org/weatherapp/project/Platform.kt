package org.weatherapp.project

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform