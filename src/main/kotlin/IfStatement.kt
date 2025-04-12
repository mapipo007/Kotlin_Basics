fun main() {
    val n1 = 31
    val n2 = 20

    val value = if (n1 > n2 && n1 <= 30) {
        print(":)")
    } else if (n1 == 100) {
        println("n1 is equal to 100")
    } else if (n1 == 200) {
        println("n1 is equal to 200")
    } else {
        print(":(")
    }
    print(value)
}