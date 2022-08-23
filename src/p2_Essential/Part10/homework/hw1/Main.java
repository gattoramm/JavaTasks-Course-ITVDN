package Part10.homework.hw1;

/**
 * Создайте класс MyClass<T>, содержащий статический фабричный метод - T factoryMethod(), который
 * будет порождать экземпляры типа, указанного в качестве параметра типа (указателя места заполнения
 * типом – Т).
 */

class MyClass<T> {
    static <T> void factoryMethod(T t) {
        System.out.println(t.toString());;
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass.factoryMethod(45);
    }
}
