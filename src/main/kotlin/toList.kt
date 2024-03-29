fun main() {
    val mutableNumbers = mutableListOf(1,2,3,4,5)
    val immutableNumbers = mutableNumbers.toList()

    mutableNumbers.add(6) //değiştirilebilir
    //immutableNumbers.add(5) //değiştirilemez

    println("değiştirilebilir liste: $mutableNumbers")
    println("değiştirilemez liste: $immutableNumbers")

}