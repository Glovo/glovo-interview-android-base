plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-kapt")
    id("kotlin-android-extensions")
}

android {
    compileSdkVersion(29)

    defaultConfig {
        minSdkVersion(21)
        targetSdkVersion(29)
        versionCode = 1
        versionName = "1.0.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
            proguardFile("proguard-rules.pro")
        }
    }
}

apply(from = "$rootDir/dependencies.gradle.kts")
