package net.magbdigital.sudapractic.service

import net.magbdigital.sudapractic.model.Carrera
import net.magbdigital.sudapractic.model.Company
import net.magbdigital.sudapractic.model.CompanyView
import net.magbdigital.sudapractic.model.Student
import net.magbdigital.sudapractic.repository.CompanyRepository
import net.magbdigital.sudapractic.repository.CompanyViewRepository
import net.magbdigital.sudapractic.repository.StudentRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CompanyService {
    @Autowired
    lateinit var companyRepository: CompanyRepository

    @Autowired
    lateinit var companyViewRepository: CompanyViewRepository

    fun list(): List<Company> {

        return companyRepository.findAll()
    }
    fun listById (id:Long?):Company?{
        return companyRepository.findById(id)
    }

    fun listCompany ():List<CompanyView> {
        return companyViewRepository.findAll()
    }

    fun save(company:Company):Company{
        company.apply {
            coStatus=company.coStatus
        }
        return companyRepository.save(company)
    }

    fun update(company: Company): Company {
        val response =companyRepository.findById(company.id)
        if (response==null){
            throw Exception()
        }else{
            return companyRepository.save(company)
        }
    }

    fun delete(id:Long):Boolean{
        companyRepository.deleteById(id)
        return true
    }
}


