package ir.tarannom.luna.bird

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableEncryptableProperties
class BirdManagementApplication

fun main(args: Array<String>) {
    runApplication<BirdManagementApplication>(*args)
}
