import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        Map<String,Double> map=new TreeMap<>();
        for (int i = 0; i <n ; i++) {
            String name=scanner.nextLine();
            double[] avrArray= Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToDouble(Double::parseDouble)
                    .toArray();
            double s=0;
            for (double v : avrArray) {
                s+=v;
            }
            double avr=s/avrArray.length;

            map.put(name,avr);
        }
        map.entrySet().forEach(e-> System.out.println(e.getKey()+" is graduated with "+e.getValue()));

    }
}
