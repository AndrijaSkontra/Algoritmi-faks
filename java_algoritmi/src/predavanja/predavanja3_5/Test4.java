package predavanja.predavanja3_5;

import java.util.ArrayList;
import java.util.TreeMap;

public class Test4 {

    public static void main(String[] args) {
        TreeMap<Integer, ArrayList<Student>> mapStudents = new TreeMap<Integer, ArrayList<Student>>();
        ArrayList<Student> studentsZero = new ArrayList<>();
        Student s1 = new Student("Paško");
        Student s2 = new Student("Božo");
        Student s3 = new Student("Miki");
        Student s4 = new Student("Stipe");

        studentsZero.add(s1);
        studentsZero.add(s2);
        studentsZero.add(s3);
        studentsZero.add(s4);
        mapStudents.put(10, studentsZero);
        System.out.println(mapStudents);

        Student s7 = new Student("LIK");
        Student s6 = new Student("ROUYMOM");

        addElemForKey(mapStudents, 5, s7);
        addElemForKey(mapStudents, 10, s6);
        System.out.println(mapStudents);
        listElemFromMap(mapStudents);

    }

    private static void addElemForKey(TreeMap<Integer, ArrayList<Student>> mapStudents, Integer key, Student student) {
        if (mapStudents.containsKey(key)) {
            ArrayList<Student> studentsK = mapStudents.get(key);
            studentsK.add(student);
            mapStudents.put(key, studentsK);
        } else {
            ArrayList<Student> studeny = new ArrayList<>();
            studeny.add(student);
            mapStudents.put(key, studeny);
        }

    }

    private static void listElemFromMap (TreeMap<Integer, ArrayList<Student>> mapa) {
        for (Integer key : mapa.keySet()) {
            System.out.println("key is: " + key);
            for (Student student : mapa.get(key)) {
                System.out.println(student);
            }
            System.out.println("------------------------------");
        }
    }
}
