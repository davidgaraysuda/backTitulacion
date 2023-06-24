package ec.edu.sudamericano.practicasys.service

import ec.edu.sudamericano.practicasys.model.Specific
import ec.edu.sudamericano.practicasys.model.SpecificView
import ec.edu.sudamericano.practicasys.model.TeacherView
import ec.edu.sudamericano.practicasys.repository.SpecificRepository
import ec.edu.sudamericano.practicasys.repository.SpecificViewRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class SpecificService {
    @Autowired
    lateinit var specificRepository: SpecificRepository
    @Autowired
    lateinit var specificViewRepository: SpecificViewRepository


    fun list(): List<Specific> {

        return specificRepository.findAll()
    }

    fun listSpecific (): List<SpecificView>{
        return specificViewRepository.findAll()
    }
    fun listById (id:Long?): Specific?{
        return specificRepository.findById(id)
    }

    fun save(specific:Specific):Specific{
        specific.apply {
            sagStatus=specific.sagStatus
        }
        return specificRepository.save(specific)
    }
    fun update(specific:Specific): Specific {
        val response =specificRepository.findById(specific.id)
        if (response==null){
            throw Exception()
        }else{
            return specificRepository.save(specific)
        }
    }

    fun delete(id:Long):Boolean{
        specificRepository.deleteById(id)
        return true
    }
}


