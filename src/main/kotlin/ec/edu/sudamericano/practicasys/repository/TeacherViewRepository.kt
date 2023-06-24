package ec.edu.sudamericano.practicasys.repository

import ec.edu.sudamericano.practicasys.model.Student
import ec.edu.sudamericano.practicasys.model.Teacher
import ec.edu.sudamericano.practicasys.model.TeacherView
import ec.edu.sudamericano.practicasys.model.Tutor
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.query.Param

interface TeacherViewRepository: JpaRepository<TeacherView, Long?> {
    fun findById(id: Long?): TeacherView?
}