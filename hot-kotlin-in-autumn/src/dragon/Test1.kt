package src.dragon

/**
 * @Author: zhangQi
 * @Date: 2020-11-02 9:53
 * 在类中定义成员函数
 */
class Test1 {
    val name: String = "香蕉"
    val url: String = "http://hello.com"
    val city: String = "ShangHai"
    //成员函数
    fun foo(){
        print("test1 fun")
    }

    //我们可以像使用普通函数那样使用构造函数创建类实例:
    val site = Test1() //Kotlin中没有new关键字
    //要使用一个属性,只要用名称引用它即可
    fun getFiled(){
        val getname = site.name //使用 . 号来引用
        val geturl = site.url
    }


}