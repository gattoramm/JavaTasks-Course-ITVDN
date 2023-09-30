package essential.p10.ex9_generics;

// Ограничения параметров типа

interface Interface1 {}

interface Interface2<U> {}

class Derived implements Interface1, Interface2<Object> {}

class MyClass1<T extends Interface1> {}

class MyClass2<T extends Interface2<Object>> {}

public class Main {
    public static void main(String[] args) {
        MyClass1<Interface1> my1 = new MyClass1<>();
        MyClass1<Derived> my2 = new MyClass1<>();

        MyClass2<Interface2<Object>> my3 = new MyClass2<>();
        MyClass2<Derived> my4 = new MyClass2<>();

//        MyClass1<Interface2<Object>> my5 = new MyClass1<>();
    }
}
