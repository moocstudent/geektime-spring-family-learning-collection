package cow

/**
 * @Author: zhangQi
 * @Date: 2020-08-30 15:58
 */
/**
 * getStringLength, but the convert to String is automatic
 */
fun getStringLength(obj: Any): Int? {
    //judgement the type of data : Any
    if (obj is String) {
        return obj.length
    } else if (obj !is String) {
        println("obj is not String")
    } else if (obj is Int) {
        println("obj is Int, get length of obj : Int")
        return obj.length
    } else {
        println("other type don't return length~")
        return null
    }
    return null
}

fun getStringLength1(obj: Any): Int? {
    if(obj is String){
        return obj.length
    }
    return null
}

fun getStringLength2(obj: Any):Int?{
    if(obj !is String){
        return null
    }
    return obj.length
}

fun main(args:Array<String>){
    //变量永远不会被修改，可以使用“val”声明为不可变变量
    val str1 :String = "www.cnblogs.com/ukzq"
    val l1 = getStringLength(str1)
    println(l1)

    val l2 = getStringLength1(str1)
    println(l2)

    val l3 = getStringLength2(str1)
    println(l3)

    val test2 :Long = 20160404
    getStringLength(test2)
    getStringLength1(test2)
    getStringLength2(test2)
}