fun namePrinter(fname: String, lname: String){
    println("$fname $lname")
}

fun agePrinter(age: Int): Int {
    return age
}

fun shortFun(x: Int = 0, y: Int = 0) = (x + y)