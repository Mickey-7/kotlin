package com.example.demo.repository

import com.example.demo.model.Customer
import org.springframework.data.repository.CrudRepository

interface CustomerRepository : CrudRepository<Customer, Long> {
    fun findByLastName(lastName : String) : List<Customer>
}