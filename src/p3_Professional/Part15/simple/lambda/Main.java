package Part15.simple.lambda;

public class Main {
//    static int i = 20;
    public static void main(String[] args) {
        int i = 10;
//        long l1 = System.nanoTime();
        User user1 = new User() {
            @Override
            public void print() {
//                int i = 20;
                System.out.println("Hello1");
//                System.out.println(this.i);
            }
        };
//        long l2 = System.nanoTime();

//        long l3 = System.nanoTime();
//        User user2 = () -> System.out.println("Hello2");
        User user2 = () -> {
            {
//                int i = 30;
                System.out.println(i);
            }
        };
//        long l4 = System.nanoTime();
//
//        System.out.println(l2 - l1);
//        System.out.println(l4 - l3);
//
//        System.out.println(user1);
//        System.out.println(user2);
    }
}

@FunctionalInterface
interface User {
    void print();
}
