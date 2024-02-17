import java.util.Scanner;
import java.util.List;

// Class that manages game logic.
class Game 
{
	public void play() 
	{
		Scanner inputScanner = new Scanner(System.in); // Initialize a Scanner object for user input.
		System.out.println("Welcome to Lucky Card game by Emil Snäckerström!\n");
		String playAgain; // String to contain user input.
		
		// Loop representing a game round.
		do 
		{
			System.out.println("------- Playing a game round");
			
			//  Create a list `cards` with the return data from the `generateDeck()` method.
			List<Card> cards = Deck.generateDeck(); 
			int cardIndex = 0; // Variable used for loop indexing.
			int cardsTotalValue[] = new int[3]; // Array to store total value of cards.
			
			// Loop through the cards in the list, displaying attributes of a card.   
			for (Card card : cards) 
			{
				System.out.println("Card " + (cardIndex + 1) + ": " + card.getSuit() + "s " + card.getValue()
				+ " -> Value = " + card.getTotalValue(card));
				cardsTotalValue[cardIndex] = card.getTotalValue(card); // Adding card's total value to array.
				cardIndex++; // Increment indexing variable.
			}
			// Check if the third card's total value is between the first two cards total values.
			if (cardsTotalValue[2] > cardsTotalValue[0] && cardsTotalValue[2] < cardsTotalValue[1]
					|| cardsTotalValue[2] < cardsTotalValue[0] && cardsTotalValue[2] > cardsTotalValue[1]) 
			{
				System.out.println("\nYou win!"); // Displaying win message.
			} 
			else 
			{
				System.out.println("\nYou lose!"); // Displaying lose message.
			}
			System.out.println("\n=========> Press ENTER to play again or \"q\" to quit: "); // Prompt to play again.
			playAgain = inputScanner.nextLine(); // User input is stored in 'playAgian'.
			
		} while (!(playAgain.equals("q"))); // Exits the loop if 'q' was entered, continues otherwise.
		
		System.out.println("\nThank you for playing and welcome back!");
		inputScanner.close(); // Close the Scanner object.

	}
}
