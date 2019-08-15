import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumOf2x2Submatrix {
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
        int rowIndex=0;
        int colIndex=0;
        int bestSum=Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length-1; i++) {
            for (int j = 0; j < matrix[i].length-1; j++) {
                int sum= matrix[i][j]
                        +matrix[i][j+1]
                        +matrix[i+1][j]
                        +matrix[i+1][j+1];
                if (sum>bestSum){
                    bestSum=sum;
                    rowIndex=i;
                    colIndex=j;
                }

            }

        }
        System.out.println(matrix[rowIndex][colIndex] +" "+matrix[rowIndex][colIndex+1]);
        System.out.println(matrix[rowIndex+1][colIndex] +" "+matrix[rowIndex+1][colIndex+1]);
        System.out.println(bestSum);
    }
}
