fun main(args: Array<String>) {
    val names = listOf(
        "Jamila",
        "Jamas",
        "Saleh",
        "Peter"
    )

    val (one, two, _, four) = names  // This method is called Desctructuring 
    println(one)  // jamila
    println(two)  // Jamas
    println(four)  // Peter
    println(names)
}