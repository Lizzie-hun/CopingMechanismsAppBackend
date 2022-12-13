import java.util.*


fun main(args: Array<String>) {
    // declare dictionary for coping mechanisms
    val copingMechanisms = mutableMapOf<String, Mechanism>()

    // Menu loop
    var cont = true
    while (cont) {
        //display options in Mainmenu
        displayMainMenu()

        //get input answer of menu option that was chosen and set it equal to a variable
        var firstMenuAnswer: Int = getAnswerNumber()

        // write cases for menu
        when (firstMenuAnswer) {
            1 -> {
                    var retry = true
                    while (retry) {
                        displayCopingMechanisms(copingMechanisms)
                        if (copingMechanisms.isNotEmpty()) {
                            var nameChoice = getAnswerName()
                            if (copingMechanisms.containsKey(nameChoice)) {
                                copingMechanisms[nameChoice]?.let { displayMechanismDetails(it) }
                                retry = false
                            } else {
                                displayNotValid()
                            }
                        }
                        else {
                            retry = false
                        }
                    }
                //Everything here is for an option menu I had to give up on because I didn't have time
//                display options in category menu
//                displayCategoryMenu()
//
//                //get input answer of menu option that was chosen and set it equal to a variable
//                var categoryMenuAnswer: Int = getAnswerNumber()
//                when (categoryMenuAnswer) {
//                    1 -> {
//                        // display by duration
//                        displayAllDurations()
//                        var durationAnswer = getAnswerNumber()
//
//                        var mechanismsByDuration =  createDurationMap(copingMechanisms, durationAnswer)
//
//
//                    }
//                    2 -> {
//                        //display by difficulty
//                    }


                }

//
            2 -> {
                displayAddOrAlterMenu()
                var addOrAlterAnswer = getAnswerNumber()
                when (addOrAlterAnswer) {
                    1 -> {
                        var mechanismToAdd = createNewMechanism()
                        copingMechanisms[mechanismToAdd.name] = mechanismToAdd
                    }

                    2 -> {
                        var retry = true
                        while(retry) {
                            displayCopingMechanisms(copingMechanisms)
                            if (copingMechanisms.isNotEmpty()) {
                                var nameAnswer = getAnswerName()
                                // set loop that ends if a correct name is entered and edited
                                if (copingMechanisms.containsKey(nameAnswer)) {
                                    while (retry) {
                                        println("\nCoping Mechanism ready to edit:")
                                        var mechanismToAdd = createNewMechanism()
                                        displayTryAgain()
                                        var editAnswer = getAnswerNumber()
                                        when (editAnswer) {
                                            1 -> {
                                                copingMechanisms.remove(nameAnswer)
                                                copingMechanisms[mechanismToAdd.name] = mechanismToAdd
                                                displayMechanismDetails(mechanismToAdd)
                                                retry = false
                                            }
                                            2-> {
                                                copingMechanisms[nameAnswer]?.let { displayMechanismDetails(it) }
                                            }
                                        }
                                    }
                                }
                            else{
                                displayNotValid()
                            }
                            }
                            else{
                                retry = false
                            }
                        }
                    }

                // condition for any other number
                    else -> {
                        displayNotValid()
                    }
                }
            }
            // Goodbye message
                3 -> {
                    println("Hope you have a better day!!")
                    cont = false
                }
            //condition for any wrong number entered
                else -> {
                    displayNotValid()
                }
            }
        }
    }

