import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ArrayList list = new ArrayList<>(Arrays.asList(1, 2, 3, 3, 5, 7, 2, 1));
        System.out.println(antiDuplicates(list));


    }
    public static ArrayList antiDuplicates(ArrayList list){
        ArrayList result = new ArrayList<>();
        for (Object i : list){
            if (!result.contains(i)){
                result.add(i);
            }
        }
        return result;
    }
}
