package professional.p02.LinkedList;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Main {
    private static final int VAL = 100000;
    public static void main(String[] args) {
        System.out.println("Вставка в начало " + VAL + " элементов");
        System.out.println("ArrayList - " + getTimeMsOfInsert(new ArrayList()) + " ms");
        System.out.println("LinkedList - " + getTimeMsOfInsert(new LinkedList()) + " ms");
    }

    public static long getTimeMsOfInsert(List list) {
        Date currentTime = new Date();
        insertInEnd(list);
        Date newTime = new Date();

        long msDelay = newTime.getTime() - currentTime.getTime();
        return msDelay;
    }

    public static void insertInEnd(List list) {
        for (int i = 0; i < VAL; i++) {
            list.add(0, new Object());
        }
    }
}