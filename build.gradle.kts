val cacheDependencies = tasks.register<Sync>("cacheDependencies") {
    into(temporaryDir)
    allprojects {
        val relativePath = projectDir.toRelativeString(rootDir)

        configurations.matching { it.isCanBeResolved }.all config@{
            from(incoming.artifactView { componentFilter { it is ModuleComponentIdentifier } }.files) {
                into("$relativePath/${this@config.name}")
            }
        }
    }
}

tasks.named("prepareKotlinBuildScriptModel") {
    dependsOn(cacheDependencies)
}
