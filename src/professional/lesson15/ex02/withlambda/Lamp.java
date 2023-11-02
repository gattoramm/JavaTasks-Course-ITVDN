package professional.lesson15.ex02.withlambda;

public class Lamp implements ElectricityConsumer {
    private void lightOn() {
        System.out.println("Лампа зажглась");
    }

    @Override
    public void electricityOn(Object sender) {
        lightOn();
    }
}
