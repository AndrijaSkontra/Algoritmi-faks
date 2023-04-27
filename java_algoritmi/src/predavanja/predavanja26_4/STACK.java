package predavanja.predavanja26_4;

public interface STACK <E> {

    /**
     * Method that returns actual size
     * of a stack. Size is equal to number of
     * elements.
     * @return number of elements
     */
    int size();

    /**
     * Method that checks if stack is empty
     * @return true or false
     */
    boolean isEmpty();

    /**
     * Fetch but doesn't remove last
     * element from the stack
     * @return element or null
     */
    E top();

    /**
     * Fetch and removes last element from the stack.
     * @return element or null.
     */
    E pop();

    /**
     * Put the element at the last postion in stack.
     * @param element
     */
    void push(E element);


}
