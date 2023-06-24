package ec.edu.sudamericano.practicasys.repository

import ec.edu.sudamericano.practicasys.model.Student
import ec.edu.sudamericano.practicasys.model.Teacher
import ec.edu.sudamericano.practicasys.model.Tutor
import org.springframework.data.jpa.repository.JpaRepository

interface TeacherRepository: JpaRepository<Teacher, Long?> {
    fun findById(id: Long?): Teacher?
}