package ir.tarannom.luna.bird.persistence;

import org.springframework.data.jpa.repository.JpaRepository

interface ProvinceRepository : JpaRepository<Province, Int> {

    fun deleteByName(name: String)
    fun findByName(name: String): Province
}