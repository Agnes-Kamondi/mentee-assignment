fun main() {
   var school = checkLength("Akirachix")

    var name1 =name("Agnes")
       println(name1.uppercase())

    var place =give("Naivasha")

   var present= here("Nairobi")

    merge("Agnes","Nairobi")

    equality("Write","write")

    compre("people","person")

    weekday(4)

    findSubstringIndex("here","there")

    removeVowels("banana")

    removeConsonants("calibraces")

}
//write a kotlin function that takes in a string and returns the length.
fun checkLength(school:String): Int{
   var  size = school.length
    println(size)
    return size
}
// write a kotlin function that takes a string as an input and returns the string in uppercase letters.
fun name(name1:String): String{
    return name1.uppercase()
}
//write a kotlin function that takes a string as an input and returns the string in lowercase letters.
fun give (place:String): String{
   var county =place.lowercase()
    println(county)
    return county
}
//Write a function that takes a string as input and returns the last character of the string.
fun here (present:String): Char{
    var presently = present.last()
    return presently
}
//Write a function that takes two strings as input and concatenates them together.
fun merge (three:String,four:String): String{
    var result = three.plus(four)
    println(result)
    return result
}
//Write a function that takes two strings as input and checks if they are equal.
//method1
fun equality (five: String,six:String):Boolean{
    if (five == six)
    {
        println(true)
    }
    else{
        println(false)
    }
    var seven = five == six
    println(seven)
    return seven
}
//method2
fun compre (most:String, less:String):Int {
     var result1 = most.compareTo(less)
     return result1
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
    println(result3)
    return result3

}
//Write a function that takes two strings as input and returns the index of the
// first occurrence of the second string in the first string. If the second string does not occur in the first string,
// the function should return -1.
fun findSubstringIndex(string1:String,string2:String):Int{
    var result4 = string1.indexOf(string2)
    println(result4)
   return result4
}
//Write a function that takes a string as input and returns a new string with all the vowels removed.
fun removeVowels(input:String):String{
 var result5 = input.filter{ it !in "aeiouAEIOU"}
    println(result5)
    return result5
}
//Write a function that takes a string as input and returns a new string with all the consonants removed.
fun removeConsonants(bracket:String):String{
    var result6 = bracket.filter{it !in "bcdfghjklmnpqrstvwxyz"}
    println(result6)
    return(result6)
}




