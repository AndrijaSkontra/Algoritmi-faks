package vjezbe.vjezbe3.zadatak4;

import vjezbe.vjezbe3.LLI;

public class CircularLinkedList <E> implements LLI<E> { // tail index = 0

    private NodeCLL<E> tail;
    private int size;

    public CircularLinkedList() {
        this.tail = null;
        this.size = 0;
    }

    public NodeCLL<E> getTail() {
        return tail;
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
    public void addFirst(E element) { // adding next after tail
        if (isEmpty()) {
            tail = new NodeCLL<>(element, null);
            tail.setNext(tail);
        } else {
            NodeCLL<E> newNode = new NodeCLL<>(element, tail.getNext());
            tail.setNext(newNode);
        }
        size++;
    }

    @Override
    public void addLast(E element) { // adding first then he becomes tail
        if (isEmpty()) {
            addFirst(element);
        } else {
            NodeCLL<E> newNode = new NodeCLL<>(element, tail.getNext());
            tail.setNext(newNode);
            tail = newNode;
            size++;
        }
    }

    public void addLastBeforeTail(E element) { // adding last
        if (isEmpty()) {
            addFirst(element);
        } else {
            NodeCLL<E> newNode = new NodeCLL<>(element, tail);
            NodeCLL<E> temp = tail;
            for (int i = 0; i < size - 1; i++) {
                temp = temp.getNext();
            }
            System.out.println(temp.getElement());
            temp.setNext(newNode);
            size++;
        }
    }

    @Override
    public E removeFirst() { // removes first after tail, looks like it removes second
        E element = null;

        if(isEmpty()) {
            System.out.println("Nothing to remove...");
        } else if (size == 1) {
            element = tail.getElement();
            tail = null;
            size--;
        } else {
            NodeCLL<E> temp = tail.getNext();
            element = temp.getElement();
            tail.setNext(temp.getNext());
            temp.setNext(null);
            size--;
        }

        return element;
    }


    // implement in future...
    @Override
    public E removeLast() {
        return null;
    }

    @Override
    public boolean containsElement(E element) {
        return false;
    }

    @Override
    public void insertAtPosition(E element, int position) {

    }

    @Override
    public void clear() {

    }

    @Override
    public E getFirst() {
        return tail.getNext().getElement();
    }

    @Override
    public E getLast() {
        return null;
    }

    @Override
    public E remove(int index) {
        return null;
    }

    public void rotate() {
        tail = tail.getNext();
    }

    @Override
    public String toString() {
        String rep = "[";
        if(tail == null) {
            rep = "[]";
        } else {
            NodeCLL<E> temp = tail;
            for (int i = 0; i < size; i++) {
                if (i == size - 1) {
                    rep += temp.getElement();
                } else {
                    rep += temp.getElement() + ", ";
                }
                temp = temp.getNext();
            }
            rep += "] -- size: " + size;
        }
        return rep;
    }
}
