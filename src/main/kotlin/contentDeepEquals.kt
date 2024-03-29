fun main() {
    val array1 = arrayOf(arrayOf(1,2,3), arrayOf(4,5,6))
    val array2 = arrayOf(arrayOf(1,2,3), arrayOf(4,5,6))
    val array3 = arrayOf(arrayOf(1,2,3), arrayOf(4,5,7))

    val isEquals1 = array1.contentDeepEquals(array2)
    val isEquals2 = array1.contentDeepEquals(array3)

    println("array1 ve array2 eşit mi: $isEquals1")
    println("array1 ve array3 eşit mi: $isEquals2")
}