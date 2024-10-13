package professional.p03.hashMap.Animal;

import java.util.Objects;

public class Animal {
    private int  price;
    private String breed;

    public Animal(int price, String breed) {
        this.price = price;
        this.breed = breed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(breed, animal.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(breed);
    }
}
