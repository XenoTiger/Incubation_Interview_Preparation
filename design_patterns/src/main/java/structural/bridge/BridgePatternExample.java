package structural.bridge;

//can grow independently
public class BridgePatternExample {

    public static void main(String[] args) {

        Dog dog = new Dog(new LandBreatheImplementor());
        dog.breathProcess();

        Fish fish = new Fish(new LandBreatheImplementor());
        fish.breathProcess();
    }
}
