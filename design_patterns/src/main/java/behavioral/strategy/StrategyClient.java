package behavioral.strategy;

public class StrategyClient {

    public static void main(String[] args) {

        Vehicle vehicle = new SportsVehicle();
        vehicle.drive();
    }
}
