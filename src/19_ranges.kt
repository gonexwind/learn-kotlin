// RANGE
// 1-10: 1,2,3,...,10
// OPERATOR (..) / rangeTo() dan downTo()

fun main() {
//     val ranges = 1..10
//     val rangesTo = 1.rangeTo(5)
    val rangesDown = 10.downTo(6) step 1
    
    for (i in rangesDown) {
        println(i)
    }
}