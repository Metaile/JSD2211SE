package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListDemo2 {
    public static void main(String[] args) {
        List<Point> list = new ArrayList<>();
        list.add(new Point(1, 1));
        list.add(new Point(2, 2));
        list.add(new Point(3, 3));
        list.add(new Point(4, 4));
        list.add(new Point(5, 5));
        System.out.println(list);
//        Collections.sort(list);
        Collections.sort(list, new Comparator<Point>() {
            public int compare(Point o1, Point o2) {
                int len1 = o1.getX() * o1.getX() + o1.getY() * o1.getY();
                int len2 = o2.getX() * o2.getX() + o2.getY() * o2.getY();
                return len2 - len1;
            }
        });
        System.out.println(list);

        Collections.sort(list, new Comparator<Point>() {
            public int compare(Point o1, Point o2) {
                return o1.getX()- o2.getX();
            }
        });
        System.out.println(list);
    }
}
