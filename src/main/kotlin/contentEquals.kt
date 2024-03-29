fun main() {
    val array1 = intArrayOf(1,2,3,4,5)
    val array2 = intArrayOf(1,2,3,4,5)
    val array3 = intArrayOf(0,1,2,3,4,5,6,7,8,9)

    val isEqual1 = array1.contentEquals(array2)
    val isEqual2 = array1.contentEquals(array3)

    println("array1 ve array2 eşit mi: $isEqual1")
    println("array1 ve array2 eşit mi: $isEqual2")
}