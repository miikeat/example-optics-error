plugins {
    kotlin("jvm") version "1.5.30"
    kotlin("kapt") version "1.5.30"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.arrow-kt:arrow-optics:0.13.2")
    kapt("io.arrow-kt:arrow-meta:0.13.2")
}
