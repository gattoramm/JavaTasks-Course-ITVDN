package p3_Professional.Part15.ex1_lambdaExpression.withoutLambdaExpression;

public class Lamp implements ElectricityConsumer{
    private void lightOn() {
        System.out.println("����� ��������");
    }

    @Override
    public void electricityOn(Object sender) {
        lightOn();
    }
}
