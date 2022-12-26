package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * 集合转换为数组
 */
public class CollectionToArrayDemo {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("q");
        c.add("w");
        c.add("e");
        c.add("r");
        System.out.println("c集合:"+c);
        /*
        集合toArray()方法要求传入一个数组，
        如果该数组可用(长度>=集合.size())
        则将集合元素全部存入该数组后再将该数组返回，
        如果该数组不可用(长度<集合.size())
        则自动创建一个与集合等长的数组并将元素存入该数组后返回
         */
        String[] arr=c.toArray(new String[c.size()]);
        System.out.println("arr数组:"+Arrays.toString(arr));
        String[] arr1=c.toArray(new String[10]);
        System.out.println("arr1数组:"+Arrays.toString(arr1));
        String[] arr2=c.toArray(new String[1]);
        System.out.println("arr2数组:"+Arrays.toString(arr2));
    }
}
