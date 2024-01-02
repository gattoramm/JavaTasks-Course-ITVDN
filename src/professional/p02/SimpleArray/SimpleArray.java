package professional.p02.SimpleArray;

import java.util.ArrayList;

public class SimpleArray {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Simple");
        list.add(20);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add((Integer) list.get(0));

        System.out.println(list2.get(0));
    }
}
