package predavanja.predavanja26_4reverse;

import predavanja.predavanja26_4.ArrayStackImplementation;
import predavanja.predavanja26_4.STACK;

public class TestReverse {

    public static void main(String[] args) {
        String polazni = "kako riješiti problem?";
        String rev = "";
        STACK<String> stog = new ArrayStackImplementation<>(polazni.length());
        for (int i = 0; i < polazni.length(); i++) {
            stog.push(String.valueOf(polazni.charAt(i)));
        }
        for (int i = 0; i < polazni.length(); i++) {
            rev += stog.pop();
        }
        System.out.println(rev);
    }
}
