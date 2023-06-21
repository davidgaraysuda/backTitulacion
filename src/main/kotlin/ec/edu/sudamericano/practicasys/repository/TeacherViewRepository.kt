package net.magbdigital.sudapractic.repository

import net.magbdigital.sudapractic.model.Student
import net.magbdigital.sudapractic.model.Teacher
import net.magbdigital.sudapractic.model.TeacherView
import net.magbdigital.sudapractic.model.Tutor
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.query.Param

interface TeacherViewRepository: JpaRepository<TeacherView, Long?> {
    fun findById(id: Long?): TeacherView?
}