fun main() {
    val name1 = "Saleh"
    val name2 = "Jamila"
    val name3 = String("Saleh".toCharArray())
    
    println("== ${name1 == name3}")
    println("=== ${name1 === name3}")
    println(".equals ${name1.equals(name3)}")
    println("== ${name1 == name2}")
    println("=== ${name1 === name2}")
}