package cow

/**
 * @Author: zhangQi
 * @Date: 2020-08-29 23:06
 */
/**
 * string template ,
 * using 'replace' replacing that string template will create new one
 *
 */
fun template(){
    var a = 1
    //simple name in template
    val s1 = "a is $a"

    a = 2
    //any expression in template
    val s2 = "${s1.replace("is","was")},but now is $a"

    println(s1)

    println(s2)

}

fun main(){
    template()
}