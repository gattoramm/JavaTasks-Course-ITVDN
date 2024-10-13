package professional.p03.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        LinkedHashMap<String, String> lhm = new LinkedHashMap<>();
        lhm.put("Арбуз", "А");
        lhm.put("Дыня", "Д");
        lhm.put("Банан", "Б");

        Set<Map.Entry<String, String>> set = lhm.entrySet();

        for (Map.Entry<String, String> stringStringEntry : set) {
            System.out.println(stringStringEntry.getKey() + " " + stringStringEntry.getValue());
        }
    }
}
