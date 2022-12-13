enum class Difficulty {
    EASY(1, "Easy"),
    MEDIUM(2, "Medium"),
    HARD(3, "Hard");
    // constants with printable names and assigned numbers

    var difficultyCategory: Int? = null
    var printableName: String? = null

    constructor()

    constructor(difficultyCategory: Int, printableName: String)

}