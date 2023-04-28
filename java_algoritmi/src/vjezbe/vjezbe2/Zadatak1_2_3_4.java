package vjezbe.vjezbe2;

import java.util.Arrays;

public class Zadatak1_2_3_4 {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5};

        System.out.println("Original array: " + Arrays.toString(myArray));

        // Implementing "contains"
        int searchValue = 3;
        boolean containsValue = contains(myArray, searchValue);
        System.out.println("Array contains " + searchValue + "? " + containsValue);

        // Implementing "sort"
        sort(myArray);
        System.out.println("Sorted array: " + Arrays.toString(myArray));

        // Implementing "insert"
        int insertValue = 10;
        int insertIndex = 2;
        myArray = insert(myArray, insertValue, insertIndex);
        System.out.println("Array after inserting " + insertValue + " at index " + insertIndex + ": " + Arrays.toString(myArray));

        // Implementing "update"
        int updateValue = 7;
        int updateIndex = 3;
        update(myArray, updateValue, updateIndex);
        System.out.println("Array after updating index " + updateIndex + " to " + updateValue + ": " + Arrays.toString(myArray));

        // Implementing "delete"
        int deleteIndex = 0;
        myArray = delete(myArray, deleteIndex);
        System.out.println("Array after deleting index " + deleteIndex + ": " + Arrays.toString(myArray));

        // Implementing "swap"
        int index1 = 1;
        int index2 = 3;
        swap(myArray, index1, index2);
        System.out.println("Array after swapping indexes " + index1 + " and " + index2 + ": " + Arrays.toString(myArray));
    }

    public static boolean contains(int[] arr, int searchValue) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchValue) {
                return true;
            }
        }
        return false;
    }

    public static void sort(int[] arr) {
        Arrays.sort(arr);
    }

    public static int[] insert(int[] arr, int insertValue, int insertIndex) {
        int[] newArray = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            if (i < insertIndex) {
                newArray[i] = arr[i];
            } else {
                newArray[i+1] = arr[i];
            }
        }
        newArray[insertIndex] = insertValue;
        return newArray;
    }


    public static void update(int[] arr, int updateValue, int updateIndex) {
        arr[updateIndex] = updateValue;
    }

    public static int[] delete(int[] arr, int deleteIndex) {
        int[] newArray = new int[arr.length - 1];
        for (int i = 0; i < deleteIndex; i++) {
            newArray[i] = arr[i];
        }
        for (int i = deleteIndex + 1; i < arr.length; i++) {
            newArray[i - 1] = arr[i];
        }
        return newArray;
    }


    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}

