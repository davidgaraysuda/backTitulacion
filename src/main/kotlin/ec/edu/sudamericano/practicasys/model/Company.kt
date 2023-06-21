package net.magbdigital.sudapractic.model

import java.sql.Date
import javax.persistence.*

@Entity
@Table(name="company")
class Company {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null
    var name:String? = null
    var phone:String? = null
    var contact:String? = null
    var coordinates:String? = null
    @Column(name = "co_status")
    var coStatus: Boolean? = null
    @Column(name = "tutor_id")
    var tutorId: Long? = null
}