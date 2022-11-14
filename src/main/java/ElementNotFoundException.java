// CSCI 211
// Robert McCurdy
// Student ID 10715877
// Program 4
// In keeping with the UM Honor Code, I have neither given nor received assistance from anyone other
// than the instructor.

/**
 * ElementNotFoundException represents the situation in which a target element 
 * is not present in a collection
 *
 * @author Java Foundations
 * @version 4.0
 */


public class ElementNotFoundException extends RuntimeException
{
    /**
     * Sets up this exception with an appropriate message.
     */
    public ElementNotFoundException (String collection)
    {
	    super ("The target element is not in this " + collection);
    }
}
