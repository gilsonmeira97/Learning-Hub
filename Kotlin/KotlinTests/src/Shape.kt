abstract open class Shape (
    var name: String,
) {
    init {
        println("I am the super class!")
    }

    fun changeName(newName: String) {
        this.name = newName
    }

    abstract fun area(): Double

    abstract fun perimeter(): Double
}