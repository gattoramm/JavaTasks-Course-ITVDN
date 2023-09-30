package professional.p02.Dequeue;

import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        ArrayDeque<String> states = new ArrayDeque<>();
        states.add("Russia");
        states.add("China");

        states.push("England");

        String sFirst = states.getFirst();
        String sSecond = states.getLast();

        while (states.peek() != null) {
            System.out.println(states.pop());
        }
        System.out.println(states.size());

        ArrayDeque<Person> people = new ArrayDeque<>();
        people.addFirst(new Person("Tom"));
        people.addLast(new Person("Nick"));

        for (Person p : people) {
            System.out.println(p.getName());
        }
    }
}

class Person{
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
