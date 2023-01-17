// Behebe die Compiler-Fehler, sodass der Code ausgeführt werden kann und die Ergebnisse ausgegeben werden.
// Achte darauf, wie die Funktionen geschrieben sind.
fun main() {
    fehler1(4)
    fehler2(5)
    fehler3(5)
    fehler4(5, "Hallo Welt")
}

fun fehler1(zahl2: Int) {    // Es fehlte in Parameter zahl2 : Int
    var zahl1: Int = 10     // Diese Zeile darf nicht verändert werden.
    println(zahl1 * zahl2)  // Diese Zeile darf nicht verändert werden. Hier sollte 40 ausgegeben werden.
}

fun fehler2(zahl2: Int) {     // zahl3
    var zahl1: Int = 10     // Diese Zeile darf nicht verändert werden.
    println(zahl1 / zahl2)  // Diese Zeile darf nicht verändert werden. Hier sollte 2 ausgegeben werden.
}

fun fehler3(zahl2: Int) {    // Boolean
    var zahl1: Int = 10     // Diese Zeile darf nicht verändert werden.
    println(zahl1 / zahl2)  // Diese Zeile darf nicht verändert werden. Hier sollte 2 ausgegeben werden.
}

fun fehler4(zahl2: Int, text: String) {    // tex2: Boolean ist überflüßig
    var zahl1: Int = 10             // Diese Zeile darf nicht verändert werden.
    println(text + (zahl1 / zahl2)) // Diese Zeile darf nicht verändert werden. Hier sollte "Hallo Welt 2" ausgegeben werden.
}