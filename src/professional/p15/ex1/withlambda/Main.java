package professional.p15.ex1.withlambda;

public class Main {
    public static void fire(Object sender) {
        System.out.println("Fire!");
    }

    public static void fire2(Object sender) {
        System.out.println("Fire2!");
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
                sender -> System.out.println(message)
        );

        switcher.addElectricityListener(Main::fire);

        switcher.addElectricityListener(
                sender -> fire2(sender)
        );

        switcher.switchOn();
    }
}
