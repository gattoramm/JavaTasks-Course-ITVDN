package professional.lesson15.ex01.simple.lambda;

public class Main {
    int i = 20;
    static int k = 30;
    public static void main(String[] args) {
        int j = 10;     // effective final

        long l1 = System.nanoTime();
        User user1 = new User() {
            @Override
            public void print() {
                //i = 100;  // error
                k = 300;
                //j = 200;   // error
                int l = 0;

                System.out.println("Hello, user1");
                //System.out.println(i);  // error
                System.out.println(j);
                System.out.println(k);
                System.out.println(l);
                //System.out.println(this.l); // error
            }
        };
        long l2 = System.nanoTime();

        long l3 = System.nanoTime();
        User user2 = () -> System.out.println("Hello, user2");
        long l4 = System.nanoTime();

        //User user3 = () -> System.out.println(i);   // error
        User user4 = () -> System.out.println(j);
        User user5 = () -> System.out.println(k);

        System.out.println(l2 - l1);
        System.out.println(l4 - l3);

        System.out.println(user1);
        System.out.println(user2);

        User user6 = () -> {
            {
                int n = 30;
                System.out.println(n);
            }
        };
    }
}

@FunctionalInterface
interface User {
    void print();
}
