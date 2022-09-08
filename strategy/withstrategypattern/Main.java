import com.strategypattern.withstrategypattern.SportsVehicle;
import com.strategypattern.withstrategypattern.Vehicle;

public class Main {

    public static void main(String[] args) {
        Vehicle vehicle = new GoodsVehicle();
        vehicle.drive();
    }

}
