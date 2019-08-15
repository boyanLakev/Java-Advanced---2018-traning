import java.util.Arrays;
import java.util.Scanner;

public class GetFirstOddorEvenElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array= Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        String[] command=scanner.nextLine().split("\\s+");
        if ("even".equals(command[2])){
            int count=Integer.parseInt(command[1]);
            Arrays.stream(array)
                    .filter(e-> e%2==0)
                    .limit(count)
                    .forEach(e -> System.out.print(e+" "));
        }else if("odd".equals(command[2])){
            int count=Integer.parseInt(command[1]);
            Arrays.stream(array)
                    .filter(e-> e%2!=0)
                    .limit(count)
                    .forEach(e -> System.out.print(e+" "));
        }


    }
}
