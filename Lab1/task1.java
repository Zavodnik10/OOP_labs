import java.util.Arrays;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // sc = Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n]; // initialize new array (fixed length container)
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max_ell = arr[0];
        int min_ell = arr[0];
        int sum_ell = 0;
        int product_ell = 1;

        for(int el: arr) {
            if(max_ell < el) {
                max_ell = el;
            } else if(min_ell>el){
                min_ell=el;
            }
            sum_ell+=el;
            product_ell*=el;
        }
        float average = (float)sum_ell / arr.length;
        if ((average % 1 == 0) || (arr.length == 1)) {
            int average1 = (int)average;
            System.out.println(max_ell + " " + min_ell + " " + average1 + " " + sum_ell + " " + product_ell);
        } else {
            System.out.println(max_ell + " " + min_ell + " " + average + " " + sum_ell + " " + product_ell);
        }
        // System.out.println(Arrays.toString(arr)); // Arrays.toString(arr) convert array to string
    }
}