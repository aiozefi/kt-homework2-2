fun main() {
    val likesCount = 61 // Количество лайков

    val formattedText = formatLikesText(likesCount)
    println(formattedText)
}

fun formatLikesText(likesCount: Int): String {
    val lastDigit = likesCount % 10
    val lastTwoDigits = likesCount % 100

    return when {
        lastDigit == 1 && lastTwoDigits != 11 -> "Понравилось $likesCount человеку"
        (lastDigit in 2..4 && (lastTwoDigits < 10 || lastTwoDigits > 20)) -> "Понравилось $likesCount людям"
        else -> "Понравилось $likesCount людям"
    }
}
