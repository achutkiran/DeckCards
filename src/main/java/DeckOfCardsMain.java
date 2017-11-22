import java.util.Scanner;

public class DeckOfCardsMain {
	public static void main(String[] args) {
		Deck deck = new Deck();
		System.out.println("Press 1. Shuffle \n"
				+ "Press 2. dealOneCard \n"
				+ "Press 3. Exit");
		while(true) {
			Scanner read = new Scanner(System.in);
			int input = read.nextInt();
			switch(input) {
			case 1:
				deck.shuffle();
				break;
			case 2:
				Card out = deck.dealOneCard();
				if(out == null) {
					System.out.println("No cards to deal please shuffle");
				}
				else {
					System.out.println(out.toString());
				}
				break;
			case 3:
				read.close();
				System.exit(0);
				
			default:
				System.out.println("Enter valid choice");
			}
		}
	}
}
