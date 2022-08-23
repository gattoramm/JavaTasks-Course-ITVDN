package p2_Essential.Part10.ex1.withoutGen;

public class Main {
    public static void main(String[] args) {
        WithoutGen w1 = new WithoutGen("Test");
        WithoutGen w2 = new WithoutGen(10);
        WithoutGen w3 = new WithoutGen(new Cat("Mur"));

        w1.display();
        w2.display();
        w3.display();

        w1 = w2;

        String s = (String) w1.getObj();
    }
}

class WithoutGen {
    Object obj;

    WithoutGen(Object obj) {
        this.obj = obj;
    }

    void display() {
        System.out.println(obj);
    }

    public Object getObj() {
        return this.obj;
    }
}

class Cat {
    String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
