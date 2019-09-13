
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PoisonousPlants2 {//77/100 time
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        List<Long> plant= Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Long::parseLong).collect(Collectors.toList());

        int day=0;
        while(true){
            int count=0;

            for (int i = plant.size()-1; i >0 ; i--) {
                if (plant.get(i)>plant.get(i-1)){
                plant.remove(i);
                count++;
                }
            }

            if (count==0){
                break;
            }
            day++;
        }
        System.out.println(day);

    }
}
