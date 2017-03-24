/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) 
	{
		String[] rank1 = {"A", "B", "C"};
		String[] suit1 = {"Giraffes", "Lions"};
		int[] value1 = {1,2,3};
		String[] rank2 = {"D", "E", "F"};
		String[] suit2 = {"Birds"};
		int[] value2 = {4,5,6};
		String[] rank3 = {"G"};
		String[] suit3 = {"Dogs", "Cats", "Hamsters"};
		int[] value3 = {7};
		
		Deck deck1 = new Deck(rank1, suit1, value1);
		Deck deck2 = new Deck(rank2, suit2, value2);
		Deck deck3 = new Deck(rank3, suit3, value3);
		
		deck1.deal();
		System.out.println(deck1.size());
		deck1.deal();
		deck1.deal();
		deck1.deal();
		deck1.deal();
		deck1.deal();
		System.out.println(deck1.size());
		System.out.println(deck1.isEmpty());
		
		deck2.deal();
		System.out.println(deck2.size());
		deck2.deal();
		deck2.deal();
		System.out.println(deck2.size());
		System.out.println(deck2.isEmpty());
		
		deck3.deal();
		System.out.println(deck3.size());
		deck3.deal();
		deck3.deal();
		System.out.println(deck3.size());
		System.out.println(deck3.isEmpty());
	}
}
