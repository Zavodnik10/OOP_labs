import java.util.Scanner;

public class task5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numRows = scanner.nextInt();
        int numCols = scanner.nextInt();

        int[][] image = new int[numRows][numCols];

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                image[i][j] = scanner.nextInt();
            }
        }

        int[][] rotatedImage = rotate90Degrees(image);

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.print(rotatedImage[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }

    public static int[][] rotate90Degrees(int[][] matrix) {
        int numRows = matrix.length;
        int numCols = matrix[0].length;

        int[][] rotatedMatrix = new int[numCols][numRows];

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                rotatedMatrix[j][numRows - 1 - i] = matrix[i][j];
            }
        }

        return rotatedMatrix;
    }
}
