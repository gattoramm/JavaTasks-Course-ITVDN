package professional.lesson15.ex02.withoutlambda;

public class Main {
    public static void fire(Object sender) {
        System.out.println("Fire!");
    }

    public static void main(String[] args) {
        Switcher switcher = new Switcher();
        Lamp lamp = new Lamp();
        Radio radio = new Radio();

        // Подписка на событие(Подписываемся 1 раз и не зависимо сколько раз
        // вызовется включение лампы, столько раз и будет вызываться метод лампы)
        switcher.addElectricityListener(lamp);
        switcher.addElectricityListener(radio);

        // Захват переменных, можем передать в анонимный класс, лямбда выражение
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
