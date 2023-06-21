package net.magbdigital.sudapractic.repository


import net.magbdigital.sudapractic.model.AgreementView
import org.springframework.data.jpa.repository.JpaRepository

interface AgreementViewRepository: JpaRepository<AgreementView, Long?> {
    fun findById(id: Long?): AgreementView?
}