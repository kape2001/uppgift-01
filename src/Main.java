import javax.swing.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {
        Dog sixten = new Dog("Sixten", 5000);
        Dog dogge = new Dog("Dogge", 10000);
        Cat venus = new Cat("Venus", 5000);
        Cat ove = new Cat("Ove", 3000);
        Snake hypno = new Snake("Hypno");

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(sixten);
        animals.add(dogge);
        animals.add(venus);
        animals.add(ove);
        animals.add(hypno);

        String animalName = JOptionPane.showInputDialog(null, "Vem ska ha mat?");
        for (int i = 0; i < animals.size(); i++) {
            Animal animal = animals.get(i);
            if (animal.name.equalsIgnoreCase(animalName)) {
                JOptionPane.showMessageDialog(null, animal.food());
                System.exit(0);
            }
        }
        JOptionPane.showMessageDialog(null, "Finns inget djur med detta namn!");
    }
}
