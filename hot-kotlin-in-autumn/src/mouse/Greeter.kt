package mouse

/**
 * @Author: zhangQi
 * @Date: 2020-08-29 21:15
 */
//this param is String called name , using val
class Greeter(val name:String){
    fun greet(){
        println("Hello,$name")
    }
}

fun main(){
    //create an object dont using "new" XXX
    Greeter("World").greet()
}


/*为什么选择 Kotlin？
简洁: 大大减少样板代码的数量。
安全: 避免空指针异常等整个类的错误。
互操作性: 充分利用 JVM、Android 和浏览器的现有库。
工具友好: 可用任何 Java IDE 或者使用命令行构建。*/
