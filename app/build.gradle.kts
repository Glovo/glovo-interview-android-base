plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
    alias(libs.plugins.kotlin.kapt)
    alias(libs.plugins.kotlin.serialization)
}

java.toolchain.languageVersion.set(JavaLanguageVersion.of(17))

android {
    compileSdk = 35

    defaultConfig {
        minSdk = 21
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    testOptions {
        unitTests.isReturnDefaultValues = true
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
            proguardFile("proguard-rules.pro")
        }
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.15"
    }

    buildFeatures {
        dataBinding = true
        compose = true
    }
    namespace = "com.glovo.interviewbase"
}

dependencies {
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.fragment)
    implementation(libs.androidx.core)
    implementation(libs.androidx.recyclerview)
    implementation(libs.androidx.cardview)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.swiperefreshlayout)
    implementation(libs.androidx.lifecycle.viewmodel)
    implementation(libs.androidx.lifecycle.runtime)
    implementation(libs.androidx.lifecycle.livedata)
    implementation(libs.google.material)
    implementation(libs.rx.java)
    implementation(libs.rx.android)
    implementation(libs.kotlinx.coroutines)
    implementation(libs.retrofit)
    implementation(libs.retrofit.rx)
    implementation(libs.okhttp)
    implementation(libs.okhttp.urlconnection)
    implementation(libs.okhttp.loggingInterceptor)
    implementation(libs.kotlinx.serialization.json)
    implementation(libs.kotlinx.serialization.retrofit)

    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.compose.uiToolingPreview)
    debugImplementation(platform(libs.androidx.compose.bom))
    debugImplementation(libs.androidx.compose.uiTooling)
    implementation(libs.androidx.compose.material)
    implementation(libs.androidx.compose.livedata)
    implementation(libs.androidx.compose.activity)
    implementation(libs.androidx.compose.viewmodel)
    implementation(libs.androidx.compose.constraintlayout)

    testImplementation(libs.junit)
    testImplementation(libs.mockito.inline)
    testImplementation(libs.mockito.kotlin)
    testImplementation(libs.mockk)
    testImplementation(libs.turbine)
    testImplementation(libs.androidx.test.runner)
    testImplementation(libs.androidx.test.junit)
    testImplementation(libs.androidx.test.espresso)
    testImplementation(libs.androidx.test.core)
    testImplementation(libs.androidx.test.rules)
    testImplementation(libs.jraska.livedata.testing)
    testImplementation(libs.kotlinx.coroutines.test)
}
