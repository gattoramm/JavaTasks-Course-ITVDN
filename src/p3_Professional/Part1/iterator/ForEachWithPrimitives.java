package Part1.iterator;

public class ForEachWithPrimitives {
    public static void main(String[] args) {
        int[] x ={2, 5, 6, 8, 9, 3};

//        for (int i = 0; i < x.length; i++) {
//            System.out.println(x[i] + " ");
//        }
//        System.out.println();

        for (int tmp : x) {
            ++tmp;
            System.out.println(tmp + " ");
        }
    }
}
