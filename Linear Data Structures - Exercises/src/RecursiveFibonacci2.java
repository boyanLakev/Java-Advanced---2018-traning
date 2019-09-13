import java.util.Scanner;

public class RecursiveFibonacci2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =Integer.parseInt(scanner.nextLine());
        long fibonachi=getFibonachi(n);
        System.out.println(fibonachi);
    }

    private static long getFibonachi(int n) {
        long fibonacci=1;
        if (n==1)return 1;
        if (n==2)return 2;
        long curent=2;
        long before=1;
        for (int i = 3; i <=n; i++) {
            fibonacci=curent+before;
            before=curent;
            curent=fibonacci;

        }
        return fibonacci;

    }

}
