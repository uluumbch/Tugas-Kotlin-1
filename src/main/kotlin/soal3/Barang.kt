package soal3

class Barang(nama: String="", harga: Int=0, jumlah: Int = 0, diskon: Int = 0) {
    var nama: String = nama
    var harga: Int = harga
    var jumlah: Int = jumlah
    var diskon: Int = diskon

    fun tampil(){
        println("Nama : $nama")
        println("Harga : $harga")
        println("Jumlah : $jumlah")
        println("Diskon : $diskon")
    }

    fun hitungTotal(): Int{
        return harga*jumlah*diskon
    }
}

fun main() {
    var barang1 = Barang("Jajan",2000,3,2)

    barang1.tampil()
    println(barang1.hitungTotal())
}