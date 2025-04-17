fun main(args: Array<String>) {
    val names: List<String> = listOf(
        "Jamal",
        "Jamila",
        "Yasmine",
        "Kareem",
        "Peter"
    )
    for (name in names) {
        println(name)
    }
    names.forEach { 
        println(it)
     }
}