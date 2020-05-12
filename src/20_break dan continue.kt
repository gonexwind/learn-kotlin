// Break dan Continue
// NPE(NULL POINTER EXCEPTION)
fun main() {
    val listAngka = listOf(1, 2, 3, null, 5, 6, null)

//    for (i in listAngka) {
//        if (i == null) continue
//        print(i)
//    }
    for (i in listAngka) {
        if (i == null) break
        print(i)
    }
}