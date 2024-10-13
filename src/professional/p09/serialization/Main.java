package professional.p09.serialization;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\user\\Documents\\GitHub\\JavaTasks-Course-ITVDN\\src\\professional\\p09\\file2.txt");
        Car c = new Car(5000, "Bmw");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))) {
            oos.writeObject(c);

            Car car = (Car) ois.readObject();
            System.out.println(car);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
