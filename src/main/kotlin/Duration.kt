enum class Duration {
    VERYQUICK(1, "Very quick"),
    QUICK(2, "Quick"),
    MEDIUM(3, "Medium"),
    LONG(4, "Long");

    var durationCategory: Int? = null
    var printableName: String? = null

    constructor()

    constructor(durationCategory: Int, printableName: String)


}