package Part1.comparable;

public class Animal implements Comparable<Animal>{
    String breed;
    int weight;
    int speed;
    int price;

    public Animal(String breed, int weight, int speed, int price) {
        this.breed = breed;
        this.weight = weight;
        this.speed = speed;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "breed='" + breed + '\'' +
                ", weight=" + weight +
                ", speed=" + speed +
                ", price=" + price +
                '}';
    }

    public int compareTo(Animal o) {
        int tmp = this.speed - o.speed;
//        return tmp == 0 ? this.price - ((Animal)o).price : tmp;

        return this.breed.compareTo(o.breed);
    }
}
