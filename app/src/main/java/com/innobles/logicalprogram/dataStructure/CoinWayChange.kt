package com.innobles.logicalprogram.dataStructure

/**
 * Created by Musharib Ali on 28/12/20.
 * I.S.T Pvt. Ltd
 * musharib.ali@innobles.com
 */
fun main() {
    val a = arrayListOf(2,5,3,6)
  print(checkSumNumber(a,a.size,4))
}
fun checkSumNumber(a:ArrayList<Int>,n:Int,sum:Int):Int{
    if (sum==0) return 1
    if (sum<0) return 0
    if (n<=0 && sum>=1) return 0
   return checkSumNumber(a,n-1,sum) + checkSumNumber(a,n,sum - a[n-1])
}