import java.util.Scanner;

public class task3 {
    public static int countChangedLetters(String signal) {
        int changedCount = 0;

        // Check if the length of the signal is not a multiple of 3
        if (signal.length() % 3 != 0) {
            System.out.println("Invalid input: The length of the signal is not a multiple of 3.");
            return -1; // Return an error code
        }

        // Loop through the signal in groups of 3 characters
        for (int i = 0; i < signal.length(); i += 3) {
            // Check the three characters at the current position
            if (signal.charAt(i) != 'S') {
                changedCount++;
            }
            if (signal.charAt(i + 1) != 'O') {
                changedCount++;
            }
            if (signal.charAt(i + 2) != 'S') {
                changedCount++;
            }
        }

        return changedCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String signal = sc.nextLine();

        int changedLetters = countChangedLetters(signal);
        
        if (changedLetters != -1) {
            System.out.println(changedLetters);
        }
    }
}
