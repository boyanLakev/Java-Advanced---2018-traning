import java.util.*;

public class CountSameValuesinArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array= scanner.nextLine().split("\\s+");
        Map<String,Integer> map=new HashMap<>();
        for (String v : array) {
            if(map.containsKey(v)){
                map.put(v,map.get(v)+1);
            }else{
                map.put(v,1);
            }
        }
        map.entrySet().forEach(e-> System.out.println(e.getKey()+" - "+ e.getValue()+" times"));

    }

}
