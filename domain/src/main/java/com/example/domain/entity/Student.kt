package com.example.domain.entity

data class Student(val id:String,
                   val name:String,
                   val surname:String,
                   val imageurl: String,
                   val gender: String,
                   val age:Int):DomainEntity {


}