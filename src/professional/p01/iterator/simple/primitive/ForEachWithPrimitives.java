package professional.p01.iterator.simple.primitive;

public class ForEachWithPrimitives {
    public static void main(String[] args) {
        int[] x = {2, 5, 6, 8, 9, 3};

        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println();

        for (int tmp : x) {
            System.out.print(tmp + " ");
        }
        System.out.println();

        for (int tmp : x) {
            ++tmp;
            System.out.print(tmp + " ");
        }
        System.out.println();

        // Итератор изменил значение tmp внутри цикла, но не за рамками цикла
        for (int tmp : x) {
            System.out.print(tmp + " ");
        }
    }
}
