/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) 
	{
		Card card1 = new Card("2", "Spades", 2);
		Card card2 = new Card("3", "Hearts", 3);
		Card card3 = new Card("King", "Diamonds", 13);
		
		System.out.println("The rank of this card is " + card1.rank());
		System.out.println("The rank of this card is " + card2.rank());
		System.out.println("The rank of this card is " + card3.rank());
		System.out.println("The suit of this card is " + card1.suit());
		System.out.println("The suit of this card is " + card2.suit());
		System.out.println("The suit of this card is " + card3.suit());
		System.out.println("The point value of this card is " + card1.pointValue());
		System.out.println("The point value of this card is " + card2.pointValue());
		System.out.println("The point value of this card is " + card3.pointValue());
		System.out.println(card1.toString());
		System.out.println(card2.toString());
		System.out.println(card3.toString());
	}
}
