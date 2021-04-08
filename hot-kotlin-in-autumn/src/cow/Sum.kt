package cow

/**
 * @Author: zhangQi
 * @Date: 2020-08-29 21:24
 */
/**
 * the params a is a int, b is a int,return a int type
 */
fun sum(a:Int,b:Int):Int{
    return a+b
}

/**
 * functional fun the return type is automated
 */
fun sum1(a:Int,b:Int) = a+b

/**
 * the public fun must be use return type :Int or some else
 */
fun sum2(a:Int,b:Int):Int = a+b

/**
 * Unit means void in java , no return type
 */
fun printSum(a:Int,b:Int):Unit{
    print(a+b)
}

/**
 * if return type is Unit,
 * then can ignore write that,
 * also the public fun
 */
fun printSum2(a:Int,b:Int){
    print(a+b)
}

fun main(){
    println(sum(1,2))
    println(sum1(3,4))
    println(sum2(5,6))

    printSum(1,3)
    println()
    printSum2(1,4)
}