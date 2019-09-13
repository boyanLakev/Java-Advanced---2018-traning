import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringMatrixRotation2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        String rotate = scanner.nextLine();
        rotate = rotate.substring(rotate.indexOf('(') + 1, rotate.lastIndexOf(')'));
        int graduse = Integer.parseInt(rotate) % 360;
        int cols = 0;
        //get string data in list
        while (true) {
            String line = scanner.nextLine();
            if ("END".equals(line)) {
                break;
            }
            if (cols < line.length()) {
                cols = line.length();
            }
            list.add(line);

        }
        int part = graduse / 90;

        int rows = list.size();
        //fill mat pattern 0 degree
        char[][] mat = new char[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (j < list.get(i).length()) {
                    char ch = list.get(i).charAt(j);
                    mat[i][j] = ch;
                } else {
                    mat[i][j] = ' ';
                }
            }
        }

        //create matrix and fill ,case part
        char[][] matrix = (part == 1 || part == 3) ? new char[cols][rows] : new char[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                switch (part) {
                    case 0:
                        matrix[i][j] = mat[i][j];
                        break;
                    case 1:
                        matrix[j][rows - i - 1] = mat[i][j];
                        break;
                    case 2:
                        matrix[rows - i - 1][cols - j - 1] = mat[i][j];
                        break;
                    case 3:
                        matrix[cols - j - 1][i] = mat[i][j];
                        break;
                }


            }
        }


        // print
        for (char[] row : matrix) {
            for (char element : row) {
                System.out.print(element);
            }
            System.out.println();


        }

    }
}
