package com.example.grokkingalgorithmsdemo.binarysearch

/**
 * @Author: zhangQi
 * @Date: 2020-09-19 13:57
 */
class BinarySearch {
    
    fun List<Int>.binarySearch(item:Int):Int?{
        var min = 0
        //when this.invoke method,it can be 'lastIndex'
        var max = lastIndex
        while(min<=max){
            val mid = (min+max)/2
            val guess = this[mid]
            if(guess==item)return mid
            if(guess>item)max=mid-1
            else min = mid +1
        }
        return null
    }

    val sortedArray = (0..100 step 3).toList()

    fun test(){
        println(sortedArray)
        val binarySearch = sortedArray.binarySearch ( 6 )
        println(binarySearch)
    }
}

fun main(args: Array<String>) {
    BinarySearch().test()
}