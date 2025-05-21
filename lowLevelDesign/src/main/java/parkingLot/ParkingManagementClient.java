package parkingLot;

public class ParkingManagementClient {

    public static void main(String[] args) {

        ParkingLot parkingLot = new ParkingLot(2,2,2);
        Vehicle car1 = new Vehicle(VehicleType.CAR);
        Vehicle car2 = new Vehicle(VehicleType.CAR);
        Vehicle car3 = new Vehicle(VehicleType.CAR);
        Vehicle car4 = new Vehicle(VehicleType.CAR);


        parkingLot.parkVehicle(car1);
        parkingLot.parkVehicle(car2);
        parkingLot.parkVehicle(car3);
        parkingLot.parkVehicle(car4);

        parkingLot.unparkVehicle(car1);
      //  parkingLot.parkVehicle(truck);
        //parkingLot.unparkVehicle(truck);
    }
}
