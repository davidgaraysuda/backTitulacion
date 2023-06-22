package net.magbdigital.sudapractic.model

import java.sql.Date
import javax.persistence.*

@Entity
@Table(name="specific_agreement")
class Specific {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null
    @Column(name = "sag_status")
    var sagStatus: Boolean? = null
    @Column(name="agreement_id")
    var agreementId:Long?=null
    @Column(name="career_id")
    var careerId:Long?=null
    @Column(name="teacher_id")
    var teacherId:Long?=null
}