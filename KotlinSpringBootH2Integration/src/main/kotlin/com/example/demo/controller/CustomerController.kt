package com.example.demo.controller

import com.example.demo.model.Customer
import com.example.demo.repository.CustomerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class CustomerController {
    // invoke repository
    @Autowired
    lateinit var repository: CustomerRepository

    @RequestMapping("/save")
    fun process(): String {
        repository.save(Customer( "Jack","Smith"))
        repository.save(Customer( "Adam", "William"))
        repository.save(Customer( "Kim", "David"))
        return "Done"
    }

    @RequestMapping("/findAll")
    fun findAll():String{
        var result = ""
        for (customer in repository.findAll()) {
            result += "$customer</br>"
        }
        return result
    }

    @RequestMapping("/findById")
    fun findById(@RequestParam id : Long) : String{
        return repository.findById(id).toString()
    }

    @RequestMapping("/findByLastName")
    fun fetchDataByLastName(@RequestParam lastName : String): String{
        var result = "";
        for (customer in repository.findByLastName(lastName)){
            result += "$customer</br>"
        }
        return  result
    }


}