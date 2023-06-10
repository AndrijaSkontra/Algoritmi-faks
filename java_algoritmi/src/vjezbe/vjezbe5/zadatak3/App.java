package AlgoritmiVjezba5.zadatak3;

import java.util.Stack;

public class App {

    public static void main(String[] args) {

        Stack<String> S1 = new Stack<>();
        Stack<String> S2 = new Stack<>();
        S1.push("1");
        S1.push("2");
        S1.push("3");
        S1.push("4");
        S1.push("5");
        S2.push("prvi");
        S2.push("drugi");
        S2.push("treći");
        S2.push("cetvrti");
        S2.push("peti");
        StackWorking<String> stacks = StackOperations.manipStacks(S1, S2);
        stacks.listAllStacks();
    }
}
