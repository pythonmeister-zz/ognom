package com.pythonmeister.ognom

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication


@SpringBootApplication
class OgnomApplication

fun main(args: Array<String>) {
    runApplication<OgnomApplication>(*args)
}
