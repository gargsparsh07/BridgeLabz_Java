package CoreProgramming.JavaString.level3;

class DeckOfCards {

    static String[] initializeDeck() {

        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {
                "2","3","4","5","6","7","8","9","10",
                "Jack","Queen","King","Ace"
        };

        String[] deck = new String[suits.length * ranks.length];
        int index = 0;

        for (String suit : suits)
            for (String rank : ranks)
                deck[index++] = rank + " of " + suit;

        return deck;
    }

    static void shuffle(String[] deck) {

        for (int i = 0; i < deck.length; i++) {
            int r = i + (int)(Math.random() * (deck.length - i));
            String temp = deck[i];
            deck[i] = deck[r];
            deck[r] = temp;
        }
    }

    public static void main(String[] args) {

        String[] deck = initializeDeck();
        shuffle(deck);

        System.out.println("First 5 cards after shuffling:");
        for (int i = 0; i < 5; i++)
            System.out.println(deck[i]);
    }
}
