package structural.bridge;

public class Dog extends LivingThings {

    private BreathImplementor breathImplementor;

    public Dog(BreathImplementor breathImplementor) {
        super(breathImplementor);
        this.breathImplementor = breathImplementor;
    }

    @Override
    public void breathProcess() {
        this.breathImplementor.breathe();
    }
}
