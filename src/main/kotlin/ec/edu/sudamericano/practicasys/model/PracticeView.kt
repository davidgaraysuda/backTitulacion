package ec.edu.sudamericano.practicasys.model

import java.util.*
import javax.persistence.*

@Entity
@Table(name="practice_view")
class PracticeView {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null
    @Column(name = "start_date")
    var startDate:Date? = null
    @Column(name = "end_date")
    var endDate:Date? = null
    @Column(name = "total_hours")
    var totalHours: Long? = null
    @Column(name = "student_id")
    var studentId:Long? = null
    var student:String? = null
    var lastname:String?=null
    @Column(name = "tutor_id")
    var tutorId:Long? = null
    var tutor:String? = null
    @Column(name = "teacher_id")
    var teacherId:Long? = null
    var teacher:String? = null
    @Column(name = "activity_id")
    var activityId:Long? = null
    var description:String? = null

    @Column(name = "pra_status")
    var praStatus: Boolean? = null
}