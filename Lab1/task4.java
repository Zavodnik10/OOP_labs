import java.util.Arrays;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // sc = Scanner(System.in);
        String str = sc.nextLine();
        while(sc.hasNextLine()){
            String check_str = sc.nextLine();
            if (check_str != ""){
                str += check_str;
            }
            else {break;}//if there atr nothing
        }
        char[] charList = str.toCharArray();
        for(char chr: charList){
            System.out.println(chr + "=" + (int)chr);
        }
    }
}