import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    alias(libs.plugins.springBoot)
    alias(libs.plugins.springDepMgt)
    kotlin("jvm") version "1.9.20"
    kotlin("plugin.spring") version "1.6.21"
}

group = "com.bonitasoft.watch.gradle"
version = "0.0.1-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_11
}

repositories {
    mavenCentral()
}

dependencies {

    implementation(libs.srpingBootStarter)
    implementation("org.jetbrains.kotlin:kotlin-reflect")

    testImplementation(libs.srpingBootStarterTest)
    testImplementation(libs.h2)
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs += "-Xjsr305=strict"
        jvmTarget = "11"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}

