import java.util.Arrays;
import java.util.Scanner;

public class OddAndEvenPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] line = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        if (line.length % 2 == 0) {
            for (int i = 0; i < line.length; i += 2) {
                int i1 = line[i];
                int i2 = line[i + 1];
                if (i1 % 2 == 0 && i2 % 2 == 0) {
                    System.out.printf("%d, %d -> both are even%n", i1, i2);

                } else if (i1 % 2 != 0 && i2 % 2 != 0) {
                    System.out.printf("%d, %d -> both are odd%n", i1, i2);
                } else {
                    System.out.printf("%d, %d -> different%n", i1, i2);
                }

            }

        } else {
            System.out.println("invalid length");
        }
    }
}
