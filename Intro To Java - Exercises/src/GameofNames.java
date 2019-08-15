import java.util.Scanner;

public class GameofNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] name = new String[n];
        int[] value = new int[n];

        for (int i = 0; i < n; i++) {
            name[i] = scanner.nextLine();
            value[i] = Integer.parseInt(scanner.nextLine());

        }
        int bestValue = Integer.MIN_VALUE;
        int best = 0;
        for (int i = 0; i < n; i++) {
            String currentName = name[i];
            int currentValue = value[i];
            for (char c : currentName.toCharArray()) {
                int ch = c;
                if (ch % 2 == 0) {
                    currentValue += ch;
                } else {
                    currentValue -= ch;
                }
            }
            if (currentValue > bestValue) {
                bestValue = currentValue;
                best = i;
            }

        }
        System.out.printf("The winner is %s - %d points", name[best], bestValue);

    }
}
