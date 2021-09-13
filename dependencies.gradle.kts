dependencies {
    "implementation"("androidx.appcompat:appcompat:1.3.1")
    "implementation"("androidx.fragment:fragment-ktx:1.3.6")
    "implementation"("androidx.core:core-ktx:1.6.0")
    "implementation"("androidx.recyclerview:recyclerview:1.2.1")
    "implementation"("androidx.cardview:cardview:1.0.0")
    "implementation"("androidx.constraintlayout:constraintlayout:2.0.4")
    "implementation"("androidx.swiperefreshlayout:swiperefreshlayout:1.1.0")
    "implementation"("androidx.lifecycle:lifecycle-viewmodel-ktx:2.3.1")
    "implementation"("androidx.lifecycle:lifecycle-runtime-ktx:2.3.1")
    "implementation"("androidx.lifecycle:lifecycle-livedata-ktx:2.3.1")
    "implementation"("com.google.android.material:material:1.4.0")
    "implementation"("io.reactivex.rxjava2:rxjava:2.2.21")
    "implementation"("io.reactivex.rxjava2:rxandroid:2.1.1")
    "implementation"("io.reactivex.rxjava2:rxkotlin:2.4.0")
    "implementation"("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.5.0")
    "implementation"("com.squareup.retrofit2:retrofit:2.9.0")
    "implementation"("com.squareup.retrofit2:converter-gson:2.9.0")
    "implementation"("com.squareup.retrofit2:adapter-rxjava2:2.6.4")
    "implementation"("com.google.code.gson:gson:2.8.7")
    "implementation"("com.squareup.okhttp3:okhttp:4.9.1")
    "implementation"("com.squareup.okhttp3:okhttp-urlconnection:4.9.1")
    "implementation"("com.squareup.okhttp3:logging-interceptor:4.9.1")

    val testShared by configurations.creating {
        isCanBeConsumed = true
        isCanBeResolved = false
    }

    "testShared"("junit:junit:4.13.2")
    "testShared"("org.mockito:mockito-inline:3.9.0")
    "testShared"("io.mockk:mockk:1.11.0")
    "testShared"("io.mockk:mockk-android:1.11.0")
    "testShared"("androidx.test:runner:1.4.0")
    "testShared"("androidx.test.ext:junit:1.1.3")
    "testShared"("androidx.test.espresso:espresso-core:3.4.0")
    "testShared"("androidx.test:core:1.4.0")
    "testShared"("androidx.test:rules:1.4.0")
    "testShared"("android.arch.core:core-testing:1.1.1")
    "testShared"("com.jraska.livedata:testing-ktx:1.2.0")

    "testImplementation"(testShared)
    "testImplementation"("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.5.0")

    "androidTestImplementation"(testShared)
}
