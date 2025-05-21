package structural.bridge;

public class WaterBreatheImplementor implements BreathImplementor{

    @Override
    public void breathe() {
        System.out.println("Breathe via Gills");
    }
}
