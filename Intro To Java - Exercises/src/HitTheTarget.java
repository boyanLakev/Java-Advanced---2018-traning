import java.util.Scanner;

public class HitTheTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int targer=Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= 20; i++) {
            for (int j = 1; j <= 20; j++) {
                if (i+j==targer){
                    System.out.printf("%d + %d = %d%n",i,j,targer);
                }
                if (i-j==targer){
                    System.out.printf("%d - %d = %d%n",i,j,targer);
                }

            }


        }
    }
}
