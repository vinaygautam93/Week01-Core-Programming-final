import java.util.Scanner;

public class CardDeck {
    
    // Method to initialize the deck of cards
    public String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        
        // Calculate the number of cards in the deck
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        
        // Initialize the deck with the rank of suit
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index] = rank + " of " + suit;
                index++;
            }
        }
        return deck;
    }

    // Method to shuffle the deck of cards
    public String[] shuffleDeck(String[] deck) {
        int n = deck.length;
        
        // Shuffle the deck by swapping each card with a random card
        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int) (Math.random() * (n - i));  // Generate random index
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];  // Swap current card with random card
            deck[randomCardNumber] = temp;  // Swap current card with random card
        }
        return deck;
    }

    // Method to distribute the deck to players
    public String[][] distributeCards(String[] deck, int numCards, int numPlayers) {
        // If cards can't be evenly distributed, return null
        if (numCards % numPlayers != 0) {
            System.out.println("The cards can't be evenly distributed.");
            return null;
        }
        
        int cardsPerPlayer = numCards / numPlayers;
        String[][] playersCards = new String[numPlayers][cardsPerPlayer];
        
        int cardIndex = 0;
        // Distribute cards to each player
        for (int i = 0; i < numPlayers; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                playersCards[i][j] = deck[cardIndex];
                cardIndex++;
            }
        }
        return playersCards;
    }

    // Method to print the players' cards
    public void printPlayersCards(String[][] playersCards) {
        // Print cards of each player
        for (int i = 0; i < playersCards.length; i++) {
            System.out.print("Player " + (i + 1) + " has: ");
            for (String card : playersCards[i]) {
                System.out.print(card + ", ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Create an object of CardDeck to call methods
        CardDeck cd = new CardDeck();
        
        // Initialize the deck of cards
        String[] deck = cd.initializeDeck();
        
        // Shuffle the deck
        deck = cd.shuffleDeck(deck);
        
        // Ask for the number of players and cards to be dealt
        System.out.println("Enter the number of players: ");
        int numPlayers = sc.nextInt();
        
        System.out.println("Enter the number of cards to deal to each player: ");
        int numCards = sc.nextInt();
        
        // Distribute the cards to the players
        String[][] playersCards = cd.distributeCards(deck, numCards * numPlayers, numPlayers);
        
        if (playersCards != null) {
            // Print the cards of each player
            cd.printPlayersCards(playersCards);
        }
    }
}
