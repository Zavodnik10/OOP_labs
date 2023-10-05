
import java.until.Arrays;

public class test1 {
    public static void main(){
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++){
            arr[i] = i+1;
        }
        for(int el: arr){
            System.out.println();
        }
    }
}