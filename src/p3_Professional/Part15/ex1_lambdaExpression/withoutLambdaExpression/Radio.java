package p3_Professional.Part15.ex1_lambdaExpression.withoutLambdaExpression;

public class Radio implements ElectricityConsumer{
    private void playMusic() {
        System.out.println("Radio plays");
    }

    @Override
    public void electricityOn(Object sender) {
        playMusic();
    }
}
