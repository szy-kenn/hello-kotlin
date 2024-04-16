fun main() {

    val list: List<String> = listOf("test0", "test1", "test2")
    val map: Map<String, Int> = mapOf("apple" to 1, "banana" to 2, "orange" to 3)

    var x = 5
    var y = 2

    val numbers = (1..4)

    for (number: Int in numbers) {
        print("Number: $number \n")
    }
}