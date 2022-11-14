// CSCI 211
// Robert McCurdy
// Student ID 10715877
// Program 4
// In keeping with the UM Honor Code, I have neither given nor received assistance from anyone other
// than the instructor.

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
