import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // sc = Scanner(System.in) in Python
        int n = sc.nextInt(); // syntax to read int value
        for (int i = 0; i < n; i++) { // simple loop with
            String s = "";
            for (int j = 1; j < i + 2; j++) { // nested loop
                s += "*";
            }
            System.out.println(s);
        }
    }
}
