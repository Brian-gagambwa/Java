import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Word Counter");
        System.out.println("============");

        System.out.print("Enter a text: ");
        String inputText = scanner.nextLine();

        // Split the input text into words using spaces as delimiters
        String[] words = inputText.split("\\s+");

        // Create a map to store word frequencies
        Map<String, Integer> wordFrequencies = new HashMap<>();

        // Count the occurrences of each word
        for (String word : words) {
            // Remove punctuation and convert to lowercase for better matching
            word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();

            if (!word.isEmpty()) {
                wordFrequencies.put(word, wordFrequencies.getOrDefault(word, 0) + 1);
            }
        }

        // Display word frequencies
        System.out.println("\nWord Frequencies:");
        for (Map.Entry<String, Integer> entry : wordFrequencies.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        scanner.close();
    }
}
