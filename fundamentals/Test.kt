import kotlin.math.PI as pi

fun startsWith(list: List<String>, c: Char) {
    for (item in list) {
        if (item.startsWith(c)) {
            println(item)
        }
    }
}

fun circleArea(r: Int): Double = pi * (r * r)

fun intervalInSeconds(h: Int = 0, m: Int = 0, s: Int = 0): Int {
    return ((h * 60) + m) * 60 + s;
}
fun main() {

    // lists and maps (immutable variable = val)
    val list: List<String> = listOf("test0", "test1", "test2")
    val map: Map<String, Int> = mapOf("apple" to 1, "banana" to 2, "orange" to 3)

    // mutable variables
    var x = 5
    var y = 2

    // range
    val numbers = (1..4)

    // for loop
//    for (number: Int in numbers) {
//      print("Number: $number \n")
//    }

    // call function
    val randomList = listOf<String>("dinosaur", "lemon", "chair", "television")

    val area = circleArea(5)

    val interval = intervalInSeconds(s=10)
    print(interval)

    println({string: String -> string.uppercase()} ("hello, kotlin!"))

}