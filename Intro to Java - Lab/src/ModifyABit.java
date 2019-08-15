import java.util.Scanner;

public class ModifyABit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num=scanner.nextInt();
        int register=scanner.nextInt();
        int value=scanner.nextInt();
        int result=num;
        if(value==0){
        int pattern= 1<<register;
        pattern=~pattern;
         result=num&pattern;}
        else if(value==1){
            int pattern=1<<register;
            result =num|pattern;
        }
        System.out.println(result);
    }
}
