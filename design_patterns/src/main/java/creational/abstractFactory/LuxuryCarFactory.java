package creational.abstractFactory;

public class LuxuryCarFactory implements AbstractCarFactory {

    @Override
    public Car getInstance(int price) {
        if (price >= 100000 && price <= 200000) {
            return new LuxuryCar1();
        } else if (price > 200000) {
            return new LuxuryCar2();
        }
        return null;
    }
}
