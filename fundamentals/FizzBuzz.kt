import kotlin.random.Random
fun fizzbuzz(start: Int, end: Int) {

    var counter = start
    var fizzbuzzed = false
    var first = 3
    var second = 5

    while (counter <= end) {

        if (counter % first == 0) {
            print("Fizz")
            fizzbuzzed = true
        }

        if (counter % second == 0) {
            print("Buzz")
            fizzbuzzed = true
        }

        if (!fizzbuzzed) {
            print(counter)
        }

        println()
        counter++;
        fizzbuzzed = false

    }
}

fun repeatN(n: Int, action: () -> Unit) {
    for (i in 0..n-1) {
        action()
    }
}

data class Employee(val empName: String, var salary: Int)

class RandomEmployeeGenerator(var minSalary: Int, var maxSalary: Int) {

    val generateEmployee = { Employee("Ken", Random.nextInt(minSalary, maxSalary))}
}

fun employeeById(id: Int): Employee? = when(id) {
    1 -> Employee("Mary", 20)
    2 -> null
    3 -> Employee("John", 21)
    4 -> Employee("Ann", 23)
    else -> null
}

fun salaryById(id: Int): Int = (employeeById(id)?.salary) ?: 0

fun main() {
//    fizzbuzz(50, 100)

    val actions = listOf<String>("title", "year", "author")
    val prefix = "https://example.com/book-info"
    val id = 5
    val urls = actions.map { "$prefix/$id/$it" }

    val emp1 = Employee("Mary", 20)
    println(emp1)
    emp1.salary += 10
    println(emp1)

    val empGen = RandomEmployeeGenerator(10, 30)

     println((1..5).sumOf { salaryById(it) })
}