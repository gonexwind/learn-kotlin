// FUNCTIONS = FUNGSI
// cara sederhana untuk mengatur program buatan kita
// 
// fun functionName(param1: Type1, param2: Type2, ...): ReturnType {
//     return result
// }
// 
//  fun setUser(name: String, age: Int): String {
//         return "You are $name and $age old"
//     }
        
//  fun setUser(name: String, age: Int): String = "You are $name and $age's old"
    
    fun printBand(band: String): Unit {
        println("Your favourite band is $band")
    }
    
    fun printHero(hero: String) {
        println("Your favourite hero is $hero")
    }
    
    fun main() {
//         val fikky = setUser("Fikky Ardianto", 20)
//         print(fikky)
        printBand("GreenDay")
        printHero("SpiderMan")
    }