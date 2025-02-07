val cacheDependencies by tasks.registering {
    allprojects {
        dependsOn("$path:dependencies")
    }
}

tasks.named("prepareKotlinBuildScriptModel") {
    dependsOn(cacheDependencies)
}
