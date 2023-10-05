import java.util.Arrays;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] matrix = createStairMatrix(N);

        // Print the stair matrix
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static int[][] createStairMatrix(int N) {
        int[][] matrix = new int[N][];
        int num = 1;

        for (int i = 0; i < N; i++) {
            matrix[i] = new int[i + 1];
            if (i % 2 == 0) {
                for (int j = 0; j <= i; j++) {
                    matrix[i][j] = num++;
                }
            } else {
                for (int j = i; j >= 0; j--) {
                    matrix[i][j] = num++;
                }
            }
        }

        return matrix;
    }
}
