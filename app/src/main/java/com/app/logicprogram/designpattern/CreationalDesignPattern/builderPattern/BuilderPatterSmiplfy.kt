package com.app.logicprogram.designpattern.CreationalDesignPattern.builderPattern

fun main() {
    val user = UserBuilder()
        .name("Mushareb")
        .address("Delhi")
        .email("ali.musharib1@gmail.com")
        .build()
    println(user.toString())

}

class User {
    var name:String? = null
    var email :String? = null
    var address :String? = null
    var age :Int? = 0
    override fun toString(): String {
        return "User(name='$name', email='$email', age=$age, address='$address')"
    }
}

interface Builder {
    fun name(name: String) : Builder
    fun address(address: String) : Builder
    fun age(age: Int) : Builder
    fun email(email: String) : Builder
    fun build() : User
}

class UserBuilder : Builder {
    private val user  = User()

   override fun name(name:String) : UserBuilder {
        user.name = name
        return this
    }
   override fun email(email:String) : UserBuilder {
        user.email = email
        return this
    }

   override fun address(address:String) : UserBuilder {
        user.address = address
        return this
    }
   override fun age(age:Int) : UserBuilder {
        user.age = age
        return this
    }

   override fun build(): User {
        return user
    }

}