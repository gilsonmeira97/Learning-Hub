import kotlin.random.Random

class Circle(
    val radius: Double
): Shape("Circle") {

    companion object{
        fun randomCircle(): Circle {
            val randomRadius = Random.nextDouble(1.0, 10.0)
            return Circle(randomRadius)
        }
    }

    init {
        println("$name is created with $radius of radius")
    }

    override fun area(): Double {
        return radius * radius * ImportantNumber.PI
    }

    override fun perimeter(): Double {
        return 2 * radius * ImportantNumber.PI
    }


}