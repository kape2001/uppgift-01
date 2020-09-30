public class Cat extends Animal {
    public Cat (String name, double weight) {
        this.name = name;
    }

    @Override
    public String food() {
        return this.name + " ska ha " + Math.round(weight/150) + "g kattfoder";
    }
}
