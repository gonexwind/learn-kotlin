fun main(){
	// ARRAY
	// tipe data yg memungkinkan kita untuk menyimpan beberapa objek didalam variabel
	// Array, memiliki fungsi get, set dan size.
	// library function -> arrayOf()
	// 
// 	val array = intArrayOf(1, 3, 5 ,7)
//     print(array[1])
//     
//     intArrayOf()
//     booleanArrayOf()
//     charArrayOf()
//     longArrayOf()
//     shortArrayOf()
//     byteArrayOf()
//     
// 	val mixArray = arrayOf(1, 2, "Tiga", 'E', true)
//     print(mixArray[3])
    
//     val array = intArrayOf(1, 2, 3, 4)
//     array[1] = 23
//     print(array[1])
//     
//     Array() => size sama fungsi lambda
	val kaliBilanganSendiri = Array(4, {i -> i * i})
    // [0, 1, 2, 3]
    print(kaliBilanganSendiri[3])
   
}
