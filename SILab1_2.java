import java.util.List;

public class SILab1_2 {

    private static String makeBigStringFrom (List<String> list, int minLength) {
        StringBuilder sb = new StringBuilder();
        for (String el : list) {
<<<<<<< HEAD
            if (el.length() < minLength) {
=======
            if (el.length() >= minLength) {
>>>>>>> 2b79542e1ef7a7774ea110d94ca17935770823cb
                sb.append(el);
            }
        }
        return sb.toString();
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> 2b79542e1ef7a7774ea110d94ca17935770823cb
