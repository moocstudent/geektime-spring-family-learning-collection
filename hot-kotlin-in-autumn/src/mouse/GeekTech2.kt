package src.mouse

import kotlin.reflect.KClass

/**
 * @Author: zhangQi
 * @Date: 2020-11-25 10:24
 */

var age:Int = 18
var name:String  = "Zhang Qi"
var name2:String? = null


fun testClass(clazz:Class<JavaMain>){
    println(clazz.simpleName)
}

fun testClass(clazz: KClass<KotlinMain>) {
    println(clazz.simpleName)
}

fun main(args: Array<String>) {
    println(name)
    testClass(JavaMain::class.java)
    testClass(KotlinMain::class)
}