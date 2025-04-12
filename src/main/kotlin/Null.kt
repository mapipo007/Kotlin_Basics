fun main() {
    var name = "Ahmed"
    println("name in upper Case = ${name.uppercase()}") 
    
    var brand: String? = "Adidas"

    val age = 20
    var message = "Name: $name, Age: $age"

    val email = """ 
        Hello
        how 
        are
        you?
    """.trimIndent()

    println(email)
    println(brand?.uppercase())
    println(name[4])
    println(name.isEmpty())
    println(message)
}

