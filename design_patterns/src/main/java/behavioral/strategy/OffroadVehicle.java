package behavioral.strategy;

public class OffroadVehicle extends Vehicle {

    public OffroadVehicle() {
        super(new OffroadDriveStrategy());
    }
}
