plugins {
    id(Plugins.androidApplication)
    kotlin("android")
    kotlin(KotlinPlugins.kapt) // kotlin annotations
    kotlin(KotlinPlugins.serialization) version Kotlin.version // serialization
    id(Plugins.hilt)
}

dependencies {
    implementation(project(":shared"))

    implementation(Coil.coil)
    implementation(AndroidX.appCompat)

    implementation(Compose.runtime)
    implementation(Compose.runtimeLiveData)
    implementation(Compose.ui)
    implementation(Compose.material)
    implementation(Compose.uiTooling)
    implementation(Compose.foundation)
    implementation(Compose.compiler)
    implementation(Compose.constraintLayout)
    implementation(Compose.activity)
    implementation(Compose.navigation)

    implementation(Google.material)

    implementation(Hilt.hiltAndroid)
    implementation(Hilt.hiltNavigation)
    kapt(Hilt.hiltCompiler )

    implementation(Kotlinx.datetime)
    implementation(Ktor.android)

    debugImplementation(SquareUp.leakCanary)
}

android {
    compileSdkVersion(Application.compileSdk)
    defaultConfig {
        applicationId = Application.appId
        minSdkVersion(Application.minSdk)
        targetSdkVersion(Application.targetSdk)
        versionCode = Application.versionCode
        versionName = Application.versionName
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    buildFeatures {
        compose = true // enable compose
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Compose.composeVersion
    }
}