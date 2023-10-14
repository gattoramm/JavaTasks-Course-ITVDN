package professional.p01.iterator.simple.object;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal("Oriental", 5000);
        Animal dog = new Animal("Labrador", 4000);
        Animal bird = new Animal("King Pinguin", 50000);

        Animal[] c = {cat, dog, bird};

        // Возможно изменение полей объекта
        for (Animal animal : c)
            animal.price = animal.price + 1000;

        for (Animal animal : c)
            System.out.println(animal.breed + " " + animal.price);

        // Нельзя поменять объекты в массиве
        for (Animal animal : c)
            animal = new Animal("Lion", 5000);

        for (Animal animal : c)
            System.out.println(animal.breed + " " + animal.price);

    }
}
