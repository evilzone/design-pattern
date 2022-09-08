import com.strategypattern.withstrategypattern.strategy.SportsDriveStrategy;

public class OffroadVehicle extends Vehicle {
    public OffroadVehicle() {
        super(new SportsDriveStrategy());
    }
}
