import java.math.BigInteger;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigInteger[] fibon_numbs = new BigInteger[n + 1];
        fibon_numbs[0] = BigInteger.ONE;

        for (int i = 1; i <= n; i++) {
            if(i==1){fibon_numbs[i] = BigInteger.ONE;}
            else{fibon_numbs[i] = fibon_numbs[i-2].add(fibon_numbs[i-1]);}
        }
        System.out.println(fibon_numbs[n-1]);
    }
}