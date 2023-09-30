package professional.p02.Set.HashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("null");
        set.add("null");
//        set.add("�����");
//        set.add("�����");
//        set.add("����");
//        set.add("����");
//        set.add("���������");
//
        for (String s : set) {
            System.out.println(s + " " + s.hashCode());
        }
    }

}