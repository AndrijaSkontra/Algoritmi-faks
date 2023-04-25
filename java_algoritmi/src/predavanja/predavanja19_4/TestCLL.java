package predavanja.predavanja19_4;

public class TestCLL {

    public static void main(String[] args) {
        CLL <Integer> clli= new CLL<>();
        System.out.println("Size after creation is = " + clli.size());
        clli.addFirst(111);
        System.out.println(clli);
        clli.addLast(222);
        System.out.println(clli);
        clli.rotate();
        System.out.println(clli);
        // Integer element1 = clli.removeFirst();
        // Integer element2 = clli.removeFirst();
        // Integer element3 = clli.removeFirst();
    }
}
