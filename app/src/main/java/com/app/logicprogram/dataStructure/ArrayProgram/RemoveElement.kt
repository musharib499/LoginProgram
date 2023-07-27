package com.app.logicprogram.dataStructure.ArrayProgram

fun main() {
    println(removeElement(intArrayOf(3,3),3))
}
fun removeElement(nums: IntArray, `val`: Int): Int {
    if(nums.size == 1 && `val` == nums[0]) return 0
    var count = 0
    var i = 0
    var r = nums.size
    while( i<r) {
        if(`val` == nums[i] && `val` == nums[r-1]) {
            count++
            r--
            continue
        }
        if(`val` == nums[i] && `val` != nums[r-1]) {
            nums[i] = nums[r-1]
            count++
            r--
            i++
        }
    }

    return nums.size-count

}