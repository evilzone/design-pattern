import com.strategypattern.withstrategypattern.strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveObj;

    // this is known as a constructor injection
    public Vehicle(DriveStrategy driveObj) {
        this.driveObj = driveObj;
    }

    public void drive() {
        driveObj.drive();
    }
}
