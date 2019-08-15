import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int distance = Integer.parseInt(scanner.nextLine());
        String partOfday = scanner.nextLine();
        double price;
        if (distance < 20) {
            if (partOfday.equals("day")) {
                price = 0.79;
            } else {
                price = 0.9;
            }
            price *= distance;
            price += 0.7;
        } else if (distance < 100) {
            price = 0.09 * distance;
        } else {
            price = 0.06 * distance;
        }
        System.out.printf("%.2f", price);

    }
}
