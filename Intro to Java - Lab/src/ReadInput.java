import java.util.Scanner;

public class ReadInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstStr=scanner.next("\\w+");
        String secondStr=scanner.next("\\w+");
        int firstInt=scanner.nextInt();
        int secondInt=scanner.nextInt();
        int thirdInt=scanner.nextInt();
        int sum=firstInt+secondInt+thirdInt;
        String endStr=scanner.next();
        System.out.printf("%s %s %s %d",firstStr,secondStr,endStr,sum);


    }
}
