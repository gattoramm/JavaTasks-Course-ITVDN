package p3_Professional.Part5;

public class StringPool {
    public static void main(String[] args) {
        // значения заносим в пул
        String s1 = "World";    //pool
        String s2 = "World";    //pool

        // создаем строковое значение через конструктор, в пул не помещаем
        String s3 = new String("World");
        String s4 = new String("World");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s3 == s4);
        System.out.println();

        Integer a = 10;
        Integer b = 10;
        Integer c = 128;
        Integer d = 128;
        Integer aNew = new Integer(10);
        Integer bNew = new Integer(10);
        System.out.println(aNew == bNew);

        System.out.println(a == b);
        System.out.println(c == d);
    }
}
