fun main(args: Array<String>) {

    //Task 2
    println("What Is your name?")
    val name = readln()
    println("Hello, $name")

    //Task 4
    print("Enter a number: ")

    val stringInput = readLine()!!

    var integer:Int = stringInput.toInt()
    println("You entered: $integer")

    //Task 5
    val first = 7
    val second = 14

    val sum = first + second

    println("The sum is: $sum")

    //Task 6
    val ch = 'i'
    val vowelConsonant = if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')  "vowel" else "consonant"
    println("$ch is a $vowelConsonant")


    //Task 7
    val cj = 'z'
    when (cj){
        'a', 'e', 'i', 'o', 'u' -> println("$cj is a vowel")
        else -> println("$cj is a consonant")
    }

    //Task 8
    val year = 1900
    var leap = false

    if (year % 4 ==0){
        if (year % 100 ==0){
            leap = year % 400 == 0
        }
        else
            leap = true
    }
    else
        leap = false

    println(if (leap) "$year is a leap year." else "$year is not a leap year.")

}