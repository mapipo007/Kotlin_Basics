fun main(args: Array<String>) {
    greet(name = "Jamila", age = 25)
    greet(name = "hatem karim", age = 30)
    greet(name = "Peter", age = 40)

    println(double(n = 20))  // 40
    println(double2(n = 20))  // 40

    // destructuring twoValues and threeValues.
    val (v1, v2) = twoValues()
    println("$v1, $v2")
    val (t1, t2, t3) = threeValues()
    println("$t1, $t2, $t3")
}

fun greet(name: String, age: Int) {
    println("Hello, my name is ${name.uppercase()} and i am $age years old.")
}

fun double(n: Int): Int = n * 2
fun double2(n: Int): Int {
    println()
    return (n * 2)
}

fun twoValues(): Pair<String, Int> = "Amigos" to 20

fun threeValues(): Triple<String, Int, Char> = Triple("hatem", 30, 'Z')