package predavanja.predavanja12_4;

public class SLL_Concrete <E> implements  SLL<E>{

    private Node<E> head;
    private Node<E> tail;
    private int size;

    public SLL_Concrete(){
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

        Node<E> newNode = new Node<>(element, head);
        this.head = newNode;
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
            Node newNode = new Node(element, null);
            tail.setNext(newNode);
            tail = newNode;
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
            this.head = this.head;
            this.size --;
        } else {
            element = this.tail.getElement();
            Node<E> temp = this.head;
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
            Node<E> temp = this.head;
            while(!contains && !flag){

                if (element.equals(temp.getElement())){
                    System.out.println("Contains element in list!");
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
            Node<E> newNode = new Node<>(element, null);
            Node<E> temp = head;
            for (int i = 0; i < position-1; i++){
                temp = temp.getNext();
            }
            newNode.setNext(temp.getNext());
            temp.setNext(newNode);
            System.out.println("added at " + position);
            size ++;
        }
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
