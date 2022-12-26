package collection;

import java.util.*;

/**
 * ArryList:内部使用数组实现，查询性能更好
 * LinkedList:内部使用链表实现，首尾增删性能更好
 */
public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("q");
        list.add("w");
        list.add("e");
        list.add("r");
        System.out.println("list:" + list);
        /*String[] array=list.toArray(new String[list.size()]);
        List<String> list1= Arrays.asList(array);
        List<String> list2=new ArrayList<>(list1);*/
        /**List提供的方法*/
        //E get(int index)根据下标获取指定元素
        String s = list.get(3);
        System.out.println(s);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
        System.out.println();
        for (String str : list) {
            System.out.print(str);
        }
        System.out.println();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next());
        }
        System.out.println();
        System.out.println("-----------");
        //E set(int index,E e) 将指定元素设置到指定位置，返回被替换的元素
        s = list.set(1, "d");
        System.out.println(s);
        System.out.println(list);

        System.out.println("----------");
        /**反转集合*/
        /*List<String> list1 = new ArrayList<>();
        list1.add("one");
        list1.add("two");
        list1.add("three");
        list1.add("four");
        list1.add("five");
        System.out.println(list1);
        for (int i = 0; i < list1.size() / 2; i++) {
            String s1 = list1.set(i, list1.get(list1.size() - 1 - i));
            list1.set(list1.size() - 1 - i, s1);
        }
        System.out.println(list1);
*/
        Collections.reverse(list);
        System.out.println(list);


    }
}
