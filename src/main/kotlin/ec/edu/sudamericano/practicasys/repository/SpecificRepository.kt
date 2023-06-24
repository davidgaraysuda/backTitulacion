package ec.edu.sudamericano.practicasys.repository

import ec.edu.sudamericano.practicasys.model.Specific
import org.springframework.data.jpa.repository.JpaRepository

interface SpecificRepository: JpaRepository<Specific, Long?> {
    fun findById(id: Long?): Specific?


}