fun main(args: Array<String>) {
    val names = arrayOf("Jamila", "Jamal", "Karim")
    names[1] = "Samira"

    println(names[0])
    println(names[1])
    println(names[2])
    println(names.contentToString())
    println(names.size)

    var arrayOfNulls = arrayOfNulls<String>(5)
    println(arrayOfNulls.contentToString())

    arrayOfNulls.fill("*")
    arrayOfNulls[4] = "Mary"
    println(arrayOfNulls.contentToString())
}