import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        String[] strings=new String[n];
        for (int i = 0; i <n ; i++) {
            strings[i]=scanner.nextLine();
        }
        int[] ints=new int[n];
        for (int i = 0; i <n ; i++) {
            int sum=0;
            int lenght=strings[i].length();
            for (int j = 0; j <lenght; j++) {
                char ch=strings[i].charAt(j);
                if ("aioue".contains((ch+"").toLowerCase())){
                    sum+=(int)ch*lenght;
                }else{
                    sum+=(int)ch/lenght;
                }
            }
            ints[i]=sum;
        }
        int[] sort=Arrays.stream(ints).sorted().toArray();
        for (int i : sort) {
            System.out.println(i);
        }

    }
}
