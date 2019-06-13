package game;

import java.util.Map;

public class Deck {
    private Map<Integer, Card> deck;

    public Deck(Map deck) {
        this.deck = deck;
    }

    public Map getDeck() {
        return deck;
    }

    public void setDeck(Map deck) {
        this.deck = deck;
    }
}
