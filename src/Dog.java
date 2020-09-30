/*import java.util.ArrayList;
import java.util.List;

public class Human extends Animal{
    String eyeColour = "Blue";
    String profession = "Unemployed";
    int savings = 0;
    ArrayList<Animal> ownedAnimals = new ArrayList<>();


    Human (int age) throws Exception {
        if (age < 0){
            throw new Exception("Människor är alltid äldre än minus 1");
        }
        this.age = age;
    }


    @Override
    void makeSound() {
        System.out.println("Hello!");
    }

    @Override
    public String toString() {
        return "Human{" +
                "eyeColour='" + eyeColour + '\'' +
                ", profession='" + profession + '\'' +
                ", savings=" + savings +
                ", ownedAnimals=" + ownedAnimals +
                '}'+ super.toString();

    }
}
*/

import java.util.ArrayList;
import java.util.List;

public class Dog extends Animal implements ICanEat{
    public Dog (String name, double weight) {
        this.name = name;
    }

    @Override
    public String food() {
        return this.name + " ska ha " + Math.round(weight/100) + "g hundfoder";
    }
}

