package predavanja.predavanja26_4;

public class TestStack {

    public static void main(String[] args) {
        ArrayStackImplementation<Integer> stack = new ArrayStackImplementation<>(5);
        System.out.println(stack);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println(stack);
        stack.push(60);
        stack.push(70);
        System.out.println(stack);
        stack.pop();
        stack.pop();
        System.out.println(stack);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
    }
}
