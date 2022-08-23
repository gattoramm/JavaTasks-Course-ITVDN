package Part1.simple;

class A {
    A(int param) {
        System.out.println(param);
    }
}
public class Main {
    public static void main(String[] args) {
        new A(1){};
    }
}
