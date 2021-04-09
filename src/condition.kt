fun main(){
   checkAge(14)
    selectContainer(3)
    collection()
    getCharacter("Alexandra")
}
fun checkAge(age:Int){
    if(age>12){
        println("You are a Teenager")
    }

}
//if else statements.They can be Nested

fun checkNationality(nationality:String) {
    if (nationality == "Kenyan") {
        println("Have you ever been to Nairobi?")
    } else if (nationality == "Uganda") {
        println("Have you ever been to Kampala")
    }else if(nationality=="Rwandese"){
        println("Have you evr been to Kigali")
    }else{
        println("Have you ever been to East Africa")
    }

}
//When Expression"
fun selectContainer(litres:Int){
    when(litres){
        1,2,3->println("Pour the water into a bottle")
        4,5,6,7->println("Pour the water into the bucket")
        8,9->println("Pour the water into the big bucket")
//        calling the function in the main

    }

}
//For Loop Expression
//iterating over collection ->arrays like lists ,arrays and range with an arbitrary variable
fun collection(){
    var languages=arrayOf("Python","Kotlin","JavaScript","Html","Css","C++","Angular")
    for(language in languages){
        println(language)
    }
//    for each loop also can work
    languages.forEach {  language ->
        println(language)
    }
//    another one

}
fun getCharacter(name:String){

    for (character in name){
        println(character)
    }

}

