package predavanja.predavanja3_5;

import java.util.ArrayList;
import java.util.HashSet;

public class Test {

    public static void main(String[] args) {
        ArrayList<String> lst = new ArrayList<>(7);
        populateList(lst, 4);
        System.out.println(lst);
        lst.add("novi");
        lst.add("novi");
        System.out.println(lst);

        HashSet<String> set1 = new HashSet<>(lst);
        System.out.println(set1);
        for(Object element : set1) {
            System.out.println(element);
        }

    }

    private static <E> void populateList(ArrayList<E> lista, int elements) {
        for (int k = 0; k < elements; k++) {
            E element = (E) new Object();
            lista.add(element);
        }
        System.out.println("list changed!");
    }
}
