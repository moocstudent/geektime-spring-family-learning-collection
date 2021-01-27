package rabbit

/**
 * @Author: zhangQi
 * @Date: 2020-09-20 17:50
 */

/**
 * for (item in collection) print(item)
 *
 * for (item: Int in ints) {
 *     // ......
 * }
 *
 * for ((index,value) in array.withIndex()){
 *     println("the element at $index is $value")
 * }
*/

fun main(args: Array<String>) {
    val items = listOf("apple","banana","kiwi")
    for (item in items){
        println(item)
    }
    //指数索引 indices
    for(index in items.indices){
        println("item at $index is ${items[index]}")
    }


    /**
     * do...while , while
     */
    var x = 5
    while(x>0){
        println(x--)
    }
    println("----do...while 使用-----")
    var y = 5
    do{
        println(y--)
    }while (y>0)

    println("----while 使用-----")
    var z = 5
    while(z>=0){
        println(z--)
    }


    //
    for (i in 1..10) {
        if (i==3) continue  // i 为 3 时跳过当前循环，继续下一次循环
        println(i)
        if (i>5) break   // i 为 6 时 跳出循环
    }
}