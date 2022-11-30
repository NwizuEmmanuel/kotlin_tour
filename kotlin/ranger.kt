fun myRange(){
    var colCount = 0
    for (x in 'a'..'z'){
        print("$x ")
        colCount++

        if (colCount == 5){
            println("")
            colCount = 0
        }
    }
}