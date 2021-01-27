package dragon

/**
 * @Author: zhangQi
 * @Date: 2020-09-20 18:12
 * Kotlin类可以包含: 构造函数和初始化代码块,函数,属性,内部类,对象声明
 * Kotlin中使用关键字 class 声明类, 后面紧跟类名
 */
class Runoob constructor(name:String){
    var url: String = "https://deadzq.github.io"
    var country: String = "CN"
    var siteName = name

    init{
        println("initialize site name is : ${name}")
    }

    fun printTest(){
        println("我是类的函数")
    }
}

fun main(args: Array<String>) {
    val runoob = Runoob("deadzq的算法网站")
    println(runoob.siteName)
    println(runoob.url)
    println(runoob.country)
    runoob.printTest()
}