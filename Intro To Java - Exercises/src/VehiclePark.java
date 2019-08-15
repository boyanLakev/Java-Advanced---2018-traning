import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class VehiclePark {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> park = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());
        int sellCount=0;
        while (true) {
            String line = scanner.nextLine();
            if (line.equals("End of customers!")) {
                break;
            }
            String[] command = line.split("\\s+");
            String type = command[0];
            int seat = Integer.parseInt(command[2]);
            char chType = ' ';
            switch (type) {
                case "Car":
                    chType = 'c';
                    break;
                case "Bus":
                    chType = 'b';
                    break;
                case "Van":
                    chType = 'v';
                    break;

            }
            for (int i = 0; i <park.size() ; i++) {
                char ch=park.get(i).charAt(0);
                int vehicleSeat=Integer.parseInt(park.get(i).substring(1));
                if (chType==ch && seat==vehicleSeat){
                    System.out.printf("Yes, sold for %d$%n",(int)chType*vehicleSeat);
                    park.remove(i);
                    sellCount++;
                    break;
                }
                if (i==park.size()-1){
                    System.out.println("No");
                }
            }

        }
        if (!park.isEmpty()){
            System.out.print("Vehicles left: ");
            System.out.println(String.join(", ",park));


        }
        System.out.println("Vehicles sold: "+sellCount);


    }
}
