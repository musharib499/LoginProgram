package com.app.logicprogram.oops

/**
 * Created by Musharib Ali on 24/1/21.
 * I.S.T Pvt. Ltd
 * musharib.ali@app.com
 */
fun main() {
    println("String")
    checkString()
    println("\nString Buffer")
    checkStringBuffer()
    println("\nString Builder")
    checkStringBuilder()

    // capacity defult  : 16 , increase size  = (ol)
    /*var a = StringBuffer()
     println("Capacity : ${a.capacity()}")
     a.append("12345678901234567")
    println("Capacity : ${a.capacity()}")
    a.append("123456789012345671")
    a.append("123456789012345671")
    println("Capacity : ${a.capacity()}")
    a.append("123456789012345671")
    println("Capacity : ${a.capacity()}")
    a.append("123456789012345671")

    a.append("123456789012345671")

    a.append("123456789012345671")
    a.append("123456789012345671")
     println("Capacity : ${a.capacity()}")*/




}

fun checkString() {
    //String class is immutable.
    // String is slow and consumes more memory when you concat too many strings because every time it creates new instance.
    //	String class overrides the equals() method of Object class. So you can compare the contents of two strings by equals() method.
    // Return hashcode same when value equal
    var s: String = "Hello"
    println(s.hashCode())

    s += "Bye"
    println(s.hashCode())
    var ss: String = "HelloBye"
    println(ss.hashCode())
    println(s.equals(ss))


}

fun checkStringBuffer() {
    /* StringBuffer class is mutable.
     StringBuffer is synchronized i.e. thread safe. It means two threads can't call the methods of StringBuffer simultaneously.
     StringBuffer is fast and consumes less memory when you cancat strings.
     StringBuffer class doesn't override the equals() method of Object class.*/


    var sb: StringBuffer = StringBuffer("Hello")
    println(sb.hashCode())
    sb.append("Bye")
    println(sb.hashCode())
    var sb1 = StringBuffer("HelloBye")
    println("$sb , $sb1")
    println(sb.equals(sb1)) // not work not override equals method
    println(sb == sb1)
    println()


    // Time

    var startTime = System.currentTimeMillis()
    val sb2 = StringBuffer("Java")
    for (i in 0..9999) {
        sb2.append("Tpoint")
    }
    println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms")


}

fun checkStringBuilder() {
    // StringBuffer vs StringBuilder
    /*StringBuffer
    * StringBuffer is synchronized i.e. thread safe. It means two threads can't call the methods of StringBuffer simultaneously.
    * StringBuffer is less efficient than StringBuilder.
    * */
    /* StringBuilder
    * StringBuilder is non-synchronized i.e. not thread safe. It means two threads can call the methods of StringBuilder simultaneously.
    * StringBuilder is more efficient than StringBuffer.
    * */

    var sb = StringBuilder("Hello")
    println(sb.hashCode())
    sb.append("Bye")
    println(sb.hashCode())
    println()

    var startTime1 = System.currentTimeMillis()
    val sb2 = StringBuilder("Java")
    for (i in 0..9999) {
        sb2.append("Tpoint")
    }
    println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime1) + "ms")


}
