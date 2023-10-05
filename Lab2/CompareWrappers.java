package tasks;

public class CompareWrappers {

    public static void main(String args[]) {
        Integer x = 127;
        Integer y = 127;

        System.out.println(x == y);
        System.out.println(x.compareTo(3));
        System.out.println(x.compareTo(5));
        System.out.println(x.compareTo(8));


        Integer x1 = new Integer(5);
        Integer y1 = new Integer(6);

        System.out.println(x1 == y1);
        String a = "hello";
        System.out.println(a.equals("hello"));
    }

}
