package net.magbdigital.sudapractic.service
import net.magbdigital.sudapractic.model.Agreement
import net.magbdigital.sudapractic.model.AgreementView
import net.magbdigital.sudapractic.repository.AgreementRepository
import net.magbdigital.sudapractic.repository.AgreementViewRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class AgreementService {
    @Autowired
    lateinit var agreementRepository: AgreementRepository
    @Autowired
    lateinit var agreementViewRepository: AgreementViewRepository

    fun list(): List<Agreement> {
        return agreementRepository.findAll()
    }
    fun listById (id:Long?): Agreement ?{
        return agreementRepository.findById(id)
    }

    fun listFull(): List<AgreementView> {
        return agreementViewRepository.findAll()
    }

    fun save(agreement : Agreement ):Agreement {
        return agreementRepository.save(agreement )
    }

    fun update(agreement : Agreement ):Agreement {
        val response =agreementRepository.findById(agreement .id)
        if (response==null){
            throw Exception()
        }else{
            return agreementRepository.save(agreement )
        }
    }

    fun delete(id:Long):Boolean{
        agreementRepository.deleteById(id)
        return true
    }
}


