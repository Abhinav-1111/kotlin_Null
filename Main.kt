fun main(args: Array<String>) {
    var text: String? = null

    text = "This variable is not null"

    val text2: String = text?: "The variable is null"
    println(text2)

//    println(text!!.length) // Another type

//    println(text?.length) // Another type

    // Another type
    
//    if (text != null){
//        println(text.length)
//    }else{
//        println("This is null variable")
//    }
}