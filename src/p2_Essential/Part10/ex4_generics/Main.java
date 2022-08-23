package Part10.ex4_generics;

// Универсальный метод

class MyClass {
    public <T> void method(T argument) {
        T variable = argument;

        System.out.println(variable);
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass instance = new MyClass();

        instance.method("Hello World!");
    }
}
