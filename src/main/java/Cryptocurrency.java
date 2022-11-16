// CSCI 211
// Robert McCurdy
// Student ID 10715877
// Program 4
// In keeping with the UM Honor Code, I have neither given nor received assistance from anyone other
// than the instructor.

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Iterator;

public class Cryptocurrency implements CryptocurrencyADT{
        DoubleList<Coin> blockchain;

        /**
         * No arg constructor that instantiates blockchain doubly linked list
         */

        public Cryptocurrency() {
            // TODO: Delete _Starter. Complete the constructor to instantiate blockchain
            blockchain = new DoubleList<>();
            //instantiates blockchain
        }

        /**
         * method: getBitCoins returns the doubly linked list
         * @return
         */
         public DoubleList<Coin> getBitcoins() {
            return blockchain;
        }

        /**
         * method: buy adds a bitcoin to the blockchain and updates the Coin's public and private instance variables
         * @param c
         */
        public void buy(Coin c) {
            // TODO: Complete this method. Call the doubly linked list's add method to add the coin to the blockchain
            //   Then, set the private and public keys of the coin by calling Coin's hashValue method
            //adds the Coin c to the blockchain, then gets the hashvalue from the blockchain coin at the front bc we just added the coin passed in to the front of the blockchain
            blockchain.add(c);
            c.hashValue(blockchain.getFront());

        }

        /**
         * method: sell finds the matching private key in the block chain and removes
         * @param key
         * @return
         */
        public boolean sell(String key) {
            // TODO: Complete this method. Find the node with the private key - call the double linked list's remove method
            //iterator using blockchain.iterator
            Iterator<Coin> itr = blockchain.iterator();
            //create a temporary coin node to hold data
            DoubleNode<Coin> current = new DoubleNode<>();
            //iterates over the blockchain while setting current to the current element of the blockchain tha it's iterating through, then checks to see if the private key of the current
            //element is = to our target privatekey and if it is, it removes said element and returns true
            while(itr.hasNext()){
                current.setElement(itr.next());
                if(current.getElement().getPrivateKey() == key){
                    blockchain.remove(current.getElement());
                    return true;
                }
            }

            return false;
        }

        /**
         * method: toString should step through the blockchain and build a String of the password's
         * @return
         */
        public String toString() {
            //  TODO: Complete this method. Build an output String of the original passwords.  Because there is not a getter for passwords
            //   you must use the privateKey - Base64 has a getDecoder().decode(...) method that allows you
            //   to reverse engineer the password. Include a newline after each password.
            String output = "";
            //checks if blockchain is empty, if it is throws emptycollectionexception syaing hey its empty
            if(blockchain.isEmpty()){
                throw new EmptyCollectionException("Empty Blockchain");
            }
            //creates an iterator for the blockchain and then a temporary node to hold our current node data while iterating
            Iterator<Coin> itr = blockchain.iterator();
            DoubleNode<Coin> current = new DoubleNode<>();
            //iterates through the blockchain while storing the current data into current node, decodes the privatekey into byte array then converts byte array to a string
            //using a similar thing from the Coin.java method where we encode, then we substring that string to start at the index of the character "." + 1 because we don't want
            //to include the . in the output, then append to output with that string + a new line command
            while(itr.hasNext()){
                current.setElement(itr.next());
                byte[] b = Base64.getDecoder().decode(current.getElement().getPrivateKey());
                String str = new String(b, StandardCharsets.UTF_8);
                String st = str.substring(str.indexOf('.') + 1);
                output += st + "\n";
            }

            System.out.println(output);

             return output;
        }
}
