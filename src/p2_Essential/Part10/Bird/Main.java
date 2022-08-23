package Part10.Bird;

public class Main {
    public static void main(String[] args) {
        Strauss[] s = {new Strauss(55), new Strauss(60)};
        Pinguin[] p = {new Pinguin(15), new Pinguin(18), new Pinguin(20)};
        Logic<Strauss> l = new Logic<>(s);
//        l.display();
        Logic<Pinguin> l2 = new Logic<>(p);
//        l2.display();

        Logic.weightCompare(l, l2);
    }
}

class Bird {
    int weight;

    public Bird(int weight) {
        this.weight = weight;
    }

    void move() {}
}

class Strauss extends Bird {
    Strauss(int weight) {
        super(weight);
    }

    @Override
    void move() {
        System.out.println("Run");
    }
}

class Pinguin extends Bird {
    Pinguin(int weight) {
        super(weight);
    }

    @Override
    void move() {
        System.out.println("Swim");
    }
}

class Logic<T extends Bird> {
    T[] array;

    public Logic(T[] array) {
        this.array = array;
    }

    void display() {
        for (T t : array) {
            t.move();
            System.out.println(t.weight);
        }
    }

    int weightController() {
        int sum = 0;
        for (T t : array) {
            sum += t.weight;
        }
        return sum;
    }

    static void weightCompare(Logic<?> c1, Logic<?> c2) {
        System.out.println(c1.weightController() - c2.weightController());
    }
}