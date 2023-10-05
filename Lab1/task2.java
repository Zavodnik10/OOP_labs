import java.util.Arrays;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // sc = Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(n+" ");

        while(n!=1) {
            if (n%2 == 0){
                n = n/2;
                System.out.print(n+" ");
            } else{
                n = n*3+1;
                System.out.print(n+" ");
            }
        }
    }
}