package professional.p01.simple;

import java.util.ArrayList;
import java.util.Collection;

public class SimpleCollection {
    public static void main(String[] args) {
        Collection<Integer> list1 = new ArrayList<>();
        Collection<Integer> list2 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        System.out.println(list1.add(4));
        System.out.println(list1.size());

        list2.addAll(list1);
        System.out.println(list2 + " " + list2.size());
        list2.clear();
        System.out.println(list2 + " " + list2.size());
        System.out.println(list2.isEmpty());
        Object[] arr = list1.toArray();

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println(arr.length);
    }
}
