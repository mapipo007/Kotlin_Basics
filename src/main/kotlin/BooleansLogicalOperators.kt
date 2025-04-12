fun main() {
    val isAdult = true
    val isFemale = false 
    val isDriver = true

    println(isAdult && isFemale && isDriver)  // both have top be true to have a true result otherwise, its false
    println(isAdult && (!isFemale && isDriver))
    println(isAdult || isFemale || isDriver)  // at least one has to be true to have a true result.
    println(!isAdult)
}