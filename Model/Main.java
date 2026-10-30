import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    Rider rider1 = new Rider("4567E", "Merina", "847593946028");
    System.out.println(rider1.getRiderId());
    System.out.println(rider1.getName());
    System.out.println(rider1.getPhoneNumber());

    rider1.setRating(4.0);
    System.out.println(rider1.getRating());
    rider1.setRating(6.0);
    System.out.println(rider1.getRating());

    Driver driver1 = new Driver("356u", "Nagappan", "55657434676", "0569jg0");
    System.out.println(driver1.getAvailiabilityStatus());

    driver1.setAvailiabilityStatus(DriverStatus.BUSY);
    System.out.println(driver1.getAvailiabilityStatus());

    Ride ride1 = new Ride("loed46", 9.45, rider1);
    System.out.println(ride1.getRideId());
    System.out.println(ride1.getDistance());
    System.out.println(ride1.getFare());
    System.out.println(ride1.getRideStatus());

    System.out.println(ride1.getRider().getRiderId());
    ride1.setFare(160.0);
    System.out.println(ride1.getFare());
    ride1.setFare(-150.0);
    System.out.println(ride1.getFare());

    ride1.setRideStatus(RideStatus.ONGOING);
    System.out.println(ride1.getRideStatus());

    Driver driver2 = new Driver("thsl34gof", "Thara", "3865739597", "hdieu2");
    driver2.setAvailiabilityStatus(DriverStatus.AVAILABLE);

    System.out.println(driver2.getAvailiabilityStatus());

    Driver driver3 = new Driver("wjdnfg78", "Trisha", "3640584578", "rogh967");
    driver3.setAvailiabilityStatus(DriverStatus.OFFLINE);

    System.out.println(driver3.getAvailiabilityStatus());

    // create driverlist
    List<Driver> driverlist = new ArrayList<>();

    driverlist.add(driver1);
    driverlist.add(driver2);
    driverlist.add(driver3);

    // all available drivers from driver list
    List<Driver> availableDrivers = DriverService.findAllAvailableDriver(driverlist);
    for (Driver d : availableDrivers) {
      System.out.println(d);
    }

    Rider rider2 = new Rider("T58323", "Priya", "94805039305");
    Rider rider3 = new Rider("T583596", "Shalini", "8596743939");

    Ride ride2 = new Ride("YFJGOG9", 10.09, rider2);
    Ride ride3 = new Ride("It95GOG9", 11.00, rider3);

    boolean assigned1 = DriverService.assignDriverToRide(ride2, driverlist);
    if (assigned1) {
      System.out.println("You driver is on the way");
    } else {
      System.out.println("Sorry no driver is available");
    }

  }
}