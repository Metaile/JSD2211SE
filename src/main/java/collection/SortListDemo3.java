package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListDemo3 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("张三");
        list.add("李三四");
        list.add("王五");
        list.add("小老刘六");
        Collections.sort(list, new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        });
        System.out.println(list);
    }
}
