fun main() {

    var counter = 1

    while (counter <= 100) {

        var fizzbuzzed = false

        if (counter % 3 == 0) {
            print("Fizz")
            fizzbuzzed = true
        }
        if (counter % 5 == 0) {
            print("Buzz")
            fizzbuzzed = true
        }

        counter++

        if (fizzbuzzed) {
            println()
            continue
        }

        println(counter-1)
    }

}