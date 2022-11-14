public class DoubleNode<T>
{
    private DoubleNode<T> next;
    private T element;
    private DoubleNode<T> previous;

    //-----------------------------------------------------------------
    //  Creates an empty node.
    //-----------------------------------------------------------------
    public DoubleNode()
    {
       next = null;
       element = null;
       previous = null;
    }

    //-----------------------------------------------------------------
    //  Creates a node storing the specified element.
    //-----------------------------------------------------------------
    public DoubleNode (T elem)
    {
       next = null;
       element = elem;
       previous = null;
    }

    //-----------------------------------------------------------------
    //  Returns the node that follows this one.
    //-----------------------------------------------------------------
    public DoubleNode<T> getNext()
    {
       return next;
    }

    //-----------------------------------------------------------------
    //  Returns the node that precedes this one.
    //-----------------------------------------------------------------
    public DoubleNode<T> getPrevious()
    {
       return previous;
    }

    //-----------------------------------------------------------------
    //  Sets the node that follows this one.
    //-----------------------------------------------------------------
    public void setNext (DoubleNode<T> dnode)
    {
       next = dnode;
    }

    //-----------------------------------------------------------------
    //  Sets the node that follows this one.
    //-----------------------------------------------------------------
    public void setPrevious (DoubleNode<T> dnode)
    {
       previous = dnode;
    }


    //-----------------------------------------------------------------
    //  Returns the element stored in this node.
    //-----------------------------------------------------------------
    public T getElement()
    {
       return element;
    }

    //-----------------------------------------------------------------
    //  Sets the element stored in this node.
    //-----------------------------------------------------------------
    public void setElement (T elem)
    {
       element = elem;
    }


}


