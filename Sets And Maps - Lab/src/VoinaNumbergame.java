import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class VoinaNumbergame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> set1=new LinkedHashSet<>();
        Set<Integer> set2=new LinkedHashSet<>();
        int[] playerone= Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        for (int i : playerone) {
            set1.add(i);
        }

        int[] playertwo= Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        for (int i : playertwo) {
            set2.add(i);
        }

        for (int i = 0; i <50; i++) {
            if(set1.isEmpty()||set2.isEmpty()){
                //System.out.println((set1.isEmpty())?"Second player win!":"First player win!");
                break;
            }
            int num1=set1.iterator().next();
                set1.remove(num1);
            int num2=set2.iterator().next();
            set2.remove(num2);
            if (num1>num2){
                set1.add(num1);
                set1.add(num2);
            }else if(num1<num2){
                set2.add(num1);
                set2.add(num2);
            }
        }
        if(set1.size()<set2.size()){
            System.out.println("Second player win!");
        }else if(set1.size()>set2.size()){
            System.out.println("First player win!");
        }else{
            System.out.println("Draw");
        }
    }
}
