import java.util.Scanner; //66/100 time is slow

public class RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =Integer.parseInt(scanner.nextLine());
         int fibonachi=getFibonachi(n);
        System.out.println(fibonachi);
    }

    private static int getFibonachi(int n) {
        if(n==1)
            return getFibonachi(n-1);
        if (n==0)
            return 1;
        return getFibonachi(n-1)+getFibonachi(n-2);
    }


}
