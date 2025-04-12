fun main(args: Array<String>) {
    val input = "M"

    val gender = when(input) {
        "F" -> println("Female")
        "M" -> println("Male")
        else -> {
            println("Unknown gender")
        }
    }

    println(gender)
}
