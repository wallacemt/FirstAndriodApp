fun main() {
     var str: String? = null
    str = "Wallace"
    if(str!=null){
        println("Caiu no IF")
    }

    str?.let {
        println("Caiu no LET")
    }


}