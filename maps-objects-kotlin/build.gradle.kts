plugins {
    kotlin("jvm") version "1.9.22"
    id("maven-publish")
}

group = "ru.krdpt"
version = "1.0.4"

repositories {
    mavenCentral()
    maven ("https://jitpack.io")
}

dependencies {
    implementation("org.json:json:20231013")
    testImplementation("org.jetbrains.kotlin:kotlin-test")
}

afterEvaluate {
    publishing {
        publications {
            create<MavenPublication>("release") {
                groupId = "com.github.VolanDeMor1"
                artifactId = "maps-objects-kotlin"
                version = project.version as String
            }
        }
    }
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(20)
}