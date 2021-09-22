package com.ppantaleon.kmmquickstart

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}