//insert element in array code!
package predavanja.predavanje29_3;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] ourArray = {1, 2, 3, 4};
        System.out.println("Our array is: " + Arrays.toString(ourArray));
        System.out.println("What number do you want to insert to our array? ");
        int element = scanner.nextInt();
        int index;
        do{
            System.out.println("In what index position do you want to insert(between 0 and 4): ");
            scanner.nextLine(); // cistimo scanner
            index = scanner.nextInt();
        } while(index < 0 || index > 4);
        ourArray = insertElement(element, index, ourArray);
        System.out.println(Arrays.toString(ourArray));
        scanner.close();

        int[] arr = {2, 5, 3, 8, 10, 1};
        System.out.println("value in array = " + binarySearchIter(arr, 0));


    }

    public static int[] insertElement(int element, int index, int[]array){
        System.out.printf("Inserting number %d at position index: %d ...\n", element, index);
        int[] arrPartOne = Arrays.copyOfRange(array, 0, index);
        int[] ourElem = {element};
        int[] arrPartTwo = Arrays.copyOfRange(array, index, array.length); // ide od indexa to zadnjeg elementa

        int[] konacniArray = new int[arrPartOne.length + ourElem.length + arrPartTwo.length];
        //popunjavamo konacni array
        System.arraycopy(arrPartOne, 0, konacniArray, 0, arrPartOne.length);
        konacniArray[arrPartOne.length] = ourElem[0];
        System.arraycopy(arrPartTwo, 0, konacniArray, arrPartOne.length + 1, arrPartTwo.length);

        return konacniArray;
    }

    public static boolean binarySearchIter(int[] arr, int value) {
        Arrays.sort(arr);
        System.out.println("--------------------------------\n finding " + value + "...");
        System.out.println(Arrays.toString(arr));
        int left = 0;
        int right = arr.length - 1;
        boolean status = false;
        while (left <= right){
            int middlePoint = (right + left)/2;
            if (arr[middlePoint] == value) {
                System.out.println("Value is in array = " + value);
                status = true;
                break;
            }
            else {
                if (arr[middlePoint] > value) right = middlePoint - 1;
                else left = middlePoint + 1;
            }
        }
        return status;
    }
}
