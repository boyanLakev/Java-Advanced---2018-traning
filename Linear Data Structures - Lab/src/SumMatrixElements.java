import java.util.Arrays;
import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dimention = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int rows = dimention[0];
        int cols = dimention[1];
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            String[] string = scanner.nextLine().split(", ");
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = Integer.parseInt(string[j]);

            }

        }
        int sum = 0;
        for (int[] row : matrix) {
            for (int value : row) {
                sum += value;
            }

        }
        System.out.println(matrix.length);
        System.out.println(matrix[0].length);
        System.out.println(sum);

    }
}
