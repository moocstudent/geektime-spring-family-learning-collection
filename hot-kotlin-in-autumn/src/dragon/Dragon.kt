package dragon

import src.dragon.DTest

/**
 * @Author: zhangQi
 * @Date: 2020-09-20 18:01
 */
class Dragon {
    lateinit var dtest: DTest

    fun setup(){
        dtest = DTest()
    }

    fun test(){
        dtest.test()
    }

    var lastName: String = "Zhang"
        get() = field.toUpperCase()

    var no: Int = 100
        set(value) {
            if (value < 10) {
                field = value
            } else {
                field = -1
            }
        }

    var heiht: Double = 10000.10
}

fun main(args: Array<String>) {
    var dragon: Dragon = Dragon()

    dragon.lastName = "SayHello"
    println("lastName:${dragon.lastName}")

    dragon.no = 3
    println("no:${dragon.no}")

    dragon.heiht = 29992.123
    println("heiht:${dragon.heiht}")


}