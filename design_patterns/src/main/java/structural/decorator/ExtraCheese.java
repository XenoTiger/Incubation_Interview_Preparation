package structural.decorator;

public class ExtraCheese extends ToppingDecorator {

    private final BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    int cost() {
        return basePizza.cost() + 10;
    }
}
