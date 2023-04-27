package vjezbe.vjezbe3.zadatak3;

import vjezbe.vjezbe3.LLI;
import vjezbe.vjezbe3.singlelinkedlist.NodeSLL;

public class CircularLinkedList <E> implements LLI<E> {

    private NodeSLL<E> tail;
    private int size;

    public CircularLinkedList() {
        this.tail = null;
        this.size = 0;
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
    public void addFirst(E element) { // ovo ce biti naš addLast po profesorovom zadatku
        if (isEmpty()) {
            tail = new NodeSLL<>(element, null);
            tail.setNext(tail);
        } else {
            NodeSLL<E> newNode = new NodeSLL<>(element, tail.getNext());
            tail.setNext(newNode);
            tail = newNode;
        }
        size++;
    }

    @Override
    public void addLast(E element) {
        if (isEmpty()) {
            addFirst(element);
        } else {
            NodeSLL<E> newNode = new NodeSLL<>(element, tail);

        }
    }

    @Override
    public E removeFirst() {
        return null;
    }

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
        return null;
    }

    @Override
    public E getLast() {
        return null;
    }

    @Override
    public E remove(int index) {
        return null;
    }
}
