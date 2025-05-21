package structural.bridge;

public class LandBreatheImplementor implements BreathImplementor{


    @Override
    public void breathe() {
        System.out.println("Breathe via Nose");
    }
}
