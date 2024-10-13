package professional.p03.EnumMap;

import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;
import java.util.Set;

public class SimpleEnumMap {
    public static void main(String[] args) {
        Map<Animal, String> enumMap = new EnumMap<>(Animal.class);
        enumMap.put(Animal.CAT, null);
        enumMap.put(Animal.DOG, "D");
        enumMap.put(Animal.BIRD, "B");

//        Collections.synchronizedMap(enumMap);
        Set<Map.Entry<Animal, String>> set = enumMap.entrySet();
        for (Object o : set) {
            Map.Entry m = (Map.Entry)o;
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}

enum Animal {
    CAT, DOG, BIRD
}
