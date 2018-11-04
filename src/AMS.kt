import java.util.*

fun main(args: Array<String>){
    println("Hello, ")
    feedTheFish()
}
fun feedTheFish(){
    val day = randomDay()
    val food = "pellets"
    println("Today is $day and the fish eat $food")
}

fun randomDay(): String{
    val week = listOf("Moday", "Tuesday", "Wednesday", "Thursday", "Saturday", "Sunday")
    return week[Random().nextInt(7)]
}
