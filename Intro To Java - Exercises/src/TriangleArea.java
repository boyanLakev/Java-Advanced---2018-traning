import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double aX=scanner.nextDouble();
        double aY=scanner.nextDouble();
        double bX=scanner.nextDouble();
        double bY=scanner.nextDouble();
        double cX=scanner.nextDouble();
        double cY=scanner.nextDouble();
        double result=aX*(bY-cY)+bX*(cY-aY)+cX*(aY-bY);
        result=Math.abs(result/2);
        System.out.println((int)(result));
    }
}
