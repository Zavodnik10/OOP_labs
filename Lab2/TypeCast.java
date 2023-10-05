package tasks;

public class TypeCast {


    static float methodOne(int i) {
        long j = i;     //int is auto widened to long
        return j;       //long is auto widened to float
    }

    public static void main(String[] args) {
        double d = 100.04;
        long l = (long) d;  //explicit type casting required
        int i = (int) l;    //explicit type casting required

        int in = 100;
        double doubl = (double) in;

        System.out.println("Double value " + d);
        System.out.println("Long value " + l);
        System.out.println("Int value " + i);

        System.out.println("Upcasting double value " + doubl);

        byte b = 10;
        short s = b;      //byte is auto widened to short
        double double_output = methodOne(s);    //short is auto widened to int and float to double
        System.out.println("Method casting " + double_output);

    }


}
