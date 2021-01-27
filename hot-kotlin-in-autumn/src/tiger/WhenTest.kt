package tiger

/**
 * @Author: zhangQi
 * @Date: 2020-09-20 17:44
 */

fun main(args: Array<String>) {
    val x = 14
    when(x){
        13 -> println("x==13")
        14 -> println("x==14")
        else -> {
            println("x 不是 13 , 也不是14")
        }
    }

    println("If you wish to survive you need to cultivate a strong mental attitude.")

    val num = 1000
    when(num){
        10 -> println("num is 10")
        100 -> println("num is 100")
        1000 -> println("num is 1000")
        else -> println("num is not in distance , please check it again !")
    }
}