package professional.p15.ex1.withoutlambda;

public class Main {
    public static void fire(Object sender) {
        System.out.println("Fire!");
    }

    public static void main(String[] args) {
        Switcher switcher = new Switcher();
        Lamp lamp = new Lamp();
        Radio radio = new Radio();

        switcher.addElectricityListener(lamp);
        switcher.addElectricityListener(radio);

        String message = "Пожар";

        // Анонимный класс
        switcher.addElectricityListener(
                new ElectricityConsumer() {
                    @Override
                    public void electricityOn(Object sender) {
                        fire(sender);
                    }
                }
        );

        switcher.addElectricityListener(
                new ElectricityConsumer() {
                    public void electricityOn(Object sender) {
                        System.out.println(message);
                    }
                }
        );

        switcher.switchOn();
    }
}
