package tiger

/**
 * @Author: zhangQi
 * @Date: 2020-08-30 16:31
 */

fun main(args: Array<String>) {
    for(i in 1..4){
        print("$i ")
    }

    println()

    //set step
    for(i in 1..4 step 2){
        print("$i ")
    }
    //downTo bigger->less
    for(i in 4 downTo 1 step 2){
        print("$i ")
    }

    println()

    //exclusive the number behind until just like i<10
    for (i in 1 until 10){
        print("$i ")
    }

    println()

    val x = 5
    val y = 9
    if(x in 1..8){
        println("$x 在区间内")
    }
}

fun rangeTest2(){
    var arr = 1 .. 10
    for(i in arr){
        println("$i ")
    }
}

//fun concatIntAndSpace(oneInt:Int):String{
//    return oneInt.toString()+" "
//}