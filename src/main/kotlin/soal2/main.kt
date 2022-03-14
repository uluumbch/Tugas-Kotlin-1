package soal2

fun main() {
    val pangkat = {bil1: Double, bil2: Double -> Math.pow(bil1, bil2)}

    println("4 pangkat 3 = ${pangkat(4.0,3.0)}")
}