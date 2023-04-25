package vjezbe.vjezbe3.doublelinkedlist;

import vjezbe.vjezbe3.LLI;

public class DLL_Concrete <E> implements LLI<E> {

    private NodeDLL<E> head = null;
    private NodeDLL<E> tail = null;
    private int size = 0;

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public void addFirst(E element) {
        if (isEmpty()) {
            NodeDLL<E> newNode = new NodeDLL<>(element, null, null);
            this.head = newNode;
            tail = newNode;
        } else {
            NodeDLL<E> newNode = new NodeDLL<>(element, head, null);
            head.setBefore(newNode);
            head = newNode;
        }
        this.size ++;
    }

    @Override
    public void addLast(E element) {
        if (isEmpty()) {
            addFirst(element);
        } else {
            NodeDLL<E> newNode = new NodeDLL<>(element, null, tail);
            tail.setNext(newNode);
            tail = newNode;
            this.size ++;
        }

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
            NodeDLL<E> temp = this.head;
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
        } else if (position == 0){
            addFirst(element);
        } else if (position == this.size){
            addLast(element);
        } else {
            NodeDLL<E> temp = this.head;

            for (int i = 0; i < position - 1; i++) {
                temp = temp.getNext();
            }

            NodeDLL<E> newNode = new NodeDLL<>(element, temp.getNext(), temp);
            temp.getNext().setBefore(newNode);
            temp.setNext(newNode);
            this.size++;
        }

    }

    @Override
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public E getFirst() {
        return head.getElement();
    }

    @Override
    public E getLast() {
        return tail.getElement();
    }

    @Override
    public E remove(int index) {
        E element = null;
        if (isEmpty()) {
            System.out.println("this list is empty you cant remove!");
        } else if (size == 1 || index == 0) {
            element = removeFirst();

        } else if (index == size - 1) {
            element = removeLast();
        } else {
            NodeDLL<E> temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.getNext();
            }
            temp.getBefore().setNext(temp.getNext());
            temp.getNext().setBefore(temp.getBefore());
            temp.setNext(null);
            element = temp.getElement();
            size --;
        }
        return element;
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
