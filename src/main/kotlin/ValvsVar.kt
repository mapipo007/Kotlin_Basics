const val PI = 3.14  // we cannot define const inside a function its always outside opf the function.
val pi = getPIValue()

fun main() {
    var brandVar = "Services"
    brandVar = "Nomae Services"

    val brandVal = "Services"
    // brandVal = "Services Fashion"  // Once val is assigned, its forever. it cannot be re-assigned.

}

fun getPIValue(): Double = 3.14