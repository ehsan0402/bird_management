package ir.tarannom.luna.bird.business

import ir.tarannom.luna.bird.persistence.Province

interface ProvinceService {

    fun saveProvince(name: String): Province
    fun removeProvince(id: Int)
    fun removeProvince(name: String)
}