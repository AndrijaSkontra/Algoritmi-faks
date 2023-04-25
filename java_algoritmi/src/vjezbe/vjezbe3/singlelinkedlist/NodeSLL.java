package vjezbe.vjezbe3.singlelinkedlist;

public class NodeSLL <E>{

    private E element;
    private NodeSLL<E> next;

    public NodeSLL(E element, NodeSLL next){
        this.element = element;
        this.next = next;
    }

    public E getElement(){
        return this.element;
    }

    public NodeSLL getNext(){
        return this.next;
    }

    public void setNext(NodeSLL nextNode){
        this.next = nextNode;
    }

    @Override
    public String toString() {
        return "Node{" +
                "element=" + element +
                ", next=" + next +
                '}';
    }
}
