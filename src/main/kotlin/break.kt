fun main() {
    val numbers = listOf(1,2,3,4,5,6,7,8,9)
    println("İlk Liste: $numbers")

    for (num in numbers){
        if (num == 3){
            break
        }
        println(num)
    }
}