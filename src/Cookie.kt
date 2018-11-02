//Cree un programa con una función que devuelva un mensaje de cookie de fortuna que pueda imprimir.
//Crear una función main ().
//Desde la función main (), llame a una función, getFortuneCookie (), que devuelve una cadena.
//Cree una función getFortuneCookie () que no tome argumentos y devuelva un String.
//En el cuerpo de getFortuneCookie (), crea una lista de fortunas. Aquí hay algunas ideas:
//"You will have a great day!"
//"Things will go well for you today."
//"Enjoy a wonderful day of success."
//"Be humble and all will turn out well."
//"Today is a good day for exercising restraint."
//"Take it easy and enjoy life!"
//"Treasure your friends because they are your greatest fortune."
//Sugerencia: use print (), no println ()
//Crear una variable, birthday.
//Lea la entrada del usuario de la entrada estándar y asígnele a birthday Si no hay una entrada válida, establezca birthday en 1.
//Sugerencia: use readLine () para leer una línea de entrada (completada con Enter) como una cadena.
//Sugerencia: en Kotlin, puede usar toIntOrNull () para convertir un número como una cadena a un número
// entero. Si el usuario ingresa "", toIntOrNull devuelve nulo.
//Sugerencia: compruebe si hay null utilizando el ? Operador y use el operador?: para manejar el caso nulo.
//Divida birthay por el número de fortunes y use el resto como el índice de la fortuna para regresar.
//retorna fortune.
//En main (), escriba: "Your fortune is:", seguida de la cadena de fortune.
fun main(args: Array<String>){
        println("\nYour fortune is: ${getFortuneCookie()}")
}
fun getFortuneCookie(): String{
    val fortunes = listOf("You will have a great day!",
            "Things will go well for you today.",
            "Enjoy a wonderful day of success.",
            "Be humble and all will turn out well.",
            "Today is a good day for exercising restraint",
            "Take it easy and enjoy life!",
            "Treasure your friends because they are your greatest fortune.")
    print("Enter your birthday:")
    val birthday = readLine()?.toIntOrNull() ?: 1
    return fortunes[birthday.rem(fortunes.size)]
}