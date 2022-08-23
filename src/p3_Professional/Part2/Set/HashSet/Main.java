package p3_Professional.Part2.Set.HashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("null");
        set.add("null");
//        set.add("Арбуз");
//        set.add("Банан");
//        set.add("Дыня");
//        set.add("Ирис");
//        set.add("Картофель");
//
        for (String s : set) {
            System.out.println(s + " " + s.hashCode());
        }
    }

}