package com.ppantaleon.kmmquickstart.data.network

import io.ktor.client.HttpClient
import io.ktor.client.engine.ios.Ios
import io.ktor.client.features.json.JsonFeature
import io.ktor.client.features.json.serializer.KotlinxSerializer
import kotlinx.serialization.json.Json

actual class KtorClientFactory {

    actual fun build(): HttpClient {
        return HttpClient(Ios) {
            install(JsonFeature) {
                serializer = KotlinxSerializer(
                    Json {
                        ignoreUnknownKeys = true // ignore extra fields returned by the server
                    }
                )
            }
        }
    }
}