Judul: LatihanArray

Isi:
fun s() {
    val users : Array<String> = arrayOf("User 1", "User 2", "User 3")

    println(users[0])
    println(users.get(1))

    users.set(2, "User 3 Update")
    println(users[2])

    users[2] = "User 3 Update user"
    println(users[2])

    println("Size : ${users.size}")
}

fun main() {
    val hari : Array<String> = arrayOf("Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu")
    println("Jumlah Hari : ${hari.size}")
    println("Hari Pertama : ${hari[0]}")
    println("Hari Terakhir : ${hari[6]}")
    hari.set(4, "Jum'at")
    println("${hari[4]} Barokah")
}