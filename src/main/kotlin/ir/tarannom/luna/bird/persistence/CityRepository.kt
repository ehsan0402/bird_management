package ir.tarannom.luna.bird.persistence;

import org.springframework.data.jpa.repository.JpaRepository

interface CityRepository : JpaRepository<City, Int> {
}