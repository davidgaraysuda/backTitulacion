package ec.edu.sudamericano.practicasys.repository

import ec.edu.sudamericano.practicasys.model.Activity
import ec.edu.sudamericano.practicasys.model.ActivityDetail
import ec.edu.sudamericano.practicasys.model.ActivityDetailView
import ec.edu.sudamericano.practicasys.model.PracticeView
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param

interface ActivityDetailViewRepository: JpaRepository<ActivityDetailView, Long?> {
    fun findById(id: Long?): ActivityDetailView?
    @Query(nativeQuery = true)
    fun listDetailActivity (@Param("detailId") detailId:Long): List<ActivityDetailView>
    /*fun findByDetailActivity (@Param("detailId") detailId:Long): List<ActivityDetailView>*/


}