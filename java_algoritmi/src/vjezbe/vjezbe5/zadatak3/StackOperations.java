package AlgoritmiVjezba5.zadatak3;

import java.util.Stack;

public class StackOperations {

    public static <E> StackWorking manipStacks(Stack<E> stack1, Stack<E> stack2) {

        StackWorking<E> stacks = new StackWorking<>();
        Stack<E> temp = (Stack<E>) stack2.clone();
        stack2.clear();
        System.out.println("Starting stack1 stack:");
        System.out.println(stack1);
        stack2 = emptyStog(stack1, stack2);
        System.out.println("Starting S2 stack...");
        System.out.println(temp);
        System.out.println("Now S2 is:");
        System.out.println(stack2);
        stack1 = (Stack<E>) temp.clone();
        System.out.println("stack1 now is a clone...");
        System.out.println(stack1);
        stacks.setStg1(stack1);
        stacks.setStg2(stack2);
        temp.clear();
        temp = null;
        return stacks;
    }

    private static <E> Stack<E> emptyStog(Stack<E> stog, Stack<E> another) {
        // empty content of the Stack stog into the Stack another
        while (!stog.isEmpty()) {
            another.push(stog.pop());
        }
        return another;
    }
}
