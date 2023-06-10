package AlgoritmiVjezba5.zadatak3;

import java.util.Stack;

public class StackWorking<E> {

    private Stack<E> stg1;
    private Stack<E> stg2;

    public StackWorking() {
    }

    public StackWorking(Stack<E> stg1, Stack<E> stg2) {
        this.stg1 = stg1;
        this.stg2 = stg2;
    }

    public void listAllStacks() {
        System.out.println(stg1.getClass().getSimpleName() );
        System.out.print("S1 as cloniramo of orignal S2 -> \t");
        System.out.println(stg1);
        System.out.println(stg2.getClass().getSimpleName());
        System.out.print("S2 as inverse of orignal S1 -> \t");
        System.out.println(stg2);
    }

    public Stack<E> getStg1() {
        return stg1;
    }

    public Stack<E> getStg2() {
        return stg2;
    }

    public void setStg1(Stack<E> stg1) {
        this.stg1 = stg1;
    }

    public void setStg2(Stack<E> stg2) {
        this.stg2 = stg2;
    }
}