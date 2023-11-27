plugins {
    id("java")
    id("net.minecraftforge.gradle")
}

group = "com.chaottic"
version = "1.0-SNAPSHOT"

minecraft {
    mappings("snapshot", "20171003-1.12")
    runs {
        create("client") {
            workingDirectory(project.file("run"))

            property("forge.logging.markers", "SCAN,REGISTRIES,REGISTRYDUMP")
            property("forge.logging.console.level", "debug")

            mods {
                create("example") {
                    source(sourceSets["main"])
                }
            }
        }
    }
}

repositories {
    mavenCentral()
}

dependencies {
    minecraft("net.minecraftforge:forge:1.12.2-14.23.5.2860")
    //
    // testImplementation(platform("org.junit:junit-bom:5.9.1"))
    // testImplementation("org.junit.jupiter:junit-jupiter")
    //
    // Remove these comments to add.
    // compileOnly(fg.deobf("com.github.jbredwards:fluidlogged-api:cecb9f6c34"))
}

tasks.test {
    useJUnitPlatform()
}

java {
    withSourcesJar()
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8

    toolchain.languageVersion.set(JavaLanguageVersion.of(8))
}

sourceSets {
    main {
        output.setResourcesDir(output.classesDirs.asPath)
    }
}