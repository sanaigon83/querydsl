package com.example.querydsl.domain.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Hello(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long
)