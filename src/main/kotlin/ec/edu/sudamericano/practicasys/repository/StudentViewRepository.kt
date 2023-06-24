package ec.edu.sudamericano.practicasys.repository

import ec.edu.sudamericano.practicasys.model.PracticeView
import ec.edu.sudamericano.practicasys.model.Student
import ec.edu.sudamericano.practicasys.model.StudentView
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param

interface StudentViewRepository: JpaRepository<StudentView, Long?> {
    fun findById(id: Long?): StudentView?
}