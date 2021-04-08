package cow

/**
 * @Author: zhangQi
 * @Date: 2020-08-30 15:04
 */


fun checkNull() {
    //the tyoe String and ? means the variable can be null
    var age: String? = "23"
//    var age: String?  //if not initialize, the age!!.toInt() throws Error must be initialized
    //throw exception
    val ages = age!!.toInt()
    //return null
    val ages1 = age.toInt()
    //if age is null return -1
    val ages2 = age.toInt()

    println(age)
    println(ages)
    println(ages1)
    println(ages2)
}

fun main() {
    checkNull()
    var ele1 = "123"
    var ele2 = "412"
    //make a array using arrayOf(element,element1,...)
    example1(arrayOf(ele1, ele2))
}

//two String params check and parseInt multiply
fun example1(params: Array<String>) {
    if (params.size < 2) {
        println("Two params expected")
        return
    }
    //lambda string -> int
    //toInt() : public actual inline fun String.toInt(): Int = java.lang.Integer.parseInt(this) using java function
    val parseInt: (String) -> Int = { x -> x.toInt() }

    val x = parseInt(params[0])
    val y = parseInt(params[1])

    if (x != null && y != null) {
        println(x * y)
    }
}