package tiger

/**
 * @Author: zhangQi
 * @Date: 2020-08-31 10:17
 */
/**
 * quick main using maina tab
 */
fun main(args: Array<String>) {
    //stand
    var a = 100
    var b = 101
    var max = a
    if (a < b) max = b

    //using else
    var maX : Int
    if(a>b){
        maX=a
    }else{
        maX=b
    }

    //expression
    val MAX = if(a>b) a else b

    println("a=$a, b=$b. max=$max , maX=$maX , MAX=$MAX")
}