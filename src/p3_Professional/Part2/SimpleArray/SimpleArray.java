package Part2.SimpleArray;

import java.util.ArrayList;

public class SimpleArray {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
//        al.add(10);
//        al.add(20);
//        al.add(0,30);
//        al.add(40);
//
//        for (Integer integer : al) {
//            System.out.println(integer);
//        }

        for (int i = 0; i < 100; i++) {
            al.add(i);
            System.out.print(al.get(i) + " ");
        }
        System.out.println("\n" + al.size());
        for (int i = 0; i < 50; i++) {
            al.remove(0);
        }

        for (Integer integer : al) {
            System.out.print(integer + " ");
        }
        System.out.println("\n" + al.size());
    }
}
