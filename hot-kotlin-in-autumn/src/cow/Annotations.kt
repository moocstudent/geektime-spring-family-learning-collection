package cow

/**
 * @Author: zhangQi
 * @Date: 2020-08-29 22:56
 */
//just like java
fun singleAnnotation(){
    //single annotation

    /*val hello:(String) -> Unit = {x->x+" ~~~"}
    * the block annotation,it can be log kotlin.Unit */
    val hello:(String) -> String = {x->x+" ~~~"}
    print(hello("你好呀"))
}

fun main(){
    singleAnnotation()
    //single annotation,sysout: the variables "你好呀 ~~~"from lambda val
}



