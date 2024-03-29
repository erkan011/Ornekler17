fun sum (vararg number: Int): Int{

    var result = 0
    for (num in number) {
        result += num
    }
    return result
}
fun main() {
    val total = sum(1,2,3,4,5,6,7,8,9)
    println("Toplam: $total")
}