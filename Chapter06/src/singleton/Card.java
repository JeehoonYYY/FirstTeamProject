package singleton;

public class Card {
	private static int serialNum = 1000;
	private int newCardNum;
	
	Card() {
		newCardNum = serialNum++;
		newCardNum = serialNum;
	}
	public int getCardNumber() {
		return newCardNum;
	}

	
	
	
	
}
