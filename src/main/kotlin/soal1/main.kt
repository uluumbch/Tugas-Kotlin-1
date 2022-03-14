package soal1

import kotlin.math.sqrt

fun main() {
    println(jarak(2,3,8,7))
    println(jarak(3,6,3,7))
}


fun jarak(x1:Int, x2: Int, y1: Int, y2: Int): Double {
    var a = (x2-x1)*(x2-x1)
    var b = (y2-y1)*(y2-y1)
    return sqrt((a+b).toDouble())
}