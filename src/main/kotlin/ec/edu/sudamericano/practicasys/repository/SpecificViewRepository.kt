package net.magbdigital.sudapractic.repository

import net.magbdigital.sudapractic.model.Specific
import net.magbdigital.sudapractic.model.SpecificView
import org.springframework.data.jpa.repository.JpaRepository

interface SpecificViewRepository: JpaRepository<SpecificView, Long?> {
    fun findById(id: Long?): SpecificView?


}