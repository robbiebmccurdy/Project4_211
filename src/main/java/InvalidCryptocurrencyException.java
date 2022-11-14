public class InvalidCryptocurrencyException extends RuntimeException{
    /**
     * Sets up this exception with an appropriate message.
     * @param collection the name of the collection
     */
    public InvalidCryptocurrencyException (String message)
    {
        super (message);
    }
}
