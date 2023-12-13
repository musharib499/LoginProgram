package com.app.solid.openClose

class OpenPrinciple {}


interface AddNew {
    fun addNumber(a:Int, b:Int):Int

}

interface AddTwo {
    fun addMultiple(a:Int, b:Int):Int

}

class A : AddNew, AddTwo {
    override fun addNumber(a:Int,b: Int):Int {
        return a+b
    }

    override fun addMultiple(a: Int, b: Int): Int {
        return a*b
    }
}


class Factory {
    companion object {
        fun getValue(type: String, a: Int, b: Int): Int {
            return when (type) {
                "Add" -> A().addNumber(a, b)
                else -> A().addMultiple(10,10)
            }
        }
    }
}

fun main() {
    //val sum = Factory.getValue("add",10,20)

    var obj1 = A1.getInstance()
    var obj2 = A1.getInstance()

    obj1.x = 10
    println(obj2.x)

    getArray(intArrayOf(2,0,5,9,0,3,0,1,5,8,0,6)).apply {
        println(this.contentToString())
    }

}

//[10:30] Anil Choudhary
class A1{

    companion object {
        private var instance:A1? = null
        fun getInstance() :A1{
            if (instance == null) {
                instance = A1()
            }
            return instance as A1
        }
    }
    var x = 0
}

//let obj1 = A()
//let obj2 = A()
//[10:31] Anil Choudhary
//obj1.x = 10
//[10:31] Anil Choudhary
//print(obj2.x)


//Input - [2,0,5,9,0,3,0,1,5,8,0,6]
//Output - [2,5,9,3,1,5,8,6,0,0,0,0]


fun getArray(intArray: IntArray):IntArray {

    var i = 0
    var j = 0
    while (i<intArray.size) {

        if (intArray[i] != 0) {
            intArray[j] = intArray[i]
            j++
        }
        i++
    }

    while(j<intArray.size) {
        intArray[j] = 0
        j++
    }

    return intArray

 // TC = n MC = 1
}