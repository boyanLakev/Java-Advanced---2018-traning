import java.util.Scanner;

public class FormattingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        double b=scanner.nextDouble();
        double c=scanner.nextDouble();
        String nex=String.format("%-10s",Integer.toHexString(a));
        String bin=String.format("%10s",Integer.toBinaryString(a));
        bin=bin.replace(' ','0');
        String left=String.format("%10.2f",b);
        String rigth=String.format("%-10.3f",c);
        System.out.printf("|%S|%S|%S|%S|",nex,bin,left,rigth);

    }
}
