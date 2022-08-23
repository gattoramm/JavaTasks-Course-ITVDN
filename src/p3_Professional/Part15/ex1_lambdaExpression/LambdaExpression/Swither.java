package Part15.ex1_lambdaExpression.LambdaExpression;


import java.util.ArrayList;
import java.util.List;

public class Swither {
    private List<ElectricityConsumer> listeners = new ArrayList<>();

    public void addElectricityListener(ElectricityConsumer listener) {
        listeners.add(listener);

    }

    public void removeElectricityListener(ElectricityConsumer listener) {
        listeners.remove(listener);
    }

    public void switchOn() {
        System.out.println("Выключатель включен");
        for (ElectricityConsumer c : listeners) {
            c.electricityOn(this);
        }
    }
}
