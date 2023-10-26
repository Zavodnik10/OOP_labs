import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class GroupWordsTask {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        List<String> data = new ArrayList<>();
        while (sc.hasNext()) {
            data.add(sc.next());
        }
        Map<String, Integer> result = groupIt(data);
        System.out.println(result);
    }

    public static Map<String, Integer> groupIt(List<String> data) {
        Map<String, List<String>> groupedWords = new HashMap<>();
        
        // Group words by their first letter
        for (String word : data) {
            String firstLetter = word.substring(0, 1);
            groupedWords.computeIfAbsent(firstLetter, k -> new ArrayList<>()).add(word);
        }
        
        // Count how many times the group-key letter appears in the grouped words
        Map<String, Integer> counts = new HashMap<>();
        for (Map.Entry<String, List<String>> entry : groupedWords.entrySet()) {
            int totalCount = entry.getValue().stream().mapToInt(word -> (int) word.chars().filter(ch -> ch == entry.getKey().charAt(0)).count()).sum();
            counts.put(entry.getKey(), totalCount);
        }
        
        return counts;
    }
}
