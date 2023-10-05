import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        s = compress(s);
        System.out.println(s);
        System.out.println(decompress(s));
    }

    public static String compress(String target) {
        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 0; i < target.length(); i++) {
            char currentChar = target.charAt(i);

            if (i < target.length() - 1 && currentChar == target.charAt(i + 1)) {
                count++;
            } else {
                compressed.append(currentChar);
                if (count > 1) {
                    compressed.append(count);
                }
                count = 1;
            }
        }

        return compressed.toString();
    }

    public static String decompress(String target) {
        StringBuilder decompressed = new StringBuilder();
        int i = 0;

        while (i < target.length()) {
            char currentChar = target.charAt(i);
            decompressed.append(currentChar);
            i++;

            if (i < target.length() && Character.isDigit(target.charAt(i))) {
                int count = Character.getNumericValue(target.charAt(i));
                for (int j = 1; j < count; j++) {
                    decompressed.append(currentChar);
                }
                i++;
            }
        }

        return decompressed.toString();
    }
}
