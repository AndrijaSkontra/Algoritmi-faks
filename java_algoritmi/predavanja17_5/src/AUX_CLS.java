import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class AUX_CLS {

    public static HashMap<Integer, Integer> wordCounterByLenght(ArrayList<String> text, int[] lenght) {
        HashMap<Integer, Integer> freqCounter = new HashMap<>();
        for (int i : lenght) {
            freqCounter.put(i, 0);
        }
        for (String line : text) {
            String[] words = line.split(" ");
            for (String word : words) {
                for (int num : lenght) {
                    if (num == word.length()) {
                        // add +1 to our value
                        freqCounter.put(num, freqCounter.get(num) + 1);
                    }
                }
            }
        }

        return freqCounter;
    }

    public static boolean fileExist(String filePath) {
        File file = new File(filePath);
        boolean exist = file.exists() && file.isFile();
        System.out.println("File exists: " + exist);
        System.out.println("File path: " + filePath);

        return exist;
    }

    public static ArrayList<String> readDataFromFile(String filePath) {
        ArrayList<String> text = new ArrayList<>();
        if(fileExist(filePath)) {
            try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
                String line;
                while((line = br.readLine()) != null) {
                    text.add(line);
                }
                System.out.println("Reading data from file is finished!");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("Can not read from file..File does not exist.");
        }

        return text;
    }

    public static void readTextFromArrayList(ArrayList<String> text, int numLines) {
        for (int i = 0; i < numLines; i++) {
            System.out.println(text.get(i));
        }
    }
}
