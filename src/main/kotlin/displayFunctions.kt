import java.util.*

fun displayMainMenu(){
    // display options for main menu
    println("\n\nOptions: ")
    println("1 - View coping mechanisms")
    println("2 - Alter or add coping mechanism")
    println("3 - Exit")
}

fun displayCategoryMenu(){
    // ask what Order they would like to see them in
    println("\nWhat category would you like to view them in? ")
    println("1 - By Duration")
    println("2 - By Difficulty")
    println("3 - View Favorites")
    println("4 - Go back to previous menu")
}

fun displayAddOrAlterMenu() {
    // ask user if they would like to add or alter
    println("\nWhich would you like to do? ")
    println("1 - Add")
    println("2 - Alter")
    println("3 - Go back to previous menu")

}

fun displayDifficultyLevels(){
    // print difficulty levels
    println("1 - Easy")
    println("2 - Medium")
    println("3 - Hard")
}


fun displayCopingMechanisms(current: Map<String, Mechanism>){
    if (current.isEmpty()) {
        println("No coping mechanisms have been added yet.")
    }
    else {
        println("Coping Mechanisms: ")
        for (mechanism in current) {
            print("${mechanism.key}\n")
        }
    }
}

fun displayMechanismDetails(c:Mechanism){
    println("\nCoping Mechanism Name: ${c.name}")
    println("Difficulty: ${c.difficulty.printableName}")
    println("Duration: ${c.duration.printableName}")
    println("Instructions: ${c.descriptionParagraph}")
}

fun displayTryAgain(){
    // save or retry menu for alter ability
    println("1 - Save")
    println("2 - Try again")
}

fun displayNotValid(){
    println("Not valid\n")
}

fun displayAllDifficulty(){
    println("${Difficulty.EASY.difficultyCategory} - ${Difficulty.EASY.printableName}")
    println("${Difficulty.MEDIUM.difficultyCategory} - ${Difficulty.MEDIUM.printableName}")
    println("${Difficulty.HARD.difficultyCategory} - ${Difficulty.HARD.printableName}")
}

fun displayAllDurations(){
    println("${Duration.VERYQUICK.durationCategory} - ${Duration.VERYQUICK.printableName}")
    println("${Duration.QUICK.durationCategory} - ${Duration.QUICK.printableName}")
    println("${Duration.MEDIUM.durationCategory} - ${Duration.MEDIUM.printableName}")
    println("${Duration.LONG.durationCategory} - ${Duration.LONG.printableName}")
}

