import java.util.Scanner;

public class ExtractBitfromInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num=scanner.nextInt();
        int position=scanner.nextInt();
        num=num>>position;
        int result=1&num;
        System.out.println(result);
    }
}
