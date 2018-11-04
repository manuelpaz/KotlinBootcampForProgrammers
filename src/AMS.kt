import java.util.*

fun main(args: Array<String>){
    println("Hello, ")
    feedTheFish()
}
fun feedTheFish(){
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")
}

fun randomDay(): String{
    val week = listOf("Moday", "Tuesday", "Wednesday", "Thursday", "Saturday", "Sunday")
    return week[Random().nextInt(7)]
}

fun fishFood(day: String):String{
    var food =  "fasting"
     when(day){
        "Monday" -> food ="flakes"
        "Tuesday" -> food = "pellets"
       "Wednesday" -> food = "redworms"
       "Thursday" -> food = "granules"
       "Friday" -> food = "mosquitoes"
       "Saturday" -> food = "lettuce"
       "Sunday" -> food = "plankton"
    }
    return food
}