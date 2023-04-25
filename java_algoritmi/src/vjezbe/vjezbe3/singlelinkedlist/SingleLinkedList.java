package vjezbe.vjezbe3.singlelinkedlist;

import vjezbe.vjezbe3.LLI;

public class SingleLinkedList <E> implements LLI<E> {

    private NodeSLL<E> head;
    private NodeSLL<E> tail;
    private int size;

    public SingleLinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public void addFirst(E element) {

        NodeSLL<E> newNodeSLL = new NodeSLL<>(element, head);
        this.head = newNodeSLL;
        if (this.isEmpty()){
            this.tail = this.head;
        }
        this.size ++;
    }

    @Override
    public void addLast(E element) {

        if (this.isEmpty()){
            addFirst(element);
        } else{
            NodeSLL newNodeSLL = new NodeSLL(element, null);
            tail.setNext(newNodeSLL);
            tail = newNodeSLL;
        }
        this.size ++;

    }

    @Override
    public E removeFirst() {
        E element = null;
        if (isEmpty()){
            System.out.println("The list is empty - nothing to remove...");
        } else if (size == 1) {
            element = this.head.getElement();
            this.head = null;
            this.tail = this.head;
            this.size --;
        } else {
            element = this.head.getElement();
            this.head = this.head.getNext();
            this.size --;
        }

        return element;
    }

    @Override
    public E removeLast() {
        E element = null;
        if (isEmpty()){
            System.out.println("The list is empty - nothing to remove...");
        } else if (size == 1) {
            element = this.tail.getElement();
            this.tail = null;
            this.head = null;
            this.size --;
        } else {
            element = this.tail.getElement();
            NodeSLL<E> temp = this.head;
            for (int i = 0; i < size - 2; i++){
                temp = temp.getNext();
            }
            temp.setNext(null);
            this.tail = temp;
            this.size --;
        }
        return element;
    }

    @Override
    public boolean containsElement(E element) {
        boolean contains = false;
        boolean flag = false;
        if (isEmpty()){
            System.out.println("The list is empty, no elements to search");
        } else{
            NodeSLL<E> temp = this.head;
            while(!contains && !flag){

                if (element.equals(temp.getElement())){
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
        if (position < 0 || position > size + 1){
            System.out.println("Index out of bounds");
            throw new IndexOutOfBoundsException();
        } else if (size == 0 && position == size + 1) {
            addFirst(element);
            size ++;
        } else if (position == size){
            addLast(element);
            size++;
        } else {
            NodeSLL<E> newNodeSLL = new NodeSLL<>(element, null);
            NodeSLL<E> temp = head;
            for (int i = 0; i < position-1; i++){
                temp = temp.getNext();
            }
            newNodeSLL.setNext(temp.getNext());
            temp.setNext(newNodeSLL);
            System.out.println("added at " + position);
            size ++;
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
            NodeSLL<E> temp1 = head;
            NodeSLL<E> temp2 = head;
            for (int i = 0; i < index - 1; i++) {
                temp1 = temp1.getNext();
            }
            for (int i = 0; i < index; i++) {
                temp2 = temp2.getNext();
            }
            temp1.setNext(temp2.getNext());
            temp2.setNext(null);
            element = temp2.getElement();
            size --;
        }
        return element;
    }

    @Override
    public String toString() {
        return "SLL_Concrete{" +
                "head=" + head +
                ", tail=" + tail +
                ", size=" + size +
                '}';
    }
}
