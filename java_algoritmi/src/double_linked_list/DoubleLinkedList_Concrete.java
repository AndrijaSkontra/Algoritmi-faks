package double_linked_list;

import predavanja.predavanja12_4.Node;
import predavanja.predavanja12_4.SLL;

public class DoubleLinkedList_Concrete <E> implements SLL <E> {

    private NodeDoubleLink<E> head = null;
    private NodeDoubleLink<E> tail = null;
    private int size;

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        boolean flag;
        if (this.size == 0) {
            flag = true;
        } else {
            flag = false;
        }
        return flag;
    }

    @Override
    public void addFirst(E element) {
        NodeDoubleLink<E> newNode = new NodeDoubleLink<>(element, head, null);
        this.head = newNode;
        if (this.size == 0) {
            this.tail = newNode;
        }
        this.size ++;
    }

    @Override
    public void addLast(E element) {
        NodeDoubleLink<E> newNode = new NodeDoubleLink<>(element, null, tail);
        tail.setNext(newNode);
        tail = newNode;
        if (this.size == 0) {
            this.head = newNode;
        }
        this.size ++;
    }

    @Override
    public E removeFirst() {
        E element = null;
        if (isEmpty()){
            System.out.println("nothing to remove");
        } else if (this.size == 1){
            element = this.head.getElement();
            this.head = null;
            this.tail = null;
            this.size --;
        } else {
            element = this.head.getElement();
            this.head = this.head.getNext();
            this.head.setBefore(null);
            this.size --;
        }
        return element;
    }

    @Override
    public E removeLast() {
        E element = null;
        if (isEmpty()){
            System.out.println("Nothing to remove");
        } else if (this.size == 1){
            element = this.tail.getElement();
            this.tail = null;
            this.head = null;
            this.size --;
        } else {
            element = this.tail.getElement();
            this.tail = this.tail.getBefore();
            this.tail.setNext(null);
            this.size --;
        }
        return element;
    }

    @Override
    public boolean containsElement(E element) {
        boolean contains = false;
        boolean flag = false;
        if(isEmpty()){
            System.out.println("list is empty, nothing to search.");
        } else {
            NodeDoubleLink<E> temp = this.head;
            while(!contains && !flag) {
                if (element.equals(temp.getElement())){
                    System.out.println("Contains element!");
                    contains = true;
                    flag = true;
                }
                temp = temp.getNext();
                if (temp == null){
                    flag = true;
                }
            }
        }
        return contains;
    }

    @Override
    public void insertAtPosition(E element, int position) {
        if (position < 0 || position > this.size){
            System.out.println("Index out of bounds");
            throw new IndexOutOfBoundsException();
        } else if (this.size == 0 && position == 1){
            addFirst(element);
        } else if (position == this.size){
            addLast(element);
        } else {
            NodeDoubleLink<E> temp1 = this.head;
            NodeDoubleLink<E> temp2 = this.tail;
            for (int i = 0; i < position - 1; i++){
                temp1 = temp1.getNext();
            }
            for (int i = this.size - 1; i > position; i--){
                temp2 = temp2.getBefore();
            }
            NodeDoubleLink<E> newNode = new NodeDoubleLink<>(element, temp2, temp1);
            temp1.setNext(newNode);
            temp2.setBefore(newNode);
            System.out.println();
            this.size++;
        }

    }

    @Override
    public String toString() {
        return "DoubleLinkedList_Concrete{" +
                "head=" + head +
                ", tail=" + tail +
                ", size=" + size +
                '}';
    }
}
