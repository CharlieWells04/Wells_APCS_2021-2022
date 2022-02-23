import java.util.ArrayList;
import java.util.Collections;

public class Table
{
    public static void main(String[] args)
    {
        Deck deck = new Deck();
        Card[] cardDeck = deck.getDeck();
        Table table = new Table();
        BlackJack blackjack = new BlackJack(cardDeck);
        blackjack.runHand();
    }
}