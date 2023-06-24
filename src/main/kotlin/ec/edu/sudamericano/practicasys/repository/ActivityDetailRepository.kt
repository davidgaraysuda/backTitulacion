package ec.edu.sudamericano.practicasys.repository

import ec.edu.sudamericano.practicasys.model.Activity
import ec.edu.sudamericano.practicasys.model.ActivityDetail
import ec.edu.sudamericano.practicasys.model.PracticeView
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param

interface ActivityDetailRepository: JpaRepository<ActivityDetail, Long?> {
    fun findById(id: Long?): ActivityDetail?
    @Query(nativeQuery = true)
    fun listDetailId (@Param("detailId") detailId:Long): List<ActivityDetail>

}