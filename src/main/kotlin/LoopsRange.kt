fun main() {
    for (i in 1..5) println(i)  
    println("down to")
    for ( i in 5 downTo 1) println(i)  // reversed printed
    println("steps")
    for (i in 1..10 step 2) println(i) 
    println("steps down to") 
    for ( i in 10 downTo 1 step 3) println(i)  // reversed printed
}