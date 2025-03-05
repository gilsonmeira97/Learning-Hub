fun main() {
    println("Hello World!");
    var myVariable: Int = 5;
    val myNum = 7; // Kotlin has automatic type inference
    //myNum = 15; // val is a constant
    println(myVariable);
    println("The value of our variable is: $myNum");
    print("The sum is: ${9 + 8}");
    println(true && true && false||true);
    //val userInput = readLine();
    //println(userInput?.uppercase());
    //println(userInput + 5);

    val myArray = arrayOf("Hello", "How are you?")
    myArray.forEach { on -> println(on) };
    val myList = listOf(7,8,9,10); // you can append items to list, but not on array

    val myMutableList = mutableListOf(2, 3, 4, 5);
    myArray[0] = "Hi";
    myMutableList.add(35);
    myMutableList.add(4);
    myMutableList.remove(4);
    println(myMutableList);

    //myList[0] = 5; // List is immutable, you can use mutableList to be able to change values

    // Using WHEN

    val age = readLine()?.toInt()

    when(age) {
        in 0..5 -> println("You are the young kid");
        in 6..17 -> println("You are a teenager");
        18 -> println("Finally, you're 18");
        19, 20 -> println("You're a young adult");
        in 21..65 -> println("You're an adult");
        else -> println("You're really old")
    }
}