/**
 * Created by Armand on 5/28/17.
 */
class Deck {
    val cards: Array<Card> = Array(52,
            fun (i: Int): Card {
                return Card(i % 13, getSuit(i))
            }
    )

    private fun  getSuit(i: Int): String = when(i / 13){
            0 -> "Clubs"
            1 -> "Diamonds"
            2 -> "Hearts"
            else -> "Spades"
    }


}