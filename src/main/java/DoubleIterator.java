// CSCI 211
// Robert McCurdy
// Student ID 10715877
// Program 4
// In keeping with the UM Honor Code, I have neither given nor received assistance from anyone other
// than the instructor.

import java.util.*;

public class DoubleIterator<T> implements Iterator
{
   private int count;  // the number of elements in the collection
   private DoubleNode<T> current;  // the current position

   //-----------------------------------------------------------------
   //  Sets up this iterator using the specified items.
   //-----------------------------------------------------------------
   public DoubleIterator (DoubleNode<T> list, int size)
   {
      current = list;
      count = size;
   }

   //-----------------------------------------------------------------
   //  Returns true if this iterator has at least one more element
   //  to deliver in the iteraion.
   //-----------------------------------------------------------------
   public boolean hasNext()
   {
      return (current != null);
   }

   //-----------------------------------------------------------------
   //  Returns the next element in the iteration. If there are no
   //  more elements in this iteration, a NoSuchElementException is
   //  thrown.
   //-----------------------------------------------------------------
   public T next()
   {
      if (! hasNext())
         throw new NoSuchElementException();

      T result = current.getElement();
      current = current.getNext();
      return result;
   }

   //-----------------------------------------------------------------
   //  The remove operation is not supported.
   //-----------------------------------------------------------------
   public void remove() throws UnsupportedOperationException
   {
      throw new NoSuchElementException();
   }
}
