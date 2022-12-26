package lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 */
public class LamdaDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Comparator<String> c = (o1, o2) -> o1.length() - o2.length();

    }
    /*Comparator<String> cc=new Comparator<String>() {
        public int compare(String o1, String o2) {
            return o1.length()-o2.length();
        }
    };*/
}
