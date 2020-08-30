package cow

/**
 * @Author: zhangQi
 * @Date: 2020-08-29 21:39
 */
//using lambda to do Math
fun main(){
    /**
     * val one sumLambda: get two params Int,Int -> then
     * response Int type value, this value is the x,y->x+y make sum
     * {x,y->x+y}
     */
    val sumLambda: (Int,Int) -> Int = {x,y -> x+y}
    /**
     * so you can saw 3
     */
    println(sumLambda(1,2))
}