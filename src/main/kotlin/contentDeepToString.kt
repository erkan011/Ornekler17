fun main() {
    val numbers = arrayOf(
        arrayOf(1,2,3,4),
        arrayOf(5,6,7,8),
        arrayOf(9,10,11)
    )

    val deepToString = numbers.contentDeepToString()
    println(deepToString)
}