package com.example.domain.entity

data class User (val id:String,
                   val name:String,
                   val surname:String,
                   val imageurl: String,
                   val gender: String,
                   val age:String):DomainEntity {


}