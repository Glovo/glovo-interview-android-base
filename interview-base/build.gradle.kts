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

dependencies {
    api("androidx.appcompat:appcompat:1.1.0")
    api("androidx.core:core-ktx:1.3.0")
    api("androidx.recyclerview:recyclerview:1.1.0")
    api("androidx.cardview:cardview:1.0.0")
    api("androidx.constraintlayout:constraintlayout:1.1.3")
    api("androidx.constraintlayout:constraintlayout-solver:1.1.3")

    api("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.7")
    api("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.7-mpp-dev-11")

    api("io.reactivex.rxjava2:rxjava:2.2.19")
    api("io.reactivex.rxjava2:rxandroid:2.1.1")
    api("io.reactivex.rxjava2:rxkotlin:2.4.0")
}
