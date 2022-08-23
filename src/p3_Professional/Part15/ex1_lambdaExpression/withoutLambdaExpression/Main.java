package p3_Professional.Part15.ex1_lambdaExpression.withoutLambdaExpression;

public class Main {
    public static void fire(Object sender) {
        System.out.println("Fire!");
    }

    public static void main(String[] args) {
        Swither swither = new Swither();
        Lamp lamp = new Lamp();
        Radio radio = new Radio();

        swither.addElectricityListener(lamp);
        swither.addElectricityListener(radio);

        String message = "Пожар";

        // Анонимный класс
        swither.addElectricityListener(
                new ElectricityConsumer() {
                    @Override
                    public void electricityOn(Object sender) {
                        fire(sender);
                    }
                }
        );

        swither.addElectricityListener(
                new ElectricityConsumer() {
                    public void electricityOn(Object sender) {
                        System.out.println(message);
                    }
                }
        );

        swither.switchOn();
    }
}
