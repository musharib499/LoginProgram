package com.innobles.logicalprogram.kotlin

/**
 * Created by Musharib Ali on 07/11/20.
 * I.S.T Pvt. Ltd
 * musharib.ali@innobles.com
 */


//  High Level function
fun main() {
    // How to use with function
    withFunction()
    applyFunction()
    alsoFunction()
    runFunction()
}

fun withFunction(){
    // Scoop  Function : 'with'
    // Property 1 : Refer the context  object by using 'this'
    // Property 1 : Return value in the 'lambda result'
    var user = UserInfo()
    with(user){
        println(this.name)
        println(this.age)
        println(address)
    }
    // you  want modify age  in same with like

    val age :  Int = with(user){
        print(name)
        age + 5

    }
    print(age.toString())
}

fun applyFunction(){
    // Property 1 : Refer the context  object by using 'this'
    // apply function assign value to function

    var user = UserInfo()
      user.name = "Ali"
     user.age =20

    // how  to solve this problem class instance use  multiple time


    user.apply {
        name = "hello"
        age = 30
    }

}

fun alsoFunction(){
    // Scoop  Function : 'also'
    // Property 1 : Refer the context  object by using 'this'
    // Property 1 : Return value in the 'lambda result'
    // apply function assign value to function

    var user = UserInfo()
    user.name = "Ali"
    user.age =20

    // how  to solve this problem class instance use  multiple time


  var u =  user.also {
        it.name = "hello"
       it.age = 30
    }
    print(u.toString())

}


fun runFunction(){
    // Scoop  Function : 'with'
    // Property 1 : Refer the context  object by using 'this'
    // Property 1 : Return value in the 'lambda result'
    // run function combination  of with and let function llike run = with + it

    var user = UserInfo()
    user.name = "Ali"
    user.age.let { "" }

    // how  to solve this problem class instance use  multiple time


    var u =  user.also {
        it.name = "hello"
        it.age = 30
    }
    print(u.toString())

}



class UserInfo{
    var name  = "Musharb"
    var age = 20
    var address = "Khushhalpur"
    var distic = "Rampur"
}

