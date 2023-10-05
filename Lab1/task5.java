import java.util.Arrays;
import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str2 = sc.nextLine();
        char[] arr = str.toCharArray();
        char[] arr2 = str2.toCharArray();
        if (arr.length != arr2.length){
            System.out.println(false);
        } else {
            for(int i = 0; i < arr.length; i++) {
                if (arr[i] != arr2[i]){
                    System.out.println(false);
                    break;
                } else if (i == arr.length-1){
                    System.out.println(true);
                }
            }
        }
        
    }
}