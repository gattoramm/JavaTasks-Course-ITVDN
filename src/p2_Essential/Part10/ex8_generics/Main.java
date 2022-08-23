package Part10.ex8_generics;

class Base {
}

class Derived extends Base {
}

class MyClass<T extends Base> {
}

public class Main {
    public static void main(String[] args) {
        MyClass<Base> mc1 = new MyClass<>();

        MyClass<Derived> mc2 = new MyClass<>();

//        MyClass<Integer> mc3 = new MyClass<>();
    }
}
