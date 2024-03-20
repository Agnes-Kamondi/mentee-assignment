fun main() {
   println( checkLength("Akirachix"))

   println(name("Agnes"))

    println(give("Naivasha"))

   println(here("Nairobi"))

   println(merge("Agnes","Nairobi"))

    println(equality("Write","write"))

  println(compre("people","person"))

    println(weekday(4))

    println(findSubstringIndex("here","there"))

    println(removeVowels("banana"))

    println(removeConsonants("calibraces"))

}
//write a kotlin function that takes in a string and returns the length.
fun checkLength(school:String): Int{
   return school.length
//    return school.length
}
// write a kotlin function that takes a string as an input and returns the string in uppercase letters.
fun name(name1:String): String{
    return name1.uppercase()
}
//write a kotlin function that takes a string as an input and returns the string in lowercase letters.
fun give (place:String): String{
    return place.lowercase()
}
//Write a function that takes a string as input and returns the last character of the string.
fun here (present:String): Char{
    return present.last()
}
//Write a function that takes two strings as input and concatenates them together.
fun merge (three:String,four:String): String{
    var result = three.plus(four)
    return result
}
//Write a function that takes two strings as input and checks if they are equal.
//method1
fun equality (five: String,six:String):Boolean{
    var seven = five == six
    return seven
}
//method2
fun compre (most:String, less:String):Boolean {
     return most.equals(less)
}
//use the weekday number to calculate the weekday name :
fun weekday (weekDay : Int): String {
    var result3 = when (weekDay) {
        1 -> "Sunday"
        2 -> "Monday"
        3 -> "Tuesday"
        4 -> "Wednesday"
        5 -> "Thursday"
        6 -> "Friday"
        7 -> "Saturday"
        else -> "Invalid name"
    }
    return result3

}
//Write a function that takes two strings as input and returns the index of the
// first occurrence of the second string in the first string. If the second string does not occur in the first string,
// the function should return -1.
fun findSubstringIndex(string1:String,string2:String):Int{
    var result4 = string1.indexOf(string2)
   return result4
}
//Write a function that takes a string as input and returns a new string with all the vowels removed.
fun removeVowels(input:String):String{
 var result5 = input.filter{ it !in "aeiouAEIOU"}
    return result5
}
//Write a function that takes a string as input and returns a new string with all the consonants removed.
fun removeConsonants(bracket:String):String{
    var result6 = bracket.filter{it !in "bcdfghjklmnpqrstvwxyz"}
    return(result6)
}




