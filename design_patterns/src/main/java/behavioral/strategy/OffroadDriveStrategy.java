package behavioral.strategy;

public class OffroadDriveStrategy implements DriveStrategy{

    @Override
    public void drive() {
        System.out.println("OffroadDrive Strategy");
    }
}
