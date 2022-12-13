import java.util.*

fun createNewMechanism(): Mechanism{
    // prompt for name
    println("What would you like to name this coping Mechanism? ")
    var name = readln()

    // prompt for
    println("About how long will this coping mechanism take in minutes?")
    var durationTime: Int = getAnswerNumber()
    var duration: Duration = setDuration(durationTime)

    //prompt for difficulty
    println("About what how difficult is this coping mechanism for you? ")
    displayDifficultyLevels()
    var difficultyInput = getAnswerNumber()
    var difficulty = setDifficulty(difficultyInput)

    // prompt for instructions
    println("Write a brief set of instructions for this coping mechanism")
    var descriptionParagraph = readln()

    // prompt for favorite
    println("Would you like to favorite this coping mechanism? (y/n)")
    var favInput = readln()
    var favorite:Boolean = false
    if (favInput.lowercase() == "y") {
        favorite = true
    }
    return Mechanism(name, duration, difficulty, descriptionParagraph, favorite )
}


fun setDuration(durationTime: Int) :Duration{
    var duration: Duration = Duration.VERYQUICK
    if (durationTime <=3) {
        duration = Duration.VERYQUICK
    }
    else if (durationTime <= 5){
        duration = Duration.QUICK
    }
    else if (durationTime <= 10){
        duration = Duration.MEDIUM
    }
    else {
        duration = Duration.LONG
    }
    return duration
}

fun setDifficulty(diff:Int) :Difficulty{
    var difficultyLevel = Difficulty.EASY
    when(diff){
        1 -> {
            difficultyLevel = Difficulty.EASY
        }
        2 -> {
            difficultyLevel = Difficulty.MEDIUM
        }
        3 -> {
            difficultyLevel = Difficulty.HARD
        }
    }
    return difficultyLevel
}

fun getAnswerName(): String{
    println("\nEnter coping mechanism name exactly as seen: ")
    return readln()
}

fun getAnswerNumber(): Int {
    var number1 = Scanner(System.`in`)
    println("\nAnswer: ")
    return number1.nextInt()
}

//fun createDurationMap(copingMechanisms: Map<String, Mechanism>, category:Int): Map<String, Map<String, Mechanism>>{
//    var mechanismsByDuration =  mutableMapOf<String, Map<String, Mechanism>>()
//    var cope = copingMechanisms.filterValues { it.duration.durationCategory == category }
//
//    mechanismsByDuration[category] = cope
//    displayCopingMechanisms(cope)
//    return mechanismsByDuration
//}

