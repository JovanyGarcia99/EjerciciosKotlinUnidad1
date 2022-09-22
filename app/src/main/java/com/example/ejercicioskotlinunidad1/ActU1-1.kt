package com.example.sbado17

/*
1.-  Dado un Array ordenado de menor a mayor,
remover los elementos duplicados del array.
input [1,1,1,2,2,2,3,3,3,4,4,4,4,5,5,5,6,6]
output[1,2,3,4,5,6]
*/

fun removeDuplicates(array: IntArray): IntArray {
    return array.distinctBy { it }.toIntArray()
}

fun main() {
    val array: IntArray = intArrayOf(1,1,1,2,2,2,3,3,3,4,4,4,4,5,5,5,6,6)

    val distinct = removeDuplicates(array)

    println(distinct.contentToString())
}