import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class MapTask {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        List<String> inputData = new ArrayList<>();
        while (scanner.hasNext()) {
            inputData.add(scanner.next());
        }
        List<Integer> result = mapping(inputData);
        System.out.println(result);
    }

    public static List<Integer> mapping(List<String> inputData) {
        return inputData.stream().filter(MapTask::isInteger).map(Integer::parseInt).collect(Collectors.toList());
    }

    public static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException ignored) {return false;}
    }
}
