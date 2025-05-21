package behavioral.strategy;

//prevents from writing duplicate codes for each implementation and grow independently
public class SportsDriveStrategy implements DriveStrategy{

    @Override
    public void drive() {
        System.out.println("SportsDrive Strategy");
    }
}
