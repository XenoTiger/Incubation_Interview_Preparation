package creational.abstractFactory;

public class AbstractFactoryExample {

    public static void main(String[] args) {


        AbstractCarFactory abstractCarFactory = AbstractFactoryProducer.getFactory("Economic");
        Car car = abstractCarFactory.getInstance(20000);
        System.out.println(car.getTopSpeed());
    }
}
