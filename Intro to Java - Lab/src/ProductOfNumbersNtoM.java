import java.math.BigInteger;
import java.util.Scanner;

public class ProductOfNumbersNtoM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        BigInteger bigInteger = new BigInteger(String.valueOf(n));
        for (int i = n + 1; i <= m; i++) {
            BigInteger temp = bigInteger.multiply(new BigInteger(("" + i)));
            bigInteger = temp;

        }
        System.out.printf("product[%d..%d] = %s", n, m, bigInteger);
    }
}
