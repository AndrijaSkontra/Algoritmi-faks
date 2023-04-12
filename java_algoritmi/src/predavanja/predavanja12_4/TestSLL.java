package predavanja.predavanja12_4;

public class TestSLL {

    public static void main(String[] args) {
        SLL_Concrete<Integer> sll = new SLL_Concrete<>();
        System.out.println(sll);
        sll.addFirst(10);
        System.out.println(sll);
        sll.addFirst(110);
        System.out.println(sll);
        sll.addFirst(1110);
        System.out.println(sll);
        sll.addLast(-1000);
        System.out.println(sll);
        System.out.println("--------------------------------------");
        Integer elem = sll.removeLast();
        System.out.println(elem);
        System.out.println(sll);
        boolean ce = sll.containsElement(1110);
        boolean ce2 = sll.containsElement(999);
        System.out.printf("\nContains -> %b%nContains -> %b%n", ce, ce2);
        sll.insertAtPosition(1234, 2);
        System.out.println(sll.size());
        System.out.println(sll);
    }
}
