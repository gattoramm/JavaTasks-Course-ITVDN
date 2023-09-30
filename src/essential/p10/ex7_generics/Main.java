package essential.p10.ex7_generics;

class MyClass<T> {
    public T add(T a, T b) {
        if (a.getClass().equals(Integer.class))
            return (T) (Object) ((Integer) a + (Integer) b);

        if (a.getClass().equals(Double.class))
            return (T) (Object) ((Double) a + (Double) b);

        return (T) (Object) 0;
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass<Double> myClass = new MyClass<>();
        double sum = myClass.add(2.0, 3.0);

        System.out.println(sum);
    }
}
