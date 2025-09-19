Judul: WhenExpression

Isi:
fun main() {
    val finalExam = 'A'
    var nilai = 0
    var kuis = 'A'

    when(finalExam) {
        'A' -> println("Lulus")
        'B' -> println("Lulus juga")
        'C' -> println("Ya bisa lulus")
        else -> println("Tidak Lulus")
    }

    when(finalExam) {
        'A', 'B' -> println("Lulus")
        'C' -> println("Ya bisa lulus")
        else -> {
            println("Tidak Lulus")
        }
    }

    when {
        finalExam == 'A' || finalExam == 'B' -> println("Lulus")
        finalExam == 'C' -> println("Ya bisa lulus")
        else -> println("Tidak lulus")
    }

    when (kuis){
        'A' -> nilai = 80
        'B' -> nilai = 60
        'C' -> nilai = 40
        else -> nilai = 20
    }

    println("Nilai : " + nilai)
}