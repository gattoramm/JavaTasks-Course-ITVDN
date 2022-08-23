package Part15.ex1_lambdaExpression.LambdaExpression;


public class Radio implements ElectricityConsumer {
    private void playMusic() {
        System.out.println("Radio plays");
    }

    @Override
    public void electricityOn(Object sender) {
        playMusic();
    }
}
