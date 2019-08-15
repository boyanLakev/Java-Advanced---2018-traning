import java.util.Scanner;

public class XBits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] binArray = new int[8];
        for (int i = 0; i < 8; i++) {
            binArray[i] = Integer.parseInt(scanner.nextLine());

        }
        String[] binStr = new String[8];
        for (int i = 0; i < 8; i++) {
            String temp = String.format("%32s", Integer.toBinaryString(binArray[i]));
            temp = temp.replace(" ", "0");
            binStr[i] = temp;
        }
        int countX = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < binStr[i].length() - 2; j++) {

                boolean check = binStr[i].substring(j, j + 3).equals("101")
                        && binStr[i + 1].substring(j, j + 3).equals("010")
                        && binStr[i + 2].substring(j, j + 3).equals("101");
                if (check) {
                    countX++;
                }
            }
        }
        System.out.println(countX);
    }
}
