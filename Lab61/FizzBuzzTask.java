import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FizzBuzzTask {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        List<String> result = fizzBuzzIt(n);
        System.out.println(result);
    }

    public static List<String> fizzBuzzIt(int n) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result.add("Fizz Buzz");
            } else if (i % 3 == 0) {
                result.add("Fizz");
            } else if (i % 5 == 0) {
                result.add("Buzz");
            } else {
                result.add(String.valueOf(i));
            }
        }
        return result;
    }
}
