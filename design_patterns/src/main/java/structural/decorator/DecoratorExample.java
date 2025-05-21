package structural.decorator;

public class DecoratorExample {

    public static void main(String[] args) {

        BasePizza basePizza = new ExtraCheese(new Mushroom(new FarmhousePizza()));
        System.out.println(basePizza.cost());
    }
}
