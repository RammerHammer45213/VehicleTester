package vehicletester;

public class VehicleTester 
{
  public static void main(String[] args) 
  {
    Vehicle car1 = new Vehicle(7.5, 60.0, 60.0, 0.0, 4, 25.0, 0.98, 2.0, 12.0);
    Vehicle car2 = new Vehicle(700.0, 700.0, 700.0, 700.0, 700, 700.0, 700.0, 700.0, 700.0);
    
    System.out.println("First Car:\n");
    
    //Show Vehicle Info
    System.out.println(car1);

    //Drive car for 100km
    car1.driveVehicle(100.0);
    System.out.println(car1);

    //Drive car for 450 kms
    car1.driveVehicle(450.0);
    System.out.println(car1);

    //Drive 1000 km - runs out of gas
    car1.driveVehicle(1000.0);
    System.out.println(car1);

    //Add 25L of gas
    car1.addFuel(25.0);
    System.out.println(car1);

    //Add 100 L of gas
    car1.addFuel(100.0);
    System.out.println(car1);
    
    System.out.println("*****************************************************");
    
    System.out.println("Second Car:\n");
    
    //Show vehicle 2 info
    System.out.println(car2);
    
    //Drive car for 100km
    car2.driveVehicle(100.0);
    System.out.println(car2);

    //Drive car for 450 kms
    car2.driveVehicle(450.0);
    System.out.println(car2);

    //Drive 1000 km - runs out of gas
    car2.driveVehicle(1000.0);
    System.out.println(car2);

    //Add 25L of gas
    car2.addFuel(25.0);
    System.out.println(car2);

    //Add 100 L of gas
    car2.addFuel(100.0);
    System.out.println(car2);
    
    
  }
}