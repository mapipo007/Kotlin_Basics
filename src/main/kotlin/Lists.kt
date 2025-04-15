fun main(args: Array<String>) {
    val names: List<String> = listOf(
        "Jamal",
        "Jamila",
        "Yasmine",
        "Kareem",
        "Peter"
    )
    println(names)
    println(names[2])
    println(names.size)
    println(names.contains("Peter"))
    println(names.indexOf("Kareem"))
}