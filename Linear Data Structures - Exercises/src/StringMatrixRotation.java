import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list=new ArrayList<>();
        String rotate=scanner.nextLine();
        rotate=rotate.substring(rotate.indexOf('('),rotate.lastIndexOf(')');
        int graduse=Integer.parseInt(rotate);
        int cols=0;
        while(true){
            String line=scanner.nextLine();
            if("END".equals(line)){
                break;
            }
            if(cols<line.length()){
                cols=line.length();
            }
            list.add(line);

        }
        int rows=list.size()-1;
        char[][] matrix=new char[rows][cols];
        for (int i = 0; i <rows; i++) {
            for (int j = 0; j <list.get(i).length() ; j++) {
                char ch= list.get(i).charAt(j);
                matrix[i][j]=ch;
            }
        }

    }
}
