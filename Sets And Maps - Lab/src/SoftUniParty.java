import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> set=new TreeSet<>();
        while (true){
            String line =scanner.nextLine();
            if ("PARTY".equals(line)){
                break;
            }
            set.add(line);
        }
        while (true){
            String line=scanner.nextLine();
            if("END".equals(line)){
                break;
            }
            set.remove(line);
        }
        System.out.println(set.size());
        for (String s : set) {
            System.out.println(s);
        }

    }
}
