package creational.abstractFactory;

public class AbstractFactoryExample {

    public static void main(String[] args) {

        AbstractFactoryProducer producer = new AbstractFactoryProducer();
        AbstractCarFactory abstractCarFactory = producer.getFactory("Economic");
        Car car = abstractCarFactory.getInstance(20000);
        System.out.println(car.getTopSpeed());
    }
}
