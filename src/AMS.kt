import java.util.*

fun main(args: Array<String>){
    println("Hello, ")
    feedTheFish()
}
fun shouldChangeWater(
        day: String,
        temperature: Int = 22,
        dirty: Int = 20): Boolean{
    return true
}

fun shouldChangeWater2(
        temperature: Int = 22,
        dirty: Int = 20,
        day: String){

}

fun feedTheFish(){
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")
    //Podemos llamar la función con tres argumentos en el orden correcto
    shouldChangeWater(day, 20, 50)
    //Podemos llamar la función con sólo los argumentos requeridos, y usar sus valores por defecto para temperatura y suciedad
    shouldChangeWater(day)
    //Podemos establecer sólo uno o cualquiera de los valores especificando el nombre del argumento
    shouldChangeWater(day, dirty = 50)
    //Si solo se llamara la función enviando Monday sin especificar que corresponde a day se daria un error de compilador
    /*shouldChangeWater2("Moday") error */
    //Así que se tiene que llamar especificando qué Monday es day
    shouldChangeWater2(day = "Moday")

    if (shouldChangeWater(day)){
        println("Change the water today")
    }
}
fun swim(time: Int, speed: String = "fast"){
    println("swimming $speed")
}


fun randomDay(): String{
    val week = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Saturday", "Sunday")
    return week[Random().nextInt(7)]
}

fun fishFood(day: String):String{
    return when(day){
        "Monday" -> "flakes"
        "Tuesday" ->  "pellets"
       "Wednesday" -> "redworms"
       "Thursday" -> "granules"
       "Friday" -> "mosquitoes"
       "Saturday" -> "lettuce"
       "Sunday" -> "plankton"
        else -> "fasting"
    }
}