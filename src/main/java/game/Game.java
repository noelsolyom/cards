package game;

import java.util.*;

public class Game {

    private static Game game;
    private Map<Integer, Card> deck;

    public void init() {

        Map<Integer, Card> deck = new HashMap<>();

        int index = 0;
        for(Color c:Color.values()) {
            for(int i = 2; i < 15; i++) {
                deck.put(index, new Card(c, i));
                index++;
            }
        }
        this.deck = deck;
    }

    public void start() {
        System.out.println(deck.keySet());
        printCards();
        List<Card> cards = shuffle(deck);
        System.out.println(cards);
    }

    public List<Card> shuffle(Map<Integer, Card> deck) {
        List<Integer> indexes = new ArrayList<>(deck.keySet());
        Collections.shuffle(indexes);
        List<Card> cards = new ArrayList<>();

        for(int i:indexes) {
            cards.add(deck.get(i));
        }
        return cards;
    }

    public void printCards() {
        for(int i = 0; i < deck.size(); i++) {
            System.out.println(deck.get(i).toString());
        }
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.init();
        game.start();
    }
}
