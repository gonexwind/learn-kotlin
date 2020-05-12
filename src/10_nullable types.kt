fun main() {
	
    // Nullable Types
    // NullPointerException(NPE) => THE BILLION DOLLAR MISTAKE
    
//     var text: String = null
    var text: String? = null
    
    text = "Shadow"
    
    if (text != null) {
    	val textLength = text.length
        print(textLength)
    }
    
}
