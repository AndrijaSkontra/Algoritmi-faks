package double_linked_list;

public class TestMyList {

    public static void main(String[] args) {

        DoubleLinkedList_Concrete<Integer> myList = new DoubleLinkedList_Concrete<>();

        myList.addFirst(222);
        System.out.println(myList);
        myList.addLast(111);
        System.out.println(myList);

        myList.insertAtPosition(333, 2);
        System.out.println(myList);
        myList.insertAtPosition(444, 1);
        System.out.println(myList);

        System.out.println(myList.containsElement(222));
        System.out.println(myList.containsElement(333));
        System.out.println(myList.containsElement(64613));

        myList.removeFirst();
        System.out.println(myList);

        myList.removeLast();
        System.out.println(myList);

    }
}
