package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 数组转换为集合
 * 只能转为List集合,转换来的List集合不能增删元素，会抛出异常
 */
public class ArrayToListDemo {
    public static void main(String[] args) {
        String[] array={"q","w","e","r"};
        System.out.println("array数组:" + Arrays.toString(array));
        List<String> list=Arrays.asList(array);
        System.out.println("list集合:" + list);
//        List<String> list1=Arrays.asList(array);
        List<String> list1=new ArrayList<>(list);
        list1.add("d");
        list1.add("f");
        System.out.println("list1集合:" + list1);
        String[] array1=list1.toArray(new String[list1.size()]);
        System.out.println("array1数组:" + Arrays.toString(array1));

        List<String> list2=new ArrayList<>(list1);
        String[] array2=list2.toArray(new String[list2.size()]);
        List<String> list3=Arrays.asList(array2);
        List<String> list4=new ArrayList<>(list3);
        String[] array3=list4.toArray(new String[list4.size()]);
        List<String> list5=Arrays.asList(array3);
        List<String> list6=new ArrayList<>(list5);


    }
}
