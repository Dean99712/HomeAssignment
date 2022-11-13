package com.example.homeassignment.model

data class Contact(
    val phoneNumber : String,
    val name : String? = null,
    val email : String? = null,
) {
    constructor(): this("", "" ,"")
}