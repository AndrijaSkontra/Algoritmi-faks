package vjezbe.vjezbe3.zadatak4;

public class TestingCLL {

    public static void main(String[] args) {
        CircularLinkedList<Integer> clist = new CircularLinkedList<>();
        System.out.println(clist);
        clist.addLast(3);
        System.out.println(clist);
        System.out.println(clist.getTail());
        clist.addLast(1);
        System.out.println(clist);
        System.out.println(clist.getTail());
        clist.addFirst(2);
        System.out.println(clist);
        // myb check tail
        clist.addLastBeforeTail(0);
        System.out.println(clist);
        System.out.println(clist.getTail()); // works
        int removed = clist.removeFirst();
        System.out.println(clist);
        System.out.println("removed: " + removed);
        clist.rotate();
        System.out.println(clist);

    }
}
