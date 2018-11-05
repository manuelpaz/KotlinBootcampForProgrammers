//Praáctica extra: Use un bucle for para ejecutar el programa 10 veces, o hasta que la fortuna "Take it easy" haya sido seleccionada.
fun main(args: Array<String>){
    var fortune: String
    for (i in 1..10) {
        fortune = getFortuneCookie(getBirthDay())
        println("\nYour fortune is: $fortune")
        if (fortune.contains("Take it easy and enjoy life!") ) break
    }
}
fun getFortuneCookie(birthDay: Int): String{
     val fortunes = listOf("You will have a great day!",
            "Things will go well for you today.",
            "Enjoy a wonderful day of success.",
            "Be humble and all will turn out well.",
            "Today is a good day for exercising restraint",
            "Take it easy and enjoy life!",
            "Treasure your friends because they are your greatest fortune.")

    val index  = when(birthDay){
        in 1..7 -> 4
        28,31 -> 2
        in 25..27 -> 1
        in 8..18 -> 6
        else -> birthDay.rem(fortunes.size)
    }
  return fortunes[index]
}

fun getBirthDay(): Int{
    print("Enter your birthday:")
    return readLine()?.toIntOrNull() ?: 1
}
