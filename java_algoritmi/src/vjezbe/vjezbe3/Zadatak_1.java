package vjezbe.vjezbe3;

import vjezbe.vjezbe3.doublelinkedlist.DLL_Concrete;
import vjezbe.vjezbe3.doublelinkedlist.NodeDLL;
import vjezbe.vjezbe3.singlelinkedlist.NodeSLL;
import vjezbe.vjezbe3.singlelinkedlist.SingleLinkedList;

public class Zadatak_1 {

    private static SingleLinkedList<Integer> slist;

    public static void main(String[] args) {
        testSLL();
        // testDLL();

    }

    private static void testSLL() {
        NodeSLL<Integer> node1 = new NodeSLL<>(10, null);
        NodeSLL<Integer> node2 = new NodeSLL<>(100, node1);
        System.out.println(node2);

        slist = new SingleLinkedList<>();
        System.out.println(slist);

        slist.addFirst(10);
        slist.addFirst(20);
        System.out.println(slist);

        slist.addLast(30);
        slist.addLast(40);
        System.out.println(slist);
        // slist.insertAtPosition(2, -123); throws index out of bounds

        Integer elem = slist.remove(1);
        System.out.println(slist);

        System.out.println("deleted element is: " + elem);
        System.out.println("list contains 30: " + slist.containsElement(30));
        System.out.println("list contains 10: " + slist.containsElement(10));

        slist.removeFirst();
        slist.removeLast();
        System.out.println(slist);
    }
    private static void testDLL() {
        NodeDLL<Integer> node1 = new NodeDLL<>(25, null, null);
        NodeDLL<Integer> node2 = new NodeDLL<>(15, null, node1);
        System.out.println(node2);

        DLL_Concrete<Integer> dlist = new DLL_Concrete<>();
        dlist.addLast(300);
        dlist.addFirst(200);
        dlist.addFirst(100);
        dlist.addLast(400);
        System.out.println(dlist);

        dlist.insertAtPosition(500, 4);
        System.out.println(dlist);

        Integer elem = dlist.remove(2);
        System.out.println(dlist);
        System.out.println("removed element is: " + elem);

        System.out.println("list contains 500: " + dlist.containsElement(500));
        System.out.println("list contains 300: " + dlist.containsElement(300));

        dlist.removeFirst();
        dlist.removeLast();
        System.out.println(dlist);
    }
}
