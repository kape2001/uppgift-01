public class Snake extends Animal implements ICanEat{
    public Snake (String name) {
        this.name = name;
    }

    @Override
    public String food() {
        return this.name + " ska ha 20 g ormpellets";
    }
}