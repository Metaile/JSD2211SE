package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * 排序集合
 *COllections工具类提供 静态方法sort()
 * 对List集合进行自然排序（从小到大）
 */
public class SortListDemo {
    public static void main(String[] args) {
        Random rand =new Random();
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(rand.nextInt(100));
        }
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
