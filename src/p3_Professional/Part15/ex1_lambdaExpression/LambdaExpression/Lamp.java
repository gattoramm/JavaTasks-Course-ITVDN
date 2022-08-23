package Part15.ex1_lambdaExpression.LambdaExpression;


public class Lamp implements ElectricityConsumer {
    private void lightOn() {
        System.out.println("Лампа зажглась");
    }

    @Override
    public void electricityOn(Object sender) {
        lightOn();
    }
}
