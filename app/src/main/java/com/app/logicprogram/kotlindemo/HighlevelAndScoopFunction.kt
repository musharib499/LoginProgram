package com.app.logicprogram.kotlindemo

/**
 * Created by Musharib Ali on 07/11/20.
 * I.S.T Pvt. Ltd
 * musharib.ali@app.com
 */


//  High Level function
fun main() {
    // How to use with function
    println("With ")
    withFunction()
    println("\nApply ")
    applyFunction()
    println("\nAlso ")
    alsoFunction()
    println("\nRun ")
    runFunction()
    println()
    printStar(3)
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

fun applyFunction() {
    // Property 1 : Refer the context  object by using 'this'
    // apply function assign value to function
    // modify value
    //return object

    var user = UserInfo()
    user.name = "Ali"
    user.age = 20



    user.apply {
        name = "hello12"
        age = 30
    }
    print("${user.name},${user.age}")

}

fun alsoFunction(){
    // Scoop  Function : 'also'
    // Property 1 : Refer the context  object by using 'it'
    // Property 1 : Return value in the object

    var user = UserInfo()
    user.name = "Ali"
    user.age =20

    // how  to solve this problem class instance use  multiple time

  var u =  user.also {
        it.name = "hello"
       it.age = 30
      "hello"
    }
    print(u.name)

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


    var u = user.run {
        this.name = "hello"
        this.age = 30
        "My musharib"
    }
    print(u)

}


class UserInfo {
    var name = "Musharb"
    var age = 20
    var address = "Khushhalpur"
    var distic = "Rampur"
}


fun printStar(n: Int) {
    var i = 0
    var k = 1
    while (i < n) {
        var j = 0
        while (j < k) {
            print("*")
            j++
        }
        println()
        i++
        k += 2


    }
}

