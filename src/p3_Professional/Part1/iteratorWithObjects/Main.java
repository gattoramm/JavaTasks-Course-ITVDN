package Part1.iteratorWithObjects;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> al = new ArrayList<>();

        al.add(new Animal("Spynx", 5000));
        al.add(new Animal("Malamute", 4000));

        Iterator<Animal> animalIterator = al.iterator();

        while (animalIterator.hasNext()) {
            Animal tmp = animalIterator.next();
            tmp.price += 1000;
        }
        System.out.println(al);
    }
}

class Animal {
    String breed;
    int price;

    public Animal(String breed, int price) {
        this.breed = breed;
        this.price = price;
    }

    @Override
    public String toString() {
        return breed + " = " + price;
    }
}
