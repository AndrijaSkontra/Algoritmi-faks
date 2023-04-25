package predavanja.predavanja19_4;

import predavanja.predavanja12_4.Node;
import predavanja.predavanja12_4.SLL;

public class CLL<E> implements SLL <E> {

    private Node<E> tail;
    private int size;

    public CLL() {
        tail = null; // dodaj this. ako ne bude radilo
        size = 0;
        System.out.println("Created an empty list!");
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void addFirst(E element) {
        if(isEmpty()) {
            System.out.println("Adding first element...");
            tail = new Node<>(element, null);
            tail.setNext(tail);
        } else {
            Node<E> newNode = new Node<>(element, tail.getNext());
            tail.setNext(newNode);
        }
        size++;

    }

    @Override
    public void addLast(E element) {
        if (isEmpty()){
            System.out.println("adding at last position");
            tail = new Node<>(element, null);
            tail.setNext(tail);
            size++;
        } else {
            System.out.println("adding at last position using addFirst");
            addFirst(element);
            tail = tail.getNext();
        }

    }

    @Override
    public E removeFirst() {
        E element = null;
        if(isEmpty()){
            System.out.println("list is empty, nothing to remove");
        } else {
            Node<E> first = tail.getNext();
            tail.setNext(first.getNext());
            first.setNext(null);
            element = first.getElement();
            System.out.println("remove the element " + element);
            size--;
        }
        return element;
    }

    @Override
    public E removeLast() {
        return null;
    }

    @Override
    public boolean containsElement(E element) {
        // make with rotate,without petlja
        return false;
    }

    @Override
    public void insertAtPosition(E element, int position) {

    }

    /**
     * Method that rotates tail in one direction
     */
    public void rotate(){
        if(isEmpty()){
            System.out.println("list is empty");
        } else {
            tail = tail.getNext();
            System.out.println("rotation for one step...");
        }
    }

    @Override
    public String toString() {
        return "CLL{" +
                "tail=" + tail.getElement() +
                ", size=" + size +
                '}';
    }
}
