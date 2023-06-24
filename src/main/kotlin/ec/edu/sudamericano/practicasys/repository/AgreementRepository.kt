package ec.edu.sudamericano.practicasys.repository

import ec.edu.sudamericano.practicasys.model.Agreement
import org.springframework.data.jpa.repository.JpaRepository

interface AgreementRepository: JpaRepository<Agreement, Long?> {
    fun findById(id: Long?): Agreement?
}