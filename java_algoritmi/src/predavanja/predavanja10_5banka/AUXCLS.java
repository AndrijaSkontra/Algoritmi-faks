package predavanja.predavanja10_5banka;

import java.util.Random;

public class AUXCLS {

    private static Random random = new Random();

    public static String generateRandomName() {

        String name = "";
        for (int i = 0; i < random.nextInt(2, 5); i++) {
            name += randomConsonant();
            name += randomVowel();
        }

        return name;
    }

    public static int generateRandomAge() {
        return random.nextInt(18, 70);
    }

    private static char randomConsonant() {
        String consonants = "mrlptvn";
        char[] consonantsArray = consonants.toCharArray();
        int index = random.nextInt(consonantsArray.length);
        char randomConsonant = consonantsArray[index];

        return randomConsonant;
    }

    private static char randomVowel() {
        String vowels = "auioeaai";
        char[] vowelsArray = vowels.toCharArray();
        int index = random.nextInt(vowelsArray.length);
        char randomVowel = vowelsArray[index];

        return randomVowel;
    }
}
