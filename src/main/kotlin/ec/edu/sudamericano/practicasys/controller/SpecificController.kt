package ec.edu.sudamericano.practicasys.controller

import ec.edu.sudamericano.practicasys.model.*
import ec.edu.sudamericano.practicasys.service.SpecificService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/specifics")
@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT,RequestMethod.DELETE])

class SpecificController {
    @Autowired
    lateinit var specificService: SpecificService

    @GetMapping
    fun list(): List<Specific>{
        return specificService.list()
    }

    @GetMapping("/list")
    fun listSpecificFull (): List<SpecificView>{
        return specificService.listSpecific()
    }
    @GetMapping("/{id}")
    fun listById (@PathVariable("id") id: Long): Specific?{
        return specificService.listById(id)
    }


    @PostMapping
    fun save(@RequestBody specific:Specific):Specific{
        return specificService.save(specific)
    }
    @PutMapping
    fun update(@RequestBody specific:Specific): Specific {
        return specificService.save(specific)
    }


    @DeleteMapping("/delete/{id}")
    fun delete(@PathVariable("id") id:Long):Boolean{
        return specificService.delete(id)
    }
}