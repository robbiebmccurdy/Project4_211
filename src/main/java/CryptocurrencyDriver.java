
import java.io.*;
public class CryptocurrencyDriver  {

	public static void main(String[] args) throws IOException, ClassNotFoundException{	
		Cryptocurrency myBitcoin = new Cryptocurrency();
		myBitcoin.buy(new Coin(15, "secret"));
		myBitcoin.buy(new Coin(20, "hello"));
		myBitcoin.buy(new Coin(25, "goodbye"));
		myBitcoin.buy(new Coin(30, "tomorrow"));
		myBitcoin.buy(new Coin(7, "today"));

		System.out.println("My Bitcoin:\n" + myBitcoin);

		DoubleNode<Coin> third = myBitcoin.getBitcoins().getFront().getNext().getNext();
		String privateKey = third.getElement().getPrivateKey();
		myBitcoin.sell(privateKey);
		System.out.println("\n\nUPDATED...\nMy Bitcoin:\n" + myBitcoin);

	}

}
