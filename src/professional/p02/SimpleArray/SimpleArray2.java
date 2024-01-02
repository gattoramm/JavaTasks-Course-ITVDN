package professional.p02.SimpleArray;

import java.util.ArrayList;

public class SimpleArray2 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(0,30);
        al.add(40);

        for (Integer integer : al) {
            System.out.println(integer);
        }

        ArrayList<Integer> al2 = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            al2.add(i);
            System.out.print(al2.get(i) + " ");
        }
        System.out.println("\n" + al2.size());
        for (int i = 0; i < 50; i++) {
            al2.remove(0);
        }

        for (Integer integer : al2) {
            System.out.print(integer + " ");
        }
        System.out.println("\n" + al2.size());
    }
}
