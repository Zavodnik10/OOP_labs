import java.util.Arrays;
import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // sc = Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n]; // initialize new array (fixed length container)
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr)); // Arrays.toString(arr) convert array to string
    }
}
