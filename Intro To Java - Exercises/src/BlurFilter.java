import java.util.Arrays;
import java.util.Scanner;

public class BlurFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bluer = Integer.parseInt(scanner.nextLine());
        int[] side = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        String[] rows = new String[side[0]];
        for (int i = 0; i < rows.length; i++) {
            rows[i] = scanner.nextLine();

        }
        int[] pixel = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        int down = Math.min(pixel[0] + 1, side[0] - 1);
        int up = Math.max(pixel[0] - 1, 0);
        int left = Math.max(pixel[1] - 1, 0);
        int right = Math.min(pixel[1] + 1, side[1] - 1);
        for (int i = up; i <= down; i++) {
            long[] arrays = Arrays.stream(rows[i].split("\\s+")).mapToLong(Long::parseLong).toArray();


            for (int j = left; j <= right; j++) {
                arrays[j] += bluer;
            }
            String string = "";
            for (int j = 0; j < arrays.length; j++) {
                string = (arrays.length - 1 != j) ? string + arrays[j] + " " : string + arrays[j];
            }
            rows[i] = string;

        }
        //output
        for (String row : rows) {
            System.out.println(row);
        }


    }
}
