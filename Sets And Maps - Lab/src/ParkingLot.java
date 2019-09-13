import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> set=new HashSet<>();
        while (true){
            String[] line=scanner.nextLine().split(", ");
            if (line[0].equals("END")){
                break;
            }
            if ("IN".equals(line[0])){
                set.add(line[1]);
            }else {
                set.remove(line[1]);
            }

        }
        if (set.isEmpty()){
            System.out.println("Parking Lot is Empty");
        }else {
            for (String s : set) {
                System.out.println(s);
            }
        }
    }
}
