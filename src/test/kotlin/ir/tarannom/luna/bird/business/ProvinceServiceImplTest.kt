package ir.tarannom.luna.bird.business

import ir.tarannom.luna.bird.persistence.ProvinceRepository
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class ProvinceServiceImplTest {

    @Autowired
    lateinit var provinceService: ProvinceService

    @Autowired
    lateinit var provinceRepository: ProvinceRepository

    @Test
    fun `when a new province is persisted it should be find afterwards by its name`() {
        val provinceName = "Tehran"
        val province = provinceService.saveProvince(provinceName)

        assertThat(province.id).isNotNull
        assertThat(provinceRepository.findByName(provinceName)).isNotNull

    }
}