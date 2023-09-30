package professional.p02.ArrayList;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception{
        ArrayList<String> arrayList = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 3; i++) {
            System.out.println("Введите значение [" + i + "]");
            String s = reader.readLine();
            arrayList.add(s);
        }

        for (int i = 0; i < 5; i++) {
            String s1 = arrayList.remove(arrayList.size() - 1);
            arrayList.add(0, s1);
        }

        for (String s : arrayList) {
            System.out.println(s);
        }
    }
}
