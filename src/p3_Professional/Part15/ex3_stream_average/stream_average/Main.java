package p3_Professional.Part15.ex3_stream_average.stream_average;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        persons.add(new Person("Сергей", 30));
        persons.add(new Person("Андрей", 14));
        persons.add(new Person("Александр", 28));
        persons.add(new Person("Анна", 8));
        persons.add(new Person("Евгений", 25));

        int sum = 0;
        int adultPerson = 0;

        for (Person person : persons) {
            if (person.getAge() >= 18) {
                sum += person.getAge();
                adultPerson++;
            }
        }

        double averageAge = (double)sum / adultPerson;

        System.out.println(averageAge);

        double average2 = persons
                .stream()
                .filter(p -> p.getAge() >= 18)
                .mapToInt(p -> p.getAge())
                .average().getAsDouble();

        System.out.println(average2);
    }
}
