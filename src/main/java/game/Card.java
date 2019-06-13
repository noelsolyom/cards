package game;

public class Card {
    private Color color;
    private int rank;

    public Card(Color color, int rank) {
        this.color = color;
        this.rank = rank;
    }

    public Color getColor() {
        return color;
    }

    public int getRank() {
        return rank;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Card{" +
                "color=" + color.toString() +
                ", rank=" + rank +
                '}';
    }
}
