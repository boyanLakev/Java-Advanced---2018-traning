import java.util.Scanner;

public class ByteParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int  n=Integer.parseInt(scanner.nextLine());
        int[] array=new int[n];
        for (int i = 0; i <n; i++) {
            array[i]=Integer.parseInt(scanner.nextLine());
        }
        while(true){
            String line=scanner.nextLine();
            if("party over".equals(line)){
                break;
            }
            int command=Integer.parseInt(line.split("\\s+")[0]);
            int position=Integer.parseInt(line.split("\\s+")[1]);
            switch (command){
                case -1:
                    int mask=(1<<position);
                    for (int i = 0; i < array.length; i++) {
                         array[i]=array[i]^mask;

                    }
                    break;

                case 0:
                    mask=~(1<<position);
                    for (int i = 0; i < array.length; i++) {
                        array[i]=array[i]&mask;

                    }
                    break;

                case 1:
                    mask=1<<position;
                    for (int i = 0; i < array.length; i++) {
                        array[i]=array[i]|mask;

                    }
                    break;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println( array[i]);

        }

    }
}
