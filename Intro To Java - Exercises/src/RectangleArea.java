import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double  side=scanner.nextDouble();
        double otderSide=scanner.nextDouble();
        double area=side*otderSide;
        System.out.printf("%.2f",area);
    }
}
