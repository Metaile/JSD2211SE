package collection;

import java.util.ArrayList;
import java.util.List;

public class SubListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println(list);

        /**SubList(int start,int end)
         获取指定范围内的子集(含头不含尾)
         */
        List<Integer> sublist = list.subList(2, 5);
        System.out.println(sublist);

        for (int i = 0; i < sublist.size(); i++) {
            sublist.set(i, sublist.get(i) * 10);
        }
        System.out.println("sublist:" + sublist);
        /**对子集的操作就是对原集合对应的操作*/
        System.out.println("list:" + list);
        sublist = list.subList(2, 8);
        sublist.clear();
        System.out.println(list);

    }
}
