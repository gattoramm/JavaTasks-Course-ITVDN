package professional.p01.comparable;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal("Oriental", 7, 25, 5000);
        Animal dog = new Animal("Labrador", 30, 25, 5000);
        Animal bird = new Animal("King Pinguin", 15, 8, 50000);

        Animal[] c = {cat, dog, bird};

        Arrays.sort(c);

        for (Animal animal : c) {
            System.out.println(animal);
        }
    }
}
