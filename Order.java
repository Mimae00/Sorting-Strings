
import java.util.HashMap;
import java.util.Map;

public class Order {
    public static String order(String words) {
        // ...

        Map<Character, String> numberWordMap = new HashMap<>();

        //Seperating the words and putting it on list
        String[] paramWord = words.split(" ");


        // Iterate through the list of words
        for (String word : paramWord) {
            // Iterate through the characters of each word
            for (char c : word.toCharArray()) {
                if (Character.isDigit(c)) {
                    // Add the number and word to the map
                    numberWordMap.put(c, word);
                }
            }
        }

        StringBuilder concatenatedWords = new StringBuilder();
        for (String word : numberWordMap.values()) {
            concatenatedWords.append(word).append(" ");
        }

        // Remove the trailing space
        if (concatenatedWords.length() > 0) {
            concatenatedWords.setLength(concatenatedWords.length() - 1);
        }
            return String.valueOf(concatenatedWords);
    }
}
