package com.innobles.logicalprogram.graph

import java.util.*
import kotlin.collections.HashMap

/**
 * Created by Musharib Ali on 26/10/20.
 * I.S.T Pvt. Ltd
 * musharib.ali@innobles.com
 */

fun main() {
    addVertices()

}

fun addVertices(){
    var v = 5
    var adj = arrayListOf(hashMapOf<Int,Int>())

    for (i  in 0..4){
        adj.add(hashMapOf<Int,Int>())
    }

    addEdge(adj, 0, 1, 1)
    addEdge(adj, 0, 4,2)
    addEdge(adj, 1, 2,3)
    addEdge(adj, 1, 3,4)
    addEdge(adj, 1, 4,5)
    addEdge(adj, 2, 3,6)
    addEdge(adj, 3, 4,7)
    printGraph(adj,0,3)




}

fun addEdge(adj: ArrayList<HashMap<Int,Int>>, u: Int, v: Int,w:Int){
     adj.get(u).put(v,w)
     adj.get(v).put(u,w)


}

fun printGraph(adj: ArrayList<HashMap<Int,Int>>, v: Int,u: Int) {
    var min = 0
    var has = hashMapOf<Int,Int>()
    for (i in adj.indices) {
        println("\nAdjacency list of vertex $i")
        // if (i == v) {
        print("head")
        if (i >= u) {
            break
        }
        var sum = 0
        for (j in adj[i].keys) {
//            if (j > u || i >= u) {
//                break
//            }
            if (u >= j && i<= j) {
                   println(" pos - - $i--$j ")
                   var value = adj.get(i).get(j) ?: 0
                  has.put(i+j,value)
                   // if (sum >= value) {



            }


        }


    }

    for (i in has){
        println("${i.key} - ${i.value}")
    }

}


