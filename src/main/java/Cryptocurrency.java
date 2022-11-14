// CSCI 211
// Robert McCurdy
// Student ID 10715877
// Program 4
// In keeping with the UM Honor Code, I have neither given nor received assistance from anyone other
// than the instructor.

public class Cryptocurrency implements CryptocurrencyADT{
        DoubleList<Coin> blockchain;

        /**
         * No arg constructor that instantiates blockchain doubly linked list
         */

        public Cryptocurrency() {
            // TODO: Delete _Starter. Complete the constructor to instantiate blockchain
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



        }

        /**
         * method: sell finds the matching private key in the block chain and removes
         * @param key
         * @return
         */
        public boolean sell(String key) {
            // TODO: Complete this method. Find the node with the private key - call the double linked list's remove method




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



             return output;
        }
}
