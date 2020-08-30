package cow

/**
 * @Author: zhangQi
 * @Date: 2020-08-29 21:59
 */
fun variables(){
    val a: Int = 1
    val b = 1
    //be declare then asset
    var c: Int
    c = 1

    var x = 5
    x += 1
    println(a)
    println(b)
    println(c)

    println(x)
}

fun main(){
   variables()
    /**
     * 1
     * 1
     * 1
     * 6
     */
}