import java.lang.Exception

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

// --------------------------------------------------------

    var list = (1..20).toList()
    println(list)
    list = list.filter {iso->iso % 2 == 0}
    println(list)

// --------------------------------------------------------

//    val division = try {
//        divide(5.0, 0.0)
//    } catch (e: DivideByZeroException) {
//        -1.0
//    }
//    println("The result of division is: $division")
// --------------------------------------------------------

//    val a = 4.0
//    val b = 3.0
//    val height = 2.0
//    //object: Shape creates an anonymous class that inherits from Shape
//    val parallelogram = object: Shape("Parallelogram", a, b, height) {
//
//        init {
//            println("Parallelogram created with a=$a b=$b height=$height")
//        }
//        override fun area(): Double {
//            return a * height
//        }
//
//        override fun perimeter(): Double {
//            return 2 * a + 2 * b
//        }
//
//    }

// --------------------------------------------------------

//    var myRect = Rectangles(6.0, 5.0)
//    var myRect2 = Rectangles(4, 5)
//    println("${myRect2.height} - ${myRect2.width}")
//    var myTriangle = Triangle(3.0, 3.0, 3.0)

//    var circle = Circle.randomCircle()
}


class DivideByZeroException: Exception("You cannot divide by zero.")

fun divide(a: Double, b:Double): Double {
    if(b == 0.0) throw DivideByZeroException()
    return a / b
}