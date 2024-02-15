package professional.p05;

public class SimpleWrappers {
    public static void main(String[] args) {
        System.out.println("Integer:");
        Integer i1 = 100;
        Integer i2 = 100;
        System.out.println("first = " + i1 + ", second = " + i2);
        System.out.println("Сравение по ссылке \'==\' : " + (i1 == i2));
        Integer i3 = 1000;
        Integer i4 = 1000;
        System.out.println("first = " + i3 + ", second = " + i4);
        System.out.println("Сравение по ссылке \'==\' : " + (i3 == i4));
        System.out.println();

        System.out.println("Character:");
        Character c2 = 100;
        Character c1 = 100;
        System.out.println("first = " + c1 + ", second = " + c2);
        System.out.println("Сравение по ссылке \'==\' : " + (c1 == c2));
        Character c3 = 1000;
        Character c4 = 1000;
        System.out.println("first = " + c3 + ", second = " + c4);
        System.out.println("Сравение по ссылке \'==\' : " + (c3 == c4));
        System.out.println();

        Long l2 = 100L;
        Long l1 = 100L;
        System.out.println(l1 == l2);
    }


}
