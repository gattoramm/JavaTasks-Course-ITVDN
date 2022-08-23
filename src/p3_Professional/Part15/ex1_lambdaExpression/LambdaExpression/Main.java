package Part15.ex1_lambdaExpression.LambdaExpression;


public class Main {
    public static void fire(Object sender) {
        System.out.println("Fire!");
    }

    public static void fire2(Object sender) {
        System.out.println("Fire2!");
    }

    public static void main(String[] args) {
        Swither swither = new Swither();
        Lamp lamp = new Lamp();
        Radio radio = new Radio();

        swither.addElectricityListener(lamp);
        swither.addElectricityListener(radio);

        String message = "ֿמזאנ";

        // ֻÿלבהא גûנאזוםטו
        swither.addElectricityListener(sender -> System.out.println(message));

        swither.addElectricityListener(Main::fire);

        swither.addElectricityListener(
                sender -> fire2(sender)
        );

        swither.switchOn();
    }
}
