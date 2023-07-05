package ec.edu.sudamericano.practicasys.service

import ec.edu.sudamericano.practicasys.model.Agreement
import ec.edu.sudamericano.practicasys.model.AgreementView
import ec.edu.sudamericano.practicasys.model.dto.AgreementReportsDto
import ec.edu.sudamericano.practicasys.repository.AgreementRepository
import ec.edu.sudamericano.practicasys.repository.AgreementViewRepository
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

    fun reportsAgreement():AgreementReportsDto{
        val response= AgreementReportsDto().apply {
            expired= agreementRepository.countAgreements()
            //soon=agreementRepository.getTotalSoon()
            //current=agreementRepository.getTotalCurrents()
        }
        return response
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


