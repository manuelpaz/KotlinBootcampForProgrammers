fun main(args: Array<String>){
    whatShouldIDoToday("happy", "windy", 27)
}
fun whatShouldIDoToday(mood: String, weather: String="sunny", temperature: Int = 24): String{
    return when {
        mood == "sad" && weather == "sunny" -> "Go for a walk"
        temperature >= 24 -> "Drink a beer"
        mood == "Happy" && weather == "Cold" -> "Stay home and watch tv"
        else -> "Stay home and read"
    }

}