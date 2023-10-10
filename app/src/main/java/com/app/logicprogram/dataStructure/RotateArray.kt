package com.app.logicprogram.dataStructure

/**
 * Created by Musharib Ali on 01/01/21.
 * I.S.T Pvt. Ltd
 * musharib.ali@app.com
 */
typealias A1 =(i :Int) -> Boolean
typealias A2 =(i :Int) -> Boolean
fun main() {
    //  print(rotate(intArrayOf(1, 2, 3, 4, 5, 6), 3).contentToString())
   // print(rotateArray(intArrayOf(1, 2, 3, 4, 5, 6), 2).contentToString())
    //  print(rotateArray1(intArrayOf(1, 2, 3, 4, 5, 6,8,9,10), 3).contentToString())
    // print(leftShift(arrayOf(1, 2, 3, 4, 5, 6),2).contentToString())
    // minimumBribes(arrayOf(1, 2, 5, 3, 4, 7, 8, 6))
   // println(rotateArray1(intArrayOf(1,2,3,4,5,6,7),2).contentToString())
//    var p1= Person("Hello")
//    var p2= Person("Hello")
//    println(p1 != p2 && p1.hashCode() ==p2.hashCode())
    val a : A2 = { i-> i%2 == 0}

    var list = listOf<Article>(Article("1","Bye"), Article("2","Bye"), Article(null,"Bye"), Article("Hello",null), Article(null,null), Article("LAST","LastBye") )
    println(filterArticles(list))


}
fun test(a : A1) = a.invoke(1)

data class Person(val name :String)

fun rotate(nums: IntArray, k: Int): IntArray {
    var q = k
    val n = nums.size - 1
    // q is grater than n cover this case modules
    if (q > n) q = q % (n + 1)

    var num = nums
    num = reverse(num, 0, n)
    num = reverse(num, 0, q - 1)
    num = reverse(num, q, n)


    return num
}

/*
* Time complexity : O(n)
Auxiliary Space : O(1)
* */
fun rotateArray(a: IntArray, d: Int): IntArray {
    var i = 0
    while (i < d) {
        var temp = a[i]
        var j = i
        while (j < a.size) {
            var k = j + d
            if (k >= a.size) k -= a.size
            if (k == i) break
            a[j] = a[k]
            // }
            j = k


        }
        a[j] = temp
        i++

    }
    return a
}

fun reverse(nums: IntArray, start: Int, end: Int): IntArray {
    var p = start
    var k = end
    while (p < k) {
        val temp = nums[p]
        nums[p] = nums[k]
        nums[k] = temp
        p++
        k--
    }
    return nums
}

fun leftShift(a: Array<Int>, d: Int): Array<Int> {

    var i = 0

    var s = IntArray(d)
    while (i < d) {
        s[i] = a[i]
        i++
    }
    i = 0
    var k = 0
    while (i < a.size) {
        val r = d + i
        if (r < a.size) {
            a[i] = a[r]
        } else {
            a[i] = s[k]
            k++
        }
        i++
    }

    return a
}

fun minimumBribes(q: Array<Int>) {
    var n = q.size
    var i = 0
    var k = 0
    println(q.contentToString())
    while (i < (n - 1)) {
        if (q[i] > q[i + 1]) {
            var diff = q[i] - q[i + 1]
            q[i] = q[i] + q[i + 1]
            q[i + 1] = q[i] - q[i + 1]
            q[i] = q[i] - q[i + 1]
            if (diff > 1) {
                i -= diff
            }
            if (i <= 0) i = 0
            k++
        }

        i += 1

    }
    println(q.contentToString())
    if (k < 1) println("Too chaotic") else println(k)


}


fun rotateDegree(a:IntArray,degree:Int):IntArray{
    val d =  if (degree>a.size) degree%a.size else degree
    var j = 0
    var k = 0
     for (i in 0..d) {
         var temp = a[i]
         j = i

         while (j<a.size) {
              k = j + d
             if (k >= a.size) k -= a.size
             if (k == i) break
             a[j] = a[k]
             j = k
         }
         a[j] = temp
     }


    return a
}

fun getDegree(d:Int,n:Int):Int{
    if (n == 0) return d
     return getDegree(d,d%n)
}

fun rotateArray1(nums: IntArray, k: Int): IntArray {
    val aa = IntArray(nums.size)
    if(k>=nums.size) return nums
    if(k == nums.size) return nums
    val d = nums.size - k
    var p = 0
    for(i in d..nums.size-1){
        aa[p] = nums[i]
        p++
    }

    for(i in 0..d-1){
        aa[p] = nums[i]
        p++
    }

    return aa



}

data class Article(val title: String?, val storyTitle: String?)

fun filterArticles(articles: List<Article>): List<String> {
    return articles.filter { article ->
        when {
            article.title != null -> true
            article.storyTitle != null -> true
            else -> false
        }
    }.mapNotNull { article ->
        when {
            article.title != null -> article.title
            article.storyTitle != null -> article.storyTitle
            else -> null
        }
    }
}






