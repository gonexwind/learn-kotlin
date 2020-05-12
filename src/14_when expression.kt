fun main() {
  // When Expression
    
//     val value = 4
    
//     when(value) {
//         1 -> println("Satu")
//         2 -> println("Dua")
//         3 -> println("Tiga")
//         else -> println("Others")
//     }
//     
    val value: Any = '4'
    when(value) {
        is String -> println("String")
        is Int -> println("Int")
        is Double -> println("Double")
        else -> println("Others")
    }
    
}

