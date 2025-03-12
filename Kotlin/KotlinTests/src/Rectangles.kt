class Rectangles(
    var width: Double,
    var height: Double
) : Shape("Rectangle") {

    constructor(a: Double) : this(a, a) {

    }

    constructor(a: Int, b:Int) : this(a.toDouble(), b.toDouble()) {
        height *= 2
        width *= 2
    }

    init {
        println("$name created has width: $width and height: $height")
    }

    override fun area() = width * height

    override fun perimeter() = (2 * width) + (2 * height)
}