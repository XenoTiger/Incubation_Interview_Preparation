package creational.abstractFactory;

public class AbstractFactoryProducer {

    public static AbstractCarFactory getFactory(String value) {
        if (value.equals("Economic")) {
            return new EconomicCarFactory();
        } else if (value.equals("Luxury")) {
            return new LuxuryCarFactory();
        }
        return null;
    }
}
