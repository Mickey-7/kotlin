package com.example.kotlin.domain

import javax.persistence.*


@Entity
@Table(name = "article")
class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0
    val title: String = ""
    val content: String = ""
}