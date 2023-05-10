package predavanja.predavanja3_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class Test2 {

    public static void main(String[] args) {
        Integer[] someArr = new Integer[5];
        someArr[0] = 10;
        someArr[1] = 20;
        someArr[2] = 10;
        someArr[3] = 110;
        someArr[4] = 100;
        List<Integer> myList = Arrays.asList(someArr);
        TreeSet<Integer> tSet = new TreeSet<>(myList);
        System.out.println(tSet); // sorts and removes duplicates

        TreeSet<Student> students = new TreeSet<>();
        Student s1 = new Student("Paško");
        Student s2 = new Student("Božo");
        Student s3 = new Student("Miki");
        Student s4 = new Student("Stipe");

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        System.out.println(students);


    }
}
