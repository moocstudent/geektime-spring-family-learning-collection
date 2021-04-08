package src.dragon

/**
 * @Author: zhangQi
 * @Date: 2020-11-02 10:00
 */
class PersonWho {
    var lastName:String = "Zhang"
        get()=field.toUpperCase() //将变量赋值后转换为大写

    var no: Int = 100
        set(value){
            if(value<10){
                field = value //如果传入的值小于10 返回该值
            }else{
                field = -1 //如果传入的值大于等于10 返回-1
            }
        }

    var heiht: Float = 145.4f
        private set
}

fun main(args: Array<String>){
    var who: PersonWho = PersonWho()

    who.lastName = "C"
    println("lastName:${who.lastName}")

    who.no = 7
    println("no:${who.no}")

    who.no = 20
    println("no:${who.no}")
}