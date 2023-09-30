package essential.p10;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        // массивы ковариантны (сохранение совместимости)
        Number[] num = new Integer[10];
        num[0] = 10.1d;

        System.out.println(num[0]);

        // Дженерики - инвариантны
//        List<Number> list = new ArrayList<Integer>();
        List<Number> list = new ArrayList<Number>();

    }
}
