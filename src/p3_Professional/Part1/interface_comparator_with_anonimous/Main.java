package Part1.interface_comparator_with_anonimous;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal("Oriental", 7, 25, 5000);
        Animal dog = new Animal("Labrador", 30, 20, 4000);
        Animal bird = new Animal("King Pinguin", 15, 8, 50000);

        Animal[] c = {cat, dog, bird};

        Arrays.sort(c, new Comparator<Animal>() {
            public int compare(Animal o1, Animal o2) {
                return o1.price - o2.price; }
        });
        for (Animal animal : c) {
            System.out.println(animal);
        }
        System.out.println();

        Arrays.sort(c, (o1, o2) -> o1.speed - o2.speed);
        for (Animal animal : c) {
            System.out.println(animal);
        }
        System.out.println();

        Arrays.sort(c, new Comparator<Animal>() {
            public int compare(Animal o1, Animal o2) {
                return o1.breed.compareTo(o2.breed); }
        });
        for (Animal animal : c) {
            System.out.println(animal);
        }
        System.out.println();
    }
}
