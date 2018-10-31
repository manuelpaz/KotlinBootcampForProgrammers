import java.util.*

fun main(args: Array<String>){
    println("Hello, world!")
    dayOfWeek()
}

fun dayOfWeek(){
    println("What day is it today?")
    //Mi solución
    println("Today is: ${when(Calendar.getInstance().get(Calendar.DAY_OF_WEEK)){
        1->"Sunday"
        2->"Monday"
        3->"Tuesday"
        4->"Wednesday"
        5->"Thursday"
        6->"Friday"
        7->"Saturday"
        else -> ""
    }}")
}
/*Extended Task
In the body of the dayOfWeek() function, answer the question by printing the current day of the week.

Hints
You can use Java libraries (java.util) from Kotlin. For example, to get the day of the week:
Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
Type in the code, then press Option + Enter in Mac, or Alt + Enter in Windows, over the red Calendar class to import the library.
Use a when statement to print a string depending on the day. Sunday is the first day of the week.*/

//fun dayOfWeek() {
//   println("What day is it today?")
//   val day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
//   println( when (day) {
//      1 -> "Sunday"
//      2 -> "Monday"
//      3 -> "Tuesday"
//      4 -> "Wednesday"
//      5 -> "Thursday"
//      6 -> "Friday"
//      7 -> "Saturday"
//      else -> "Time has stopped"
//   })
//}