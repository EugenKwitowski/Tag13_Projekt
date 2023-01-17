fun main() {
    printCity("Berlin")
    printCity("Duisburg")
    printCity("Frankfurt")
}


fun printCity(stadt: String) {
    var städte: MutableList<String> = mutableListOf("Köln", "Hamburg")
    städte.add(stadt)
    println(städte)


}
