package professional.p03.hashMap;

import java.util.HashMap;

public class SimpleHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put(null, 25);
        hm.put(null, 25);
        hm.put(null, 50);

        System.out.println(hm);
        System.out.println(hm.get(null));
    }
}
