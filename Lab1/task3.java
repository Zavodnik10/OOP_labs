import java.util.Arrays;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        for(char el: arr) {
            int numb = el + 1;
            el = (char)numb;
            System.out.print(el + "|");
        }
    }
}