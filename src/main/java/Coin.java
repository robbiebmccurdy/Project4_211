
// CSCI 211
// Robert McCurdy
// Student ID 10715877
// Program 4
// In keeping with the UM Honor Code, I have neither given nor received assistance from anyone other
// than the instructor.
public class Coin {
    private double value;
    private String password;
    private String privateKey;
    private String publicKey;
    private Coin address;

    /**
     * Constructor accepts two parameters, value, and password
     * @param value
     * @param password
     */
    // TODO: Write constructor. Initialize value, password and address (address is just the object's reference)
    //   To set the value, call the setter for the value instance variable. NOTE: privateKey and publicKey are set in hashValue
    public Coin(Double value, String password){

    }

    // TODO: Provide limited getters and setters.
    //   Getters: only give getters for privateKey, publicKey and address
    //   Setters: only give setter for value - throw an Exception if value is negative

    /**
     * method: hashValue uses the address of hashNode to determine the private key
     * @param hashNode
     */
    public void hashValue(DoubleNode<Coin> hashNode) {
        // TODO: Complete this method. Use the address reference (convert to String) and Base64's static getEncoder().encode(...) to get the
        //   encoded byes of the memory reference.password - i.e., the instance variable's password.
        //   Set the privateKey and publicKey (last 5 characters of privateKey)




     }

    /**
     * method: toString returns a String of this coin's value, private key and public key
     * @return
     */
    public String toString() {
        return "[Value: " + value + "  Private Key: " + privateKey + "  Public Key: " + publicKey + "]";
    }

}
