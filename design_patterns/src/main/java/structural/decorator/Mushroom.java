package structural.decorator;

public class Mushroom extends ToppingDecorator {

    private final BasePizza basePizza;

    public Mushroom(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    int cost() {
        return basePizza.cost() + 15;
    }
}
