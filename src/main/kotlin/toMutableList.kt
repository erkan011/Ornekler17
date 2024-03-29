fun main() {
    val numbers = listOf(1,2,3,4,5)
    println("ilk Liste: $numbers")

    val mutableListNumbers = numbers.toMutableList()
    mutableListNumbers.add(6)
    mutableListNumbers.remove(3)
    println("Son liste: $mutableListNumbers")
}