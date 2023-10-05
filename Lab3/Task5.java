import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        String inputSentence = scanner.nextLine();
        String reversedSentence = reverseWordsInSentence(inputSentence);
        System.out.println();
        System.out.println(reversedSentence);
        scanner.close();
    }

    public static String reverseWordsInSentence(String sentence) {
        String[] words = sentence.split(" "); // Split the sentence into words
        StringBuilder reversedSentence = new StringBuilder();

        for (String word : words) {
            String reversedWord = reverseWord(word);
            reversedSentence.append(reversedWord).append(" ");
        }

        return reversedSentence.toString().trim(); // Remove trailing space and return
    }

    public static String reverseWord(String word) {
        StringBuilder reversedWord = new StringBuilder(word);
        return reversedWord.reverse().toString();
    }
}
