package professional.lesson15.ex03.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        persons.add(new Person("Sergio", 30));
        persons.add(new Person("Mark", 14));
        persons.add(new Person("Diana", 28));
        persons.add(new Person("Max", 8));
        persons.add(new Person("Ann", 25));

        persons.stream()
                .filter(p -> p.getAge() >= 18)
                .sorted(Comparator.comparing(Person::getName))
                .map(Person::getName)
                .forEach(
                        System.out::println
                );
    }
}
