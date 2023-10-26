import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LexicographicTask {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        List<String> data = new ArrayList<>();
        while (sc.hasNext()) {
            data.add(sc.next());
        }
        print(data);
    }

    public static void print(List<String> data) {
        Collections.sort(data); // Sort the list lexicographically
        for (String s : data) {
            System.out.println(s);
        }
    }
}
