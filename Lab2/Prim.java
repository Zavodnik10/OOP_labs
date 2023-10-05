package tasks;

public class Prim { // line 1
    public static void main(String[] args) { // line 2
        char a = 'a'; // line 3
        char b = 10; // line 4
        char c = '1'; // line 5
        int d = 1000; // line 6
        System.out.println((int) a);
        System.out.println((int) c);
        System.out.println(++a + b++ * c - d); // line 7
        // 98 + 10 * 49 - 1000
        a = 10;
        b = 20;
        c = 30;
        System.out.println(++a + b++ * c);
        // 11 + 20 * 30 = 611

        int num1 = 12; // line 3
        float num2 = 17.8f; // line 4
        boolean eJavaResult = true; // line 5
        boolean returnVal = num1 >= 12 && num2 < 4.567 // line 6
                || eJavaResult == true;
        boolean simple = true;
        System.out.println(returnVal);
        // true

    } // line 8
}