import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    // For build.gradle.kts (Kotlin DSL)
    kotlin("jvm") version "1.6.0"
}

group = "me.iamra"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.1")
}

tasks.test {
    useJUnit()
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}