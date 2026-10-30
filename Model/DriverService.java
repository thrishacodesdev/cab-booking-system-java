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
      throw new NoDriverAvailableException();
    } else {
      return available.get(0);
    }
  }

  public static boolean assignDriverToRide(Ride ride, List<Driver> allDrivers) {
    try {
      Driver firstAvailableDriver = findFirstAvailableDriver(allDrivers);
      ride.setDriver(firstAvailableDriver);
      firstAvailableDriver.setAvailiabilityStatus(DriverStatus.BUSY);
     return true;
    } catch (NoDriverAvailableException e) {
      ride.setRideStatus(RideStatus.CANCELLED);
     return false;
    }
  }
}