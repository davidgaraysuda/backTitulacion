package ec.edu.sudamericano.practicasys.repository

import ec.edu.sudamericano.practicasys.model.Agreement
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query

interface AgreementRepository: JpaRepository<Agreement, Long?> {
    fun findById(id: Long?): Agreement?
    @Query("select count(a) from agreement a where extract(day from(a.end_date-now()))<90")
    fun countAgreements():Long
    //@Query("select count(a) from agreement extract(day from(a.end_date-now()))>0")
    //fun getTotalExpired():Long
    //@Query("select count(*) from agreement where extract(day from(end_date-now()))<0")
    //fun getTotalSoon():Long
}