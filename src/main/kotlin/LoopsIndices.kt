fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5)
    for (n in numbers) println(n)

    val letters = charArrayOf('A', 'B', 'C', 'D', 'E')
    for (index in letters.indices) {
        println("$index - ${letters[index]}")
    }
    println("Reversed")
    for (index in letters.indices.reversed()) {
        println("$index - ${letters[index]}")
    }

}