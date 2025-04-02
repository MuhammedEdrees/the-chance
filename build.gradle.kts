plugins {
    kotlin("jvm") version "2.0.20"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

//// ✅ Set Kotlin JVM Target
//kotlin {
//    jvmToolchain(23) // Ensure this matches your Java version (or set it to 22 if needed)
//}
//
//// ✅ Set Java Compatibility Version (if needed)
//tasks.withType<JavaCompile> {
//    sourceCompatibility = "23"
//    targetCompatibility = "23"
//}