package professional.p15.ex2_stream.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        persons.add(new Person("������", 30));
        persons.add(new Person("������", 14));
        persons.add(new Person("���������", 28));
        persons.add(new Person("����", 8));
        persons.add(new Person("�������", 25));

        persons.stream()
                .filter(p -> p.getAge() >= 18)
//                .sorted((p1, p2) -> p1.getName().compareTo(p2.getName()))
                .sorted(Comparator.comparing(Person::getName))
//                .map(p -> p.getName())
                .map(Person::getName)
                .forEach(
//                        (String name) -> System.out.println(name);
                        System.out::println
                );
    }
}
