dependencies {
    "implementation"("androidx.appcompat:appcompat:1.2.0")
    "implementation"("androidx.fragment:fragment-ktx:1.2.5")
    "implementation"("androidx.core:core-ktx:1.3.1")
    "implementation"("androidx.recyclerview:recyclerview:1.1.0")
    "implementation"("androidx.cardview:cardview:1.0.0")
    "implementation"("androidx.constraintlayout:constraintlayout:2.0.1")
    "implementation"("androidx.swiperefreshlayout:swiperefreshlayout:1.1.0")
    "implementation"("androidx.lifecycle:lifecycle-viewmodel-ktx:2.2.0")
    "implementation"("androidx.lifecycle:lifecycle-runtime-ktx:2.2.0")
    "implementation"("androidx.lifecycle:lifecycle-livedata-ktx:2.2.0")
    "implementation"("com.google.android.material:material:1.2.1")
    "implementation"("io.reactivex.rxjava2:rxjava:2.2.19")
    "implementation"("io.reactivex.rxjava2:rxandroid:2.1.1")
    "implementation"("io.reactivex.rxjava2:rxkotlin:2.4.0")
    "implementation"("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.9")

    val testShared by configurations.creating {
        isCanBeConsumed = true
        isCanBeResolved = false
    }

    "testShared"("junit:junit:4.13")
    "testShared"("org.powermock:powermock-core:2.0.7")
    "testShared"("org.powermock:powermock-api-mockito2:2.0.7")
    "testShared"("org.powermock:powermock-module-junit4:2.0.7")
    "testShared"("org.powermock:powermock-module-junit4-rule:2.0.7")
    "testShared"("org.mockito:mockito-inline:3.5.10")
    "testShared"("io.mockk:mockk:1.10.0")
    "testShared"("io.mockk:mockk-android:1.10.0")
    "testShared"("androidx.test:runner:1.3.0")
    "testShared"("androidx.test.ext:junit:1.1.2")
    "testShared"("androidx.test.espresso:espresso-core:3.3.0")
    "testShared"("androidx.test:core:1.3.0")
    "testShared"("androidx.test:rules:1.3.0")
    "testShared"("android.arch.core:core-testing:1.1.1")
    "testShared"("com.jraska.livedata:testing-ktx:1.1.2")

    "testImplementation"(testShared)
    "testImplementation"("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.3.9")

    "androidTestImplementation"(testShared)
}
