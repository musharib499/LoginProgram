package com.innobles.logicalprogram.dataStructure

/**
 * Created by Musharib Ali on 27/10/20.
 * I.S.T Pvt. Ltd
 * musharib.ali@innobles.com
 */
fun main() {
    val numbers = mutableListOf(38,27,43,3,9,82,10)
    val sortedList = mergeSort(numbers)
    println("Unsorted: $numbers")
    println("Sorted: $sortedList")
}


fun mergeSort(list: List<Int>): List<Int> {
    if (list.size <= 1) {
        return list
    }

    val middle = list.size / 2
    val left = list.subList(0,middle)
    val right = list.subList(middle,list.size)

    return merge(mergeSort(left), mergeSort(right))
}


fun merge(left: List<Int>, right: List<Int>): List<Int>  {
    if (left.size == 0) return  right
    if (right.size == 0) return  left
    var indexLeft = 0
    var indexRight = 0
    val newList : MutableList<Int> = mutableListOf()

    while (indexLeft < left.count() && indexRight < right.count()) {
        if (  left[indexLeft] <= right[indexRight]) {
            newList.add(left[indexLeft])
            indexLeft++
        } else {
            newList.add(right[indexRight])
            indexRight++
        }
    }

    while (indexLeft < left.size) {
        newList.add(left[indexLeft])
        indexLeft++
    }

    while (indexRight < right.size) {
        newList.add(right[indexRight])
        indexRight++
    }

    return newList
}

