import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FlattingTask {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<String> data = new ArrayList<>();
        while (scanner.hasNext()) {
            data.add(scanner.next());
        }
        List<String> flatList = flattingStrings(data);
        System.out.println(flatList);
    }

    public static List<String> flattingStrings(List<String> data) {
        List<String> result = new ArrayList<>();
        for (String word : data) {
            for (char letter : word.toCharArray()) {
                result.add(String.valueOf(letter));
            }
        }
        return result;
    }
}
