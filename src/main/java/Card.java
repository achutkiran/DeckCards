
public class Card {
	private final String[] suits= {"hearts","spades","clubs","diamonds"};
	private final String[] faceValues = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
	private String suit,faceValue;
	Card(int suit,int faceValue){
	 		this.suit = suits[suit-1];
	 		this.faceValue = faceValues[faceValue-1];
	}
	@Override
	public String toString() {
		String out = faceValue+" of "+suit;
		return out;
	}
}
