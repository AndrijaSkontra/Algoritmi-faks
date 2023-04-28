package vjezbe.vjezbe3.zadatak4;

public class NodeCLL <E> {

    private E element;
    private NodeCLL<E> next;

    public NodeCLL(E element, NodeCLL<E> next) {
        this.element = element;
        this.next = next;
    }

    public E getElement() {
        return element;
    }

    public NodeCLL<E> getNext() {
        return next;
    }

    public void setNext(NodeCLL<E> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "NodeCLL{" +
                "element=" + element +
                ", next=" + (next.equals(this) ? "isti" : "nije isti") +
                '}';
    }
}
