package vjezbe.vjezbe6;

import java.util.*;

public class Zadatak4i5i7 {
    public static <T> T[] shuffleArray(T[] array) {
        List<T> list = new ArrayList<>(Arrays.asList(array));
        Collections.shuffle(list);
        return list.toArray(array);
    }

    public static <T> List<T> generateRandomList(int size, T[] elements) {
        List<T> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            int index = random.nextInt(elements.length);
            list.add(elements[index]);
        }

        return list;
    }

    public static <T> void findDuplicates(List<T> list) {
        System.out.println("Lista:");
        System.out.println(list);

        Set<T> uniqueElements = new HashSet<>();
        Set<T> duplicates = new HashSet<>();

        for (T element : list) {
            if (!uniqueElements.add(element)) {
                duplicates.add(element);
            }
        }

        System.out.println("Elementi bez ponavljanja:");
        System.out.println(uniqueElements);

        System.out.println("Duplikati:");
        System.out.println(duplicates);
    }

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Original array: " + Arrays.toString(numbers));

        // Shuffle the array
        shuffleArray(numbers);
        System.out.println("Shuffled array: " + Arrays.toString(numbers));

        // Generate a random list with duplicates
        List<Integer> randomList = generateRandomList(10, numbers);
        System.out.println("Generated random list: " + randomList);

        // Find duplicates in the generated random list
        findDuplicates(randomList);
    }

}

