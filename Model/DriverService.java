import java.util.List;
import java.util.ArrayList;

public class DriverService {
  public static List<Driver> findAllAvailableDriver(List<Driver> allDrivers) {
    List<Driver> availableDrivers = new ArrayList<>();
    for (Driver d : allDrivers) {
      if (d.getAvailiabilityStatus() == DriverStatus.AVAILABLE) {
        availableDrivers.add(d);
      }

    }
    return availableDrivers;
  }

  public static Driver findFirstAvailableDriver(List<Driver> allDrivers) throws NoDriverAvailableException {
    List<Driver> available = findAllAvailableDriver(allDrivers);

    if (available.isEmpty()) {
      throw new NoDriverAvailableException("Drivers not Available");
    } else {
      return available.get(0);
    }
  }

  public static void assignDriverToRide(Ride ride, List<Driver> allDrivers) {
    try {
      Driver firstAvailableDriver = findFirstAvailableDriver(allDrivers);
      ride.setDriver(firstAvailableDriver);
      firstAvailableDriver.setAvailiabilityStatus(DriverStatus.BUSY);
    } catch (NoDriverAvailableException e) {
      System.out.println("Failed :" + e);
      ride.setRideStatus(RideStatus.CANCELLED);
    }
  }
}