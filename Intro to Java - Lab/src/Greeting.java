import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        String pattern = "*****";
        if (firstName.isEmpty()) {
            firstName = pattern;
        }
        if (lastName.isEmpty()) {
            lastName = pattern;

        }
        System.out.printf("Hello, %s %s!%n", firstName, lastName);
    }
}
