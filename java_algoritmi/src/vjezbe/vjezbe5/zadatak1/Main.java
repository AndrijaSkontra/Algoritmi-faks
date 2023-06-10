package AlgoritmiVjezba5.zadatak1;

import java.util.ArrayList;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(123);
        arrayList.add(122);
        arrayList.add(125);
        arrayList.add(112);
        arrayList.add(122);

        System.out.println("List before changing: ");
        System.out.println(arrayList);
        reverseArrayList(arrayList);
        System.out.println("List AFTER changing:");
        System.out.println(arrayList);

    }

    private static <E> void reverseArrayList(ArrayList<E> arrayList) {

        Stack<E> stack = new Stack<>();
        stack.addAll(arrayList);

        arrayList.clear();
        while(!stack.isEmpty()) {
            arrayList.add(stack.pop());
        }
    }
}
