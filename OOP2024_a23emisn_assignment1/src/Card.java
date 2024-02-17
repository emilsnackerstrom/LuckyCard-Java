// Represents a playing card.
class Card 
{
	private int value; 
	private String suit;

	// Set the value of card with a randomized number.
	public void setValue(int randomValue) 
	{
		this.value = randomValue;
	}

	// Set the suit of card, a randomized number computes the suit.
	public void setSuit(int randomSuitIndex) 
	{
		switch (randomSuitIndex) 
		{
		case 0:
			suit = "Diamond";
			break;
		case 1:
			suit = "Club";
			break;
		case 2:
			suit = "Heart";
			break;
		case 3:
			suit = "Spade";
			break;
		}
	}

	// Return the value of card.
	public int getValue() 
	{
		return value;
	}

	// Return the suit of card.
	public String getSuit() 
	{
		return suit;
	}
	
	// Calculate the total value of a card with value of card + value of suit(bonus).
	public int getTotalValue(Card card) 
	{
		int totalValue = 0;
		switch (card.getSuit()) 
		{
		case "Diamond":
			totalValue = card.getValue() + 4;
			break;
		case "Club":
			totalValue = card.getValue() + 6;
			break;
		case "Heart":
			totalValue = card.getValue() + 8;
			break;
		case "Spade":
			totalValue = card.getValue() + 10;
			break;
		}
		// Return the computed total value.
		return totalValue; 
	}
}
