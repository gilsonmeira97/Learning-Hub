import java.lang.Exception

abstract  class Shape (
    var name: String,
) {
    constructor(name: String, vararg dimensions: Double): this(name) {}

    init {
        println("I am the super class!")
    }

    fun changeName(newName: String) {
        this.name = newName
    }

    abstract fun area(): Double

    abstract fun perimeter(): Double
}