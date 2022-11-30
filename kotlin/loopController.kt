fun loopBreaker(){
    var i = 0

    while(i < 10){
        println(i)
        i++
        if(i == 4){
            break
        }
    }
}

fun loopBreaker2(){
    var i = 0

    while(i < 10){
        if(i == 5){
            i++
            continue
        }
        println(i)
        i++
    }
}