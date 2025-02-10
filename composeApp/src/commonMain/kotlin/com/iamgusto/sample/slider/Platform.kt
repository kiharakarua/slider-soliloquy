package com.iamgusto.sample.slider

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform