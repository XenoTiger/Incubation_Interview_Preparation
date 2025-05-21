package structural.bridge;

public abstract class LivingThings {

    private BreathImplementor breathImplementor;

    public LivingThings(BreathImplementor breathImplementor){
        this.breathImplementor = breathImplementor;
    }

    abstract public void breathProcess();
}
