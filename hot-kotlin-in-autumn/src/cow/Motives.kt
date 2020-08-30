package cow

/**
 * @Author: zhangQi
 * @Date: 2020-08-29 21:36
 */
/**
 * It can be using 'vararg' set more parameters
 * Just like the java (String... args)
 */
fun vars(vararg v:Int){
    for(vt in v){
        print(vt)
    }
}

fun main(args: Array<String>){
    vars(1,2,3,4,5,6)
    //print 123456
}