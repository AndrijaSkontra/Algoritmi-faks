package vjezbe.vjezbe1;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import org.apache.commons.lang3.ArrayUtils;

public class Zadatak_1_2_3 {

    public static void main(String[] args) {

        int[] niz1 = napraviArraySaOvolikoBrojeva(5);
        System.out.printf("Ovo je ne sortirani niz: %s\n", Arrays.toString(niz1));
        sort_swap(niz1);
        System.out.printf("Ovo je sortirani niz: %s", Arrays.toString(niz1));

    }
    /**
     * generira Array(niz), popunjava je random brojevima
     * @param brojElemenata broj elemenata niza
     * @return vraca popunjeni niz
     */
    public static int[] napraviArraySaOvolikoBrojeva(int brojElemenata) {

        int[] niz = new int[brojElemenata];

        for (int i = 0; i < brojElemenata; i++) {
            niz[i] = ThreadLocalRandom.current().nextInt(0, 301);
        }

        return niz;
    }

    /**
     * @param nekiNiz ulazni parametar je neki niz s barem jednim elementom
     * @return vraca najveci broj u nizu i njegov index u obliku liste gdje je
     * nulti element najveci broj,a prvi element je njegov index
     */
    public static int[] najveciBroj(int[] nekiNiz) {
        int najveci = nekiNiz[0];

        for (int j : nekiNiz) if (j > najveci) najveci = j;

        int index = ArrayUtils.lastIndexOf(nekiNiz, najveci); //ovaj library treba staviti u project za koristenje
        return new int[]{najveci, index};
    }

    /**
     * Metoda koja sortira niz uzlazno
     * @param ulazniNiz niz koji zelimo sortirati
     */
    public static void sort_swap(int[] ulazniNiz) {
        int temp;

        for (int i = 0; i < ulazniNiz.length - 1; i++) {
            temp = ulazniNiz[i];
            ulazniNiz[i] = najveciBroj(Arrays.copyOfRange(ulazniNiz, i, ulazniNiz.length))[0];
            ulazniNiz[najveciBroj(Arrays.copyOfRange(ulazniNiz, i, ulazniNiz.length))[1] + i] = temp;
        }


    }
}
