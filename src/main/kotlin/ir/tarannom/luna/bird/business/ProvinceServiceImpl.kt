package ir.tarannom.luna.bird.business

import ir.tarannom.luna.bird.persistence.Province
import ir.tarannom.luna.bird.persistence.ProvinceRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ProvinceServiceImpl : ProvinceService {

    @Autowired
    lateinit var provinceRepository: ProvinceRepository
    override fun saveProvince(name: String): Province {
        val province = Province()
        province.name = name
        return provinceRepository.save(province)
    }

    override fun removeProvince(id: Int) {
        provinceRepository.deleteById(id)
    }

    override fun removeProvince(name: String) {
        provinceRepository.deleteByName(name)
    }
}