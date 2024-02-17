import java.util.List;
import java.util.ArrayList;
import java.util.Random;

// Class to represent a deck of cards.
class Deck 
{
	// Generates a deck of three random cards.
	public static List<Card> generateDeck() 
	{ 
		// Create a new list to contain the cards.
		List<Card> cards = new ArrayList<>(); 
		for (int i = 0; i < 3; i++) // Loop to create three cards.
		{
			Card card = new Card(); // Create a new instance of Card.
			Random random = new Random(); // Initialize a new random sequence.
			card.setValue(random.nextInt(13) + 1); // Set the card value to a random number in the 1-13 range.
			card.setSuit(random.nextInt(4)); //  Set the card suit with a random number in the 0-3 range.
			cards.add(card); // Add card to the list.
		}
		// Return list of cards generated.
		return cards; 
	}
}
