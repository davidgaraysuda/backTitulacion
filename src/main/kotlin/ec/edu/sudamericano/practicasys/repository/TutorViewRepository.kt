package ec.edu.sudamericano.practicasys.repository

import ec.edu.sudamericano.practicasys.model.Student
import ec.edu.sudamericano.practicasys.model.Tutor
import ec.edu.sudamericano.practicasys.model.TutorView
import org.springframework.data.jpa.repository.JpaRepository

interface TutorViewRepository: JpaRepository<TutorView, Long?> {
    fun findById(id: Long?): TutorView?
}