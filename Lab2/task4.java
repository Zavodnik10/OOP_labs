import java.util.Scanner;

public class task4 {
    public static int[][] generateSpiralMatrix(int N) {
        int[][] matrix = new int[N][N];
        int num = 1;

        int top = 0;
        int bottom = N - 1;
        int left = 0;
        int right = N - 1;

        while (num <= N * N) {
            // Traverse top row
            for (int i = left; i <= right; i++) {
                matrix[top][i] = num++;
            }
            top++;

            // Traverse right column
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = num++;
            }
            right--;

            // Traverse bottom row
            for (int i = right; i >= left; i--) {
                matrix[bottom][i] = num++;
            }
            bottom--;

            // Traverse left column
            for (int i = bottom; i >= top; i--) {
                matrix[i][left] = num++;
            }
            left++;
        }

        return matrix;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] spiralMatrix = generateSpiralMatrix(N);

        // Print the matrix
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(spiralMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
