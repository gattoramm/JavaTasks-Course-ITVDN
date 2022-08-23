package Part5;

public class SimpleMethodsOfString {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String str3 = "!!!";

//        long l1 = System.nanoTime();
//        String str = str1.concat(str2).concat(str3);
//        long l2 = System.nanoTime();
//
//        System.out.println(l2 - l1);
//
//        long l3 = System.nanoTime();
//        String str6 = str1 + str2 + str3;
//        long l4 = System.nanoTime();
//        System.out.println(l4 - l3);

//        System.out.println(str1.equals("Hello"));   // ==
//        System.out.println(str1.equalsIgnoreCase("HELLO")); //
//        System.out.println(str1.startsWith("He"));
//        System.out.println(str1.endsWith("lo"));
//        System.out.println(str1.regionMatches());

//        System.out.println(str1.substring(0, 2));
//        System.out.println(str1.substring(2));

        Integer i1 = 55;
//        System.out.println(i1.toString());
//        System.out.println(Integer.toString(i1));

        Integer i2 = null;
        System.out.println(String.valueOf(i1));
    }
}
