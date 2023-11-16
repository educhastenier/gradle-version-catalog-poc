package com.bonitasoft.watch.gradle.versioncatalog

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PocVersionCatalogApplication

fun main(args: Array<String>) {
	runApplication<PocVersionCatalogApplication>(*args)
}
