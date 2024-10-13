package professional.p03.hashMap.Animal;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal(5000, "Labrador");
        Animal cat = new Animal(7000, "Sphynx");
        Animal bird = new Animal(9000, "Penguin");

        HashMap<Animal, String> hm = new HashMap<>();
        hm.put(dog, "Mike");
        hm.put(cat, "Marsel");
        hm.put(bird, "Riko");

        Animal findName = new Animal(9000, "Penguin2");
        System.out.println(hm.get(findName));
    }
}
