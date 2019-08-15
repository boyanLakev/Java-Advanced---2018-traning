import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.next("\\w+");
        String second = scanner.next("\\w+");
        scanner.nextLine();
        int sum = 0;
        for (int i = 0; i < Math.min(first.length(), second.length()); i++) {
            sum += first.charAt(i) * second.charAt(i);

        }
        for (int i = first.length(); i < second.length(); i++) {
            sum += second.charAt(i);
        }
        for (int i = second.length(); i < first.length(); i++) {
            sum += first.charAt(i);
        }
        System.out.println(sum);
    }
}
