public class Cat extends Animal implements ICanEat{
    public Cat (String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String food() {
        return this.name + " ska ha " + Math.round(weight/150) + "g kattfoder";
    }
}
