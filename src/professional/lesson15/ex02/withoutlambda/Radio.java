package professional.lesson15.ex02.withoutlambda;

public class Radio implements ElectricityConsumer{
    private void playMusic() {
        System.out.println("Radio plays");
    }

    @Override
    public void electricityOn(Object sender) {
        playMusic();
    }
}
