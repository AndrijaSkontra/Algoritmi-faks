import java.util.ArrayList;
import java.util.HashMap;

public class Test {

    public static void main(String[] args) {
        String filePath = "predavanja17_5\\src\\quotes.txt";
        ArrayList<String> text = AUX_CLS.readDataFromFile(filePath);
        // AUX_CLS.readTextFromArrayList(text, 10);
        int[] lenght = {3, 4, 7, 11, 15};
        HashMap<Integer, Integer> mapOfWords = AUX_CLS.wordCounterByLenght(text, lenght);

        for (Integer key : mapOfWords.keySet()) {
            System.out.println("N= " + key + " | Freq = " + mapOfWords.get(key));
        }

    }
}
