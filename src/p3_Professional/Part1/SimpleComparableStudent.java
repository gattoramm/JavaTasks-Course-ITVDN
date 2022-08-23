package Part1;

import java.util.Arrays;
import java.util.Comparator;

public class SimpleComparableStudent {
    private String firstName;
    private int group;

    public SimpleComparableStudent(String firstName, int group) {
        this.firstName = firstName;
        this.group = group;
    }

    @Override
    public String toString() {
        return "SimpleComparableStudent{" +
                "firstName='" + firstName + '\'' +
                ", group=" + group +
                '}';
    }

//    @Override

    public String getFirstName() {
        return firstName;
    }
//    public int compareTo(Object o) {
//        if (this.group > ((SimpleComparableStudent)o).group) {
//            return 1;
//        } else if (this.group < ((SimpleComparableStudent)o).group) {
//            return -1;
//        } else
//            return 0;
//    }
}

class SimpleComparatorStudent implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        String firstName1 = ((SimpleComparableStudent)o1).getFirstName();
        String firstName2 = ((SimpleComparableStudent)o2).getFirstName();
        return firstName1.compareTo(firstName2);
    }
}

class Main {
    public static void main(String[] args) {
        SimpleComparableStudent[] myStudents = {
                new SimpleComparableStudent("Bob", 333),
                new SimpleComparableStudent("Ann", 222),
                new SimpleComparableStudent("Andrew", 111),
                new SimpleComparableStudent("Peter", 300)
        };

        Arrays.sort(myStudents, new SimpleComparatorStudent());

        for (SimpleComparableStudent myStudent : myStudents) {
            System.out.println(myStudent);
        }
    }
}
