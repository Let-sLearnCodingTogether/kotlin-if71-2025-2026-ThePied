Judul: ShortCircuit

Isi:
fun main() {
    val isLoggedIn = false

    if (isLoggedIn && (5 / 0 == 0)) {
        //if (isLoggedIn || (5 / 0 == 0))
        println("User has access")
    } else {
        println("Access denied")
    }
}
}