import java.math.BigDecimal;
import java.util.Scanner;

public class EuroTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigDecimal input = new BigDecimal(scanner.nextDouble() * 1.2);
        //BigDecimal k=new BigDecimal("1.2");
        //BigDecimal price=input.multiply(k);
        BigDecimal rate = new BigDecimal("4210500000000");
        BigDecimal result = input.multiply(rate);
        System.out.printf("%.2f marks", result);


    }
}
