import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    static List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
    static List<Integer> result = new ArrayList<>();

    public static void main(String[] args) {
        for (Integer item : intList) {
            if (item > 0 && item % 2 == 0) {
                result.add(item);
            }
        }
        Collections.sort(result);
        System.out.println(result);
    }

}