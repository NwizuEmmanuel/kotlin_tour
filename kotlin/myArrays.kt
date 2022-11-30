fun mySimpleArray(){
    var car = arrayOf("Toyota", "Mazda", "Land Rover", "Land Cruiser")

    println("Checking Specified object!\n")
    if("Mandala" in car){
        println("Object exits!")
    }else{
        println("Object not found!")
    }

    println("\nDisplaying all objects!\n")
    for(x in car){
        println(x)
    }
}