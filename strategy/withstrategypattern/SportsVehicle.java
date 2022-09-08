import com.strategypattern.withstrategypattern.Vehicle;
import com.strategypattern.withstrategypattern.strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle {

    public SportsVehicle() {
        super(new SportsDriveStrategy());
    }
}
