import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class PoisonousPlants {//88/100
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] plant = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        int[] min = new int[n];
        int[] day = new int[n];
        int currentMin = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (plant[i] < currentMin) {
                currentMin = plant[i];
            }
            min[i] = currentMin;
        }
        int max = 0;
        int maxIndex = 0;

        for (int i = 1; i < n; i++) {
            if (plant[i] > plant[i - 1]) {
                day[i] = 1;
                if (day[i] >= max) {
                    maxIndex = i;
                    max = day[i];
                }
                continue;
            }

            if (plant[i] > min[i]) {
                if (plant[i] > plant[maxIndex]) {
                    day[i] = day[i - 1] + 1;
                } else {
                    day[i] = day[maxIndex] + 1;
                }
            }
            if (plant[i] == min[i]) {
                max = 0;
            }

            if (day[i] >= max) {
                maxIndex = i;
                max = day[i];
            }
        }
        int dayDie = Arrays.stream(day).max().getAsInt();
        System.out.println(dayDie);

    }
}
