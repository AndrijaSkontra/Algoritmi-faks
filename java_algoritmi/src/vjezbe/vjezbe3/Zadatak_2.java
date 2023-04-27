package vjezbe.vjezbe3;

import vjezbe.vjezbe3.doublelinkedlist.DoubleLinkedList;
import vjezbe.vjezbe3.singlelinkedlist.SingleLinkedList;

import java.util.Random;

public class Zadatak_2 {

    private static double testSLL() {
        double startTime = (double) System.nanoTime();
        SingleLinkedList<Integer> slist = new SingleLinkedList<>();
        for (int j = 0; j < 100; j++) {
            for (int i = 0; i < 1000; i++) {
                slist.insertAtPosition(1, 0);
            }
            for (int i = 0; i < 1000; i++) {
                slist.remove(0);
            }
        }
        double endTime = (double) System.nanoTime();
        return ((endTime - startTime)/100.0)*Math.pow(10, -9);
    }

    private static double testDLL() {
        double startTime = (double) System.nanoTime();
        DoubleLinkedList<Integer> dlist = new DoubleLinkedList<>();
        for (int j = 0; j < 100; j++) {
            for (int i = 0; i < 1000; i++) {
                dlist.insertAtPosition(1, 0);
            }
            for (int i = 0; i < 1000; i++) {
                dlist.remove(0);
            }
        }
        double endTime = (double) System.nanoTime();
        return ((endTime - startTime)/100.0)*Math.pow(10, -9);
    }

    private static double testSLLAtEnd() {
        double startTime = (double) System.nanoTime();
        SingleLinkedList<Integer> slist = new SingleLinkedList<>();
        for (int j = 0; j < 100; j++) {
            for (int i = 0; i < 1000; i++) {
                slist.insertAtPosition(1, i);
            }
            for (int i = 999; i >= 0; i--) {
                slist.remove(i);
            }
        }
        double endTime = (double) System.nanoTime();
        return ((endTime - startTime)/100.0)*Math.pow(10, -9);
    }

    private static double testDLLAtEnd() {
        double startTime = (double) System.nanoTime();
        DoubleLinkedList<Integer> dlist = new DoubleLinkedList<>();
        for (int j = 0; j < 100; j++) {
            for (int i = 0; i < 1000; i++) {
                dlist.insertAtPosition(1, i);
            }
            for (int i = 999; i >= 0; i--) {
                dlist.remove(i);
            }
        }
        double endTime = (double) System.nanoTime();
        return ((endTime - startTime)/100.0)*Math.pow(10, -9);
    }

    public static void main(String[] args) {
        System.out.printf("Average time in seconds to insert and remove elements at" +
                " 0 position in SLL is: %.10f s\n", testSLL());
        System.out.printf("Average time in seconds to insert and remove elements at" +
                " 0 position in DLL is: %.10f s\n", testDLL());
        System.out.printf("Average time in SLL at end removing is: %.10f \n", testSLLAtEnd());
        System.out.printf("Average time in DLL at end removing is: %.10f \n", testDLLAtEnd());
    }
}