fun main() {
    val x = "Hello"
    print(x.length)
}

class ChildClass: ParentClass(){
    fun showParentProp(){
        println("Parent Property is x: $x")
    }
}