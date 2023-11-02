package professional.lesson15.ex04.streamAverage;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        persons.add(new Person("Sergio", 30));
        persons.add(new Person("Mark", 14));
        persons.add(new Person("Diana", 28));
        persons.add(new Person("Max", 8));
        persons.add(new Person("Ann", 25));

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
