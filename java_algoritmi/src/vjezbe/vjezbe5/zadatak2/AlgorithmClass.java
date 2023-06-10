package vjezbe.vjezbe5.zadatak2;

import java.util.Stack;

public class AlgorithmClass {

    private static Stack<String> stack = new Stack<>();
    private static StringOperator strOperator = new StringOperator();
    private static StringBuilder out = new StringBuilder();

    public static void ShuntingYard(String expresion) {

        for (String ch : expresion.split("")) {

            if(strOperator.getOperatorMap().containsKey(ch)) {
                while(!stack.isEmpty() && strOperator.isHigherPriority(stack.peek(), ch))  {

                    out.append(stack.pop()).append(" ");
                }
                stack.push(ch);
            } else if(ch.equals("(")) {
                stack.push(ch);
            } else if(ch.equals(")")) {
                while(!stack.peek().equals("(")) {
                    out.append(stack.pop()).append(" ");
                }
            } else {
                out.append(ch).append(" ");
            }
        }

        while(!stack.isEmpty()) {
            out.append(stack.pop()).append(" ");
        }
        System.out.println(out); //tostr
    }
}
