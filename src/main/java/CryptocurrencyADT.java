// CSCI 211
// Robert McCurdy
// Student ID 10715877
// Program 4
// In keeping with the UM Honor Code, I have neither given nor received assistance from anyone other
// than the instructor.

public interface CryptocurrencyADT {
	public void buy(Coin c);
	public boolean sell(String privateKey);
	public String toString();
	
}
