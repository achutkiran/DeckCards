import java.util.Random;

public class Deck {
	private Card[] deck = new Card[52];
	private int start = 0;
	Deck() {
		initialize();
	}
	public void shuffle() {
		start = 0;
		Random rand = new Random();
		for(int i=51;i>0;i--) {
			int temp = rand.nextInt(i);
			swap(i,temp);
		}
		System.out.println("Shuffling Complete");
	}
	
	public Card dealOneCard() {
		if(start<52) {
			start++;
			return deck[start-1];
		}
		else {
			return null;
		}
	}
	private void swap(int i, int j) {
		Card temp = deck[i];
		deck[i] = deck[j];
		deck[j] = temp;
	}
	private void initialize() {
		for(int i=0;i<52;i=i+4) {
			int faceValue = i/4+1;
			deck[i] = new Card(1,faceValue);
			deck[i+1] = new Card(2,faceValue);
			deck[i+2] = new Card(3,faceValue);
			deck[i+3] = new Card(4,faceValue);
		}
	}
}
