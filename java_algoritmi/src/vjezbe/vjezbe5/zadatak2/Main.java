package vjezbe.vjezbe5.zadatak2;

public class Main {

    public static void main(String[] args) {
        String expr1 = "a+b+c";
        System.out.println(expr1 + "\n");
        AlgorithmClass.ShuntingYard(expr1);
    }
}
