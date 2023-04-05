package predavanja.predavanja5_4;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Test {

    private static final int LWR = -10;
    private static final int UPR = 100;

    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<Integer>(10);
        createAndPopulateArrayList(lista, 5);
        System.out.println(lista);
        lista.add(0, -200);
        System.out.println(lista);
        // lista.clear();
        // System.out.println(lista);
        boolean containsEL = lista.contains(-100);
        System.out.println("Contains " + containsEL);
        int el = lista.get(3);
        System.out.println(el);
    }

    private static void createAndPopulateArrayList(ArrayList<Integer> lst, int numElem){

        for(int i = 0; i < numElem; i++){
            lst.add(ThreadLocalRandom.current().nextInt(LWR, UPR));
        }
        System.out.println("Gotovo generiranje liste!");

    }


}
