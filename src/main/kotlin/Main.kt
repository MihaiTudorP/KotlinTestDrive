fun main() {
    val userName = "Mihai"
    var age = 22

    sayHello(userName, age);

    val hasInternetConnection = true

    if (hasInternetConnection) {
        getData("someData")
    } else {
        showMessage()
    }

    println(getMax(6, 8))
    println(getMax(6.5, 8.2))
    println(getMax(3, 5, 1))

    sendMessage();
    sendMessage("Alexa", "Test message")
    sendMessage(message = "Test message")

    println(sum(1, 2, 5, 12, 100, -9, 7))

    for (i in 1 until 20) {
        println(i)
    }

    for (i in 1 until 20 step 5) {
        println(i)
    }

    for (i in 20..1) {
        println(i)
    }

    printNumbersWhile(10)
    printNumbersDoWhile(10)
}

fun sayHello(name: String, age: Int) {
    println("Hello $name! Your age is $age.")
}

fun getData(data: String) {
    println("Your data is: $data")
}

fun showMessage() {
    println("No internet connection")
}

fun getMax(a: Int, b: Int): Int = if (a > b) a else b
fun getMax(a: Double, b: Double): Double = if (a > b) a else b

fun getMax(a: Int, b: Int, c: Int): Int {
    return if (a >= b && a >= c)
        a
    else if (b >= a && b >= c)
        b
    else
        c
}

fun sendMessage(name: String = "User", message: String = sendText()) {
    println("Sending message \"$message\" to $name")
}

fun sendText(): String = "Some text"

fun sum(vararg numbers: Int): Int {
    var result = 0;
    for (number in numbers) {
        result += number
    }
    return result
}

fun printNumbersWhile(howMany: Int) {
    var number = 0
    while (number < howMany) println(number++)
}

fun printNumbersDoWhile(howMany: Int) {
    var number = 0
    do {
        if (number == 7) {
            number++
            continue
        }
        println(number++)
    } while (number < howMany)
}

/// instead of switch we have when. It supports ranges of values