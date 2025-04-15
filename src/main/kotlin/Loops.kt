fun main(args: Array<String>) {
    val names = listOf("mary", "ali", "alex")
    val numbers = intArrayOf(1, 2, 3, 4, 5)

    println(names)
    for (name in names) {
        val n = name.replaceFirstChar { it.uppercase() }
        println(n)
    }

    for (number in numbers) {
        println(number)
    }
}