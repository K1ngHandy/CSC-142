package week15;

public class Card {
    private int suit;
    private int rank;

    public static final int TWO = 0;
    public static final int THREE = 1;
    public static final int FOUR = 2;
    public static final int FIVE = 3;
    public static final int SIX = 4;
    public static final int SEVEN = 5;
    public static final int EIGHT = 6;
    public static final int NINE = 7;
    public static final int TEN = 8;
    public static final int JACK = 9;
    public static final int QUEEN = 10;
    public static final int KING = 11;
    public static final int ACE = 12;

    // black
    public static final int CLUBS = 0;
    // red
    public static final int DIAMONDS = 1;
    // red
    public static final int HEARTS = 2;
    // black
    public static final int SPADES = 3;

    public Card(int suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public int getSuit() {
        return suit;
    }

    public int getRank() {
        return rank;
    }

    public int compareTo(Card other) {
        return this.getRank() - other.getRank();
    }

    public static boolean isPretty(Card[] hand) {
        if (hand == null || hand.length == 0) {
            return false;
        }

        // Check if all cards are face cards (JACK, QUEEN, KING, or ACE)
        boolean allFaceCards = true;
        for (Card card : hand) {
            int rank = card.getRank();
            if (rank != JACK && rank != QUEEN && rank != KING && rank != ACE) {
                allFaceCards = false;
                break;
            }
        }

        if (allFaceCards) {
            return true;
        }

        // Check if all cards have rank 10 or less (not including ACEs) and same color
        boolean allLowRank = true;
        for (Card card : hand) {
            int rank = card.getRank();
            if (rank > TEN || rank == ACE) {
                allLowRank = false;
                break;
            }
        }

        if (!allLowRank) {
            return false;
        }

        // All cards have rank <= TEN, check if same color
        int firstSuit = hand[0].getSuit();
        boolean firstIsRed = (firstSuit == HEARTS || firstSuit == DIAMONDS);

        for (Card card : hand) {
            int suit = card.getSuit();
            boolean currentIsRed = (suit == HEARTS || suit == DIAMONDS);

            if (firstIsRed != currentIsRed) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Card[] hand1 = { new Card(HEARTS, JACK), new Card(DIAMONDS, QUEEN), new Card(SPADES, KING) };
        Card[] hand2 = { new Card(CLUBS, TWO), new Card(SPADES, FIVE), new Card(CLUBS, NINE) };
        Card[] hand3 = { new Card(HEARTS, TWO), new Card(DIAMONDS, FIVE), new Card(HEARTS, TEN) };

        System.out.println(isPretty(hand1));
        System.out.println(isPretty(hand2));
        System.out.println(isPretty(hand3));
    }
}
