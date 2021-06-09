plugins {
    id("java")
    id("application")
    id("com.github.johnrengelman.shadow") version "6.1.0"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.google.guava:guava:28.1-jre")

    testImplementation("org.assertj:assertj-core:3.19.0")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.5.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.5.2")
}

application {
    mainClass.set("com.brightonsbox.App")
}

val test by tasks.getting(Test::class) {
    useJUnitPlatform()
}
