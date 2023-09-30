package professional.p15.ex1_lambdaExpression.LambdaExpression;


public class Lamp implements ElectricityConsumer {
    private void lightOn() {
        System.out.println("����� ��������");
    }

    @Override
    public void electricityOn(Object sender) {
        lightOn();
    }
}
