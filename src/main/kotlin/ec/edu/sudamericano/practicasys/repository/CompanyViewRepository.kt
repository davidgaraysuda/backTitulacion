package net.magbdigital.sudapractic.repository

import net.magbdigital.sudapractic.model.CompanyView
import org.springframework.data.jpa.repository.JpaRepository

interface CompanyViewRepository: JpaRepository<CompanyView, Long?> {
    fun findById(id: Long?): CompanyView?
}