package structural.bridge;

public class Fish extends LivingThings{

    private BreathImplementor breathImplementor;

    public Fish(BreathImplementor breathImplementor){
        super(breathImplementor);
        this.breathImplementor = breathImplementor;
    }

    @Override
    public void breathProcess() {
        breathImplementor.breathe();
    }
}
