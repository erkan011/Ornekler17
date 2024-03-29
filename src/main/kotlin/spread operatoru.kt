fun sum(numbers: IntArray): Int {
    var result = 0
    for (num in numbers) {
        result += num
    }
    return result
}

fun main() {
    val nums = intArrayOf(1, 2, 3, 4, 5)
    val total = sum(*nums)
    println("Toplam: $total")
}
