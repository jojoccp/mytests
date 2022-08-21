import java.util.*

fun main() {

    for(i in 1..10){
        println(i)
    }

    println("----------------")

    for(i in 10 downTo 1) {
        println(i)
    }

    println("----------------")

    for(i in 10 downTo 1 step 3){
        println(i)
    }
    println("----------------")

    var size = 15

    for(i in 1 until size){
        println(i)
    }

    println("----------------")
    val binaryReps = TreeMap<Char, String>()

    for(c in 'A'..'F'){
        val binary = Integer.toBinaryString(c.code)
        binaryReps[c] = binary
    }

    for((letter, binary) in binaryReps) {
        println("$letter = $binary")
    }

    println("----------------")
    val list = arrayListOf("10", "11", "1001")

    for((index, element) in list.withIndex()) {
        println("$index: $element")
    }
}