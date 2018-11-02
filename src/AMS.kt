//Cree una función main () que tome un argumento que represente la hora en formato de 24 horas (valores entre e incluyendo 0 -> 23).
//En la función main (), compruebe si la hora es anterior al mediodía (<12), luego imprima "Good morning, Kotlin"; de lo contrario,
// imprima “Good night, Kotlin".
//Notas:
//Recuerde que todos los argumentos de la función main () son cadenas, por lo que tendrá que convertir este argumento en un Int antes de poder aplicar la verificación.
//Avanzado
//Trate de usar las plantillas de cadenas de Kotlin para hacer esto en 1 línea.
fun main(args: Array<String>){
    println(if(args[0].toInt()<12) "Good moring Kotlin" else "Good Night Kotlin")
}
