package ec.edu.sudamericano.practicasys.model

import javax.persistence.*

@Entity
@Table(name="specific_view")
class SpecificView {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null
    @Column(name = "sag_status")
    var sagStatus: Boolean? = null
    @Column(name="agreement_id")
    var agreementId:Long?=null
    var link:String?=null
    @Column(name="career_id")
    var careerId:Long?=null
    var career:String?=null
    @Column(name="teacher_id")
    var teacherId:Long?=null
    var teacher:String?=null
}