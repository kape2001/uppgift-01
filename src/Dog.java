public class Dog extends Animal implements ICanEat{
    public Dog (String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String food() {
        return this.name + " ska ha " + Math.round(weight/100) + "g hundfoder";
    }
}

