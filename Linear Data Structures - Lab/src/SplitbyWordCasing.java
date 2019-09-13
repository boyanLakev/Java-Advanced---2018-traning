import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SplitbyWordCasing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] word=scanner.nextLine().split("[\\.\\\\:;,\\[\\]!\\(\\) \"'\\/\\s]");
        List<String> lowerCase=new ArrayList<>();
        List<String> upperCase=new ArrayList<>();
        List<String> mixCase=new ArrayList<>();
        for (String s : word) {
            if(s.equals("")){
                continue;

            }
            Pattern pattern=Pattern.compile("^[a-z]+$");
            Matcher matcher=pattern.matcher(s);
            if (matcher.find()){
                lowerCase.add(s);
                continue;
            }
            pattern=Pattern.compile("^[A-Z]+$");
             matcher=pattern.matcher(s);
            if (matcher.find()){
                upperCase.add(s);
                continue;
            }

                mixCase.add(s);

        }
        //
        System.out.print("Lower-case: ");
        System.out.println(String.join(", ",lowerCase));
        System.out.print("Mixed-case: ");
        System.out.println(String.join(", ",mixCase));
        System.out.print("Upper-case: ");
        System.out.println(String.join(", ",upperCase));



    }
}
