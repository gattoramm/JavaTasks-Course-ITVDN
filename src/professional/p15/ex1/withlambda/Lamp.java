package professional.p15.ex1.withlambda;


public class Lamp implements ElectricityConsumer {
    private void lightOn() {
        System.out.println("Лампа зажглась");
    }

    @Override
    public void electricityOn(Object sender) {
        lightOn();
    }
}
