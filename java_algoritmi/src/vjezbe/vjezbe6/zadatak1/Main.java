package vjezbe.vjezbe6.zadatak1;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    private static long myFullTime = 0;
    private static long javaFullTime = 0;

    public static void main(String[] args) {

        for (int i = 0; i < 1000; i++) {
            testBinSearch();
        }
        System.out.println("my time \t- " + myFullTime);
        System.out.println("java time \t- " + javaFullTime);
        long diff = myFullTime - javaFullTime;
        System.out.println("java is faster by " + (((double)diff / (double)javaFullTime)*100) + " %");

    }

    private static boolean binarySearch(int[] arrayToSearchIn, int elementToFind) {

        Arrays.sort(arrayToSearchIn);

        int middle = arrayToSearchIn.length / 2;

        if (elementToFind == arrayToSearchIn[middle]) {
            return true;
        } else {
            if (arrayToSearchIn.length > 1) {
                if (arrayToSearchIn[middle] < elementToFind) {
                    int[] array2 = Arrays.copyOfRange(arrayToSearchIn, middle, arrayToSearchIn.length);
                    return binarySearch(array2, elementToFind);
                } else if (arrayToSearchIn[middle] > elementToFind) {
                    int[] array2 = Arrays.copyOfRange(arrayToSearchIn, 0, middle);
                    return binarySearch(array2, elementToFind);
                }
            }
            else {
                return false;
            }
        }
        return false;
    }

    private static void testBinSearch() {
        int[] arr = new int[10000];
        for (int num : arr) {
            num = ThreadLocalRandom.current().nextInt(1, 3003);
        }
        int[] arr2 = Arrays.copyOf(arr, 10000);

        int numToFind = ThreadLocalRandom.current().nextInt(1, 3003);

        long start = System.nanoTime();
        binarySearch(arr, numToFind);
        long end = System.nanoTime();
        myFullTime += (end -start);

        start = System.nanoTime();
        Arrays.binarySearch(arr2, numToFind);
        end = System.nanoTime();
        javaFullTime += (end - start);
    }
}
