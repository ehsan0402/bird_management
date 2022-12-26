package ir.tarannom.luna.bird

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BirdManagementApplication

fun main(args: Array<String>) {
    runApplication<BirdManagementApplication>(*args)
}
