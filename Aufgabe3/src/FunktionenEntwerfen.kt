fun main() {
    sum(123.45, 76.55)
    subrahieren(7, 4)
    rechenAufgabe(25, 40, 100)
}

// a
fun sum(zahl1: Double, zahl2: Double) {
    println(zahl1 + zahl2)
}

// b
fun subrahieren(zahl1: Int, zahl2: Int) {
    println(zahl1 - zahl2)
}

// c
fun rechenAufgabe(zahl1: Int, zahl2: Int, zahl3: Int) {
    var multiplikation: Int = zahl1 * zahl2
    var subtrahieren: Int = multiplikation - zahl3
    println(subtrahieren)
}