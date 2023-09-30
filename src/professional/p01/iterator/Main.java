package professional.p01.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();

        al.add(1);
        al.add(2);
        al.add(3);

//        System.out.println(al);

        Iterator<Integer> iterator = al.iterator();

        while (iterator.hasNext()) {
            Integer tmp = iterator.next();
            System.out.println(tmp);
        }
    }
}
