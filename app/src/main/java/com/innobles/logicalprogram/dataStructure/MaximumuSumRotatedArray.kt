package com.innobles.logicalprogram.dataStructure

/**
 * Created by Musharib Ali on 12/12/20.
 * I.S.T Pvt. Ltd
 * musharib.ali@innobles.com
 */

fun main() {
  print(maxSum(arrayListOf(1,20,2,10)))
}

fun maxSum(a:ArrayList<Int>):Int{
    var n = a.size
    var curvSum = 0
    var arraySum = 0
    var k = 0

    for (item  in a)
    {
        arraySum += item
        curvSum += item*k
        k++

    }

    var max = curvSum

    for (i in n downTo 1 ){
        curvSum = curvSum + arraySum - n*a[i-1]
        if (curvSum > max)
            max = curvSum
    }


    return max
}