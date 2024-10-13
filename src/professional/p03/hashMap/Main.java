package professional.p03.hashMap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String[] people = new String[]{"Евгений", "Александр", "Карина", "Вероника", "Тамара"};

        HashMap<String, Human> map = addsHumansToMap(people);

        for (Map.Entry<String, Human> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }

    private static HashMap<String, Human> addsHumansToMap(String[] people) {
        HashMap<String, Human> allHumans = new HashMap<>();
        for (String s : people) {
            allHumans.put(s, new Human(s));
        }

        return allHumans;
    }

    public static class Human {
        private String name;
        public Human(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name != null ? name.toUpperCase() : null;
        }
    }
}
