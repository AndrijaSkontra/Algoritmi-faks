package vjezbe.vjezbe3.doublelinkedlist;

public class NodeDLL <E> {

    private E element;
    private NodeDLL<E> next;
    private NodeDLL<E> before;

    public NodeDLL(E element, NodeDLL<E> next, NodeDLL<E> before) {
        this.element = element;
        this.next = next;
        this.before = before;
    }


    public E getElement() {
        return element;
    }

    public NodeDLL<E> getNext() {
        return next;
    }

    public void setNext(NodeDLL<E> next) {
        this.next = next;
    }

    public NodeDLL<E> getBefore() {
        return before;
    }

    public void setBefore(NodeDLL<E> before) {
        this.before = before;
    }

    @Override
    public String toString() {
        return "NodeDoubleLink{" +
                "element=" + element +
                ", next=" + next +
                ", before=" + (before != null ? before.getElement() : "null") + // doing this to prevent stackoverflow
                '}';
    }
}
