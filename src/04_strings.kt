fun main(){
    // String
    //  " "
// 	val textString = "Hello"
//     print(textString)
//     print(textString[0])
//     for (char in textString) {
//         print("$char ")
//     }
	
    // Escaped String = \
//     val greeting = "Hello \nI\"m Fikky"
//     print(greeting)
    
//     \t: menambah tab ke dalam teks.
//     \n: membuat baris baru di dalam teks.
//     \b: menghapus satu karakter sebelumnya.
//     \r: menghapus semua karakter sebelumnya.
//     \': menambah karakter single quote kedalam teks.
//     \": menambah karakter double quote kedalam teks.
//     \\: menambah karakter backslash kedalam teks.
    
    // Raw String
//     val line = "Line 1\n" + "Line 2\n" + "Line 3\n" + "Line 4\n"
//     print(line)
	
    val lyrics = """
    	Dan mungkin bila nanti
        kita kan bertemu lagi
        satu pintaku jangan
        kau coba tanyakan kembali
    """.trimIndent()
    
    print(lyrics)
  
}