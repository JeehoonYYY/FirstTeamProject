package singleton;

public class CardCompanyTest {

	public static void main(String[] args) {
		CardCompany cardCompany = CardCompany.getInstance();
		
	
		Card card = cardCompany.newCard();
		Card card2 = cardCompany.newCard();
		Card card3 = cardCompany.newCard();
		Card card4 = cardCompany.newCard();
		
		System.out.println(card.getCardNumber());
		System.out.println(card2.getCardNumber());
		System.out.println(card3.getCardNumber());
		System.out.println(card4.getCardNumber());
		
		
		
		
		
		
	}

}
