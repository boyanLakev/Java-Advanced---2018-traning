import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String string = "";
        ArrayDeque<String> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            String[] command = scanner.nextLine().split(" ");

            switch (command[0]) {
                case "1":
                    stack.push(string);
                    string += command[1];
                    break;
                case "2":
                    int count = Integer.parseInt(command[1]);
                    int start = Math.max(string.length()  - count, 0);
                    stack.push(string);
                    string = string.substring(0, start );

                    break;
                case "3":
                    int index = Integer.parseInt(command[1]) ;

                    if (index >=1 && index <= string.length() ) {
                        index--;
                        char ch = string.charAt(index);
                        System.out.println(ch);
                    }
                    break;
                case "4":
                    string = stack.pop();


                    break;
            }

        }
    }
}
