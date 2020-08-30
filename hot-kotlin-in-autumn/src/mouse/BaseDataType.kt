package mouse

/**
 * @Author: zhangQi
 * @Date: 2020-08-30 15:40
 */

fun test1(){
    //Byte 8bit range:-128~127
    println(Byte.MAX_VALUE)
    println(Byte.MIN_VALUE)
    val b : Byte = 2
    println(b)

    //Short 16bit range:-32768~32767
    println(Short.MAX_VALUE)
    println(Short.MIN_VALUE)
    val s : Short = 4
    println(s)

    //Int 32bit range:-2147483648~2147483647
    println(Int.MAX_VALUE)
    println(Int.MIN_VALUE)
    val i : Int = 11
    println(i)

    //Long 64bit range:-9223372036854775807~9223372036854775807
    println(Long.MAX_VALUE)
    println(Long.MIN_VALUE)
    val l : Long = 134
    println(l)

    //Float 32bit range:like java,radix:6 0.111111
    println(Float.MAX_VALUE)
    println(Float.MIN_VALUE)
    val f : Float = 23.21.toFloat()
    println(f)

    //Double 64bit range:like java,radix:15/16 12.11223344556677#
    println(Double.MAX_VALUE)
    println(Double.MIN_VALUE)
    val d : Double = 142.1112124.toDouble()
    println(d)

    //String not a baseData like java
    println(String)
    //if you using "**" the String can store any length
    val str : String = "abcdefg"
    println(str)

    //Boolean
    /**
     * Kotlin have no Boolean !!!
     */
}

fun main(args:Array<String>){
    test1()
}