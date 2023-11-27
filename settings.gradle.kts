pluginManagement {
	repositories {
		gradlePluginPortal()
		mavenCentral()
		maven("https://files.minecraftforge.net/maven/")
	}
	plugins {
		id("net.minecraftforge.gradle") version "6.0.+"
	}
}
rootProject.name = "example"

