package professional.p05;

public class SimpleString {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = new String("Hello");  //new

        char[] arr = {'H', 'e', 'l', 'l', 'o'};

        String str3 = new String(arr, 0, 2);

        System.out.println(str3);
        str1.concat(str2);
    }
}
