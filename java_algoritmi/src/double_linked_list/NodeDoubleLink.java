package double_linked_list;

public class NodeDoubleLink <E> {

    private E element;
    private NodeDoubleLink<E> next;
    private NodeDoubleLink<E> before;

    public NodeDoubleLink(E element, NodeDoubleLink<E> next, NodeDoubleLink<E> before) {
        this.element = element;
        this.next = next;
        this.before = before;
    }


    public E getElement() {
        return element;
    }

    public NodeDoubleLink<E> getNext() {
        return next;
    }

    public void setNext(NodeDoubleLink<E> next) {
        this.next = next;
    }

    public NodeDoubleLink<E> getBefore() {
        return before;
    }

    public void setBefore(NodeDoubleLink<E> before) {
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
