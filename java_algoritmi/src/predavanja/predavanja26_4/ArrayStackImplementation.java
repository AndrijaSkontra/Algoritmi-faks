package predavanja.predavanja26_4;

public class ArrayStackImplementation <E> implements STACK<E>{

    private E[] stack;
    private int index = -1;
    private static final int CAPACITY = 50;

    public ArrayStackImplementation() {
        this.stack = (E[]) new Object[CAPACITY];
    }

    public ArrayStackImplementation(int capacity) {
        this.stack = (E[]) new Object[capacity];
    }

    @Override
    public int size() {
        return index + 1;
    }

    @Override
    public boolean isEmpty() {
        return index == -1;
    }

    @Override
    public E top() {
        E element = null;
        if(isEmpty()) {
            System.out.println("The stack is empty - nothing to fetch.");
        } else {
            element = stack[index];
        }
        return element;
    }

    @Override
    public E pop() {
        E element = null;
        if (isEmpty()) {
            System.out.println("Nothing to remove...");
        } else {
            element = stack[index];
            stack[index] = null;
            index--;
            System.out.println("Element removed - " + element);
        }
        return element;
    }

    @Override
    public void push(E element) {
        index++;
        System.out.println("pushing to index..." + index + " size: " + size() + " |lenght: " + stack.length);
        if(index >= stack.length) {
            System.out.println("Stack is full, can't push!");
            index--;
        } else {

            stack[index] = element;
            System.out.println("Pushed element on the top of the stack" + element);
        }
    }

    @Override
    public String toString() {

        String rep = "size: " + size() + "\n";
        for(int i = size() - 1; i >= 0; i--) {
            rep += "| " + stack[i] + " |\n";
        }
        return rep;
    }
}
