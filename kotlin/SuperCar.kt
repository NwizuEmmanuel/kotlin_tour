import kotlin.properties.Delegates

class Car {
    lateinit var name: String
    lateinit var brand: String
    var model by Delegates.notNull<Int>()
}

class SuperCar(var name: String, var brand: String, var model: Int){
    fun driveCar(){
        println("voooom!")
    }

    fun speed(maxSpeed: Int){
        println("Max speed: $maxSpeed")
    }
}