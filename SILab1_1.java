import java.util.ArrayList;
import java.util.List;

public class SILab1_1 {
    public static List<String> filterOddLengthStrings(List<String> list) {
        List<String> result = new ArrayList<>();
        for (String el : list) {
<<<<<<< HEAD
            if (el.length() % 2 == 0) {
=======
            if (el.length() % 2 != 0) {
>>>>>>> 2b79542e1ef7a7774ea110d94ca17935770823cb
                result.add(el);
            }
        }
        return result;
    }
<<<<<<< HEAD


}
=======
}
>>>>>>> 2b79542e1ef7a7774ea110d94ca17935770823cb
