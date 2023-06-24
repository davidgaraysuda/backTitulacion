package ec.edu.sudamericano.practicasys.repository

import ec.edu.sudamericano.practicasys.model.Practice
import ec.edu.sudamericano.practicasys.model.PracticeView
import ec.edu.sudamericano.practicasys.model.Student
import ec.edu.sudamericano.practicasys.model.Tutor
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import java.time.LocalDate
import java.util.*

interface PracticeRepository : JpaRepository<Practice, Long?> {
    fun findById(id: Long?): Practice?

    fun findByStudentIdAndTutorId(studentId: Long, tutorId: Long): Practice

}