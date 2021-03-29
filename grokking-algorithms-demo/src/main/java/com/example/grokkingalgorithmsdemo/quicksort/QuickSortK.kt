package com.example.grokkingalgorithmsdemo.quicksort

/**
 * @Author: zhangQi
 * @Date: 2021-03-03 12:07
 */
class QuickSortK {

    fun quickSort(list: List<Int>): List<Int> {
        if (list.size < 2) return list

        val pivot = list[list.size / 2]
        val equal = list.filter { it == pivot }
        val less = list.filter { it < pivot }
        val greater = list.filter { it > pivot }
        return quickSort(less) + equal + quickSort(greater)
    }

    fun printSort() = println(quickSort(listOf(10, 5, 2, 3)))

}

fun main(args: Array<String>) {
    QuickSortK().printSort()
}


