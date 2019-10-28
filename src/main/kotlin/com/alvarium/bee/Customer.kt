package com.alvarium.bee

data class Customer (val name: String,
                val age: Int,
                val address: String,
                val minimumAge: Int = 18){

    val nextAge: Int
    get() {
        return age +1
    }

    var approved = false
    set(value) {
        if(age > 18) {
            field = value
        }
        else {
            throw Exception("Customer is only $age, must be at least ")
        }
    }

    fun uppercaseName() =
            name.toUpperCase()

    companion object {
        fun getInstance() = Customer("John", 21, "Rua de Cima nº3")
    }
}