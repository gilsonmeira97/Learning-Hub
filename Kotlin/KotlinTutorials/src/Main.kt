fun main() {
    println("Hello World!");
    calc(3, 6);

    println(getMax(1,5,7,9,6,11,154,567,98));

    val testPrime = 12;
    println("The number $testPrime is Prime? ${testPrime.isPrime()}")
}

fun calc(a: Int, b: Int) {
    println(a + b);
}

fun getMax(vararg numbers: Int = intArrayOf(0)): Int {
    var max = numbers[0];
    for(number in numbers) {
        if(number > max) {
            max = number;
        }
    }
    return max;
}

fun Int.isPrime(): Boolean {
    for(n in 2 until this - 1) {
        if(this % n == 0) {
            return false;
        }
    }

    return true;
}