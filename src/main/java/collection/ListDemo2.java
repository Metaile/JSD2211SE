package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListDemo2 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        System.out.println(list);
        /*String[] array=list.toArray(new String[list.size()]);
        List<String> list1= Arrays.asList(array);
        List<String> list2=new ArrayList<>(list1);
        list2.get(2);
        System.out.println(list2);
        list2.set(3,"six");
        System.out.println(list2);
        Collections.reverse(list2);
        System.out.println(list2);*/

        /**add(int index,E e)在指定位置增加元素*/
        list.add(5,"six");
        System.out.println(list);
        /**remove(int index)删除指定位置的元素，返回删除的元素*/
        list.remove(3);
        System.out.println(list);
    }
}
