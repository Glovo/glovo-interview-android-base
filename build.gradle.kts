val cacheDependencies = tasks.register<Sync>("cacheDependencies") {
    into(temporaryDir)
    allprojects {
        configurations.matching { it.isCanBeResolved }.all {
            from(incoming.artifactView { componentFilter { it is ModuleComponentIdentifier } }.files) {
                into("$path/$name")
            }
        }
    }
}

tasks.named("prepareKotlinBuildScriptModel") {
    dependsOn(cacheDependencies)
}
