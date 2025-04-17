fun main() {
    var number1: Int = 1
    while (number1 <= 5) {
        println("Number: $number1")
        ++ number1
    }

    var number: Int = 5
    while (number >= 0) {
        println("Number: $number")
        -- number
    }

    val brand = "nomaeservices"
    var index = brand.length - 1
    while (index >= 0) {
        println("${brand[index]}")
        --index
    }
}