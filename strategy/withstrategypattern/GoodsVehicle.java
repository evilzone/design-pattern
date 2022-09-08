import com.strategypattern.withstrategypattern.strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle {

    GoodsVehicle() {
        super(new NormalDriveStrategy());
    }
}
