package com.example.demo.model

import javax.persistence.*

@Entity
@Table(name = "customer")
class Customer() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id : Long = -1

    @Column(name = "firstName")
    var firstName : String = ""

    @Column(name = "lastName")
    var  lastName : String = ""

    // manually created
    constructor( s: String, s1: String) : this() {
       this.firstName  = s
       this.lastName = s1
    }

    // alt + insert
    override fun toString(): String {
        return "Customer(id=$id, firstName='$firstName', lastName='$lastName')"
    }


}







