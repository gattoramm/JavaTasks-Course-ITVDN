package professional.p03.IdentityHashMap;

import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

public class SimpleIdentityHasMap {
    public static void main(String[] args) {
        IdentityHashMap<Integer, String> identityHashMap = new IdentityHashMap<>();
        identityHashMap.put(1, "one");
        identityHashMap.put(11, "two");
        identityHashMap.put(23, "three");
        identityHashMap.put(1, "one");
        identityHashMap.put(23, "five");

        Set set = identityHashMap.entrySet();

        for (Object o : set) {
            Map.Entry<Integer, String> map = (Map.Entry<Integer,String>)o;
            System.out.println(map.getKey() + " " + map.getValue());
        }
    }
}
