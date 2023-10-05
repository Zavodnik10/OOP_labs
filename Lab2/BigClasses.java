package tasks; /**
 * Created by вова on 18.09.2016.
 */
import java.math.BigDecimal;

public class BigClasses {

    public static void main(String[]args){
        double pi = 3.14159265358979323846;
        System.out.println(pi);

        BigDecimal pi1 = new BigDecimal("3.14159265358979323846");
        System.out.println(pi1);


        // самостійно
        BigDecimal pi2 = new BigDecimal("3.14159265358979323846"); //pi
        BigDecimal radius = new BigDecimal(123212); // r
        radius = radius.multiply(radius);   // r = r*r = r^2
        radius = radius.multiply(new BigDecimal(4)); // 4*r^2
        BigDecimal surfaceArea = radius.multiply(pi2);// 4*pi*r^2;

        System.out.println("surface area = "+surfaceArea);

    }
}
