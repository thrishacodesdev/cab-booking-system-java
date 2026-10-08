import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[]args)
  {
   Rider rider=new Rider("4567E","Trisha","847593946028");
    System.out.println(rider.getRiderId());
        System.out.println(rider.getName());
    System.out.println(rider.getPhoneNumber());
    
    

    rider.setRating(4.0);
    System.out.println(rider.getRating());
    rider.setRating(6.0);
        System.out.println(rider.getRating());


        Driver driver1=new Driver("356u","Nagappan","55657434676","0569jg0");
       System.out.println(driver1.getAvailiabilityStatus());

        driver1.setAvailiabilityStatus(DriverStatus.AVAILABLE);
        System.out.println(driver1.getAvailiabilityStatus());

        Ride ride=new Ride("loed46",9.45,rider,driver1);
System.out.println(ride.getRideId());
System.out.println(ride.getDistance());
System.out.println(ride.getFare());
System.out.println(ride.getRideStatus());

System.out.println(ride.getRider().getRiderId());
ride.setFare(160.0);
System.out.println(ride.getFare());
ride.setFare(-150.0);
System.out.println(ride.getFare());

ride.setRideStatus(RideStatus.ONGOING);
System.out.println(ride.getRideStatus());

  

  Driver driver2=new Driver("thsl34gof", "Thara", "3865739597", "hdieu2");
  driver2.setAvailiabilityStatus(DriverStatus.BUSY);

  System.out.println(driver2.getAvailiabilityStatus());

  Driver driver3=new Driver("wjdnfg78", "Trisha", "3640584578", "rogh967");
  driver3.setAvailiabilityStatus(DriverStatus.OFFLINE);

  System.out.println(driver3.getAvailiabilityStatus());

//create driverlist
List<Driver>driverlist=new ArrayList<>();

  driverlist.add(driver1);
  driverlist.add(driver2);
  driverlist.add(driver3);

  
List<Driver> availableDrivers=DriverService.findAllAvailableDriver(driverlist);
for(Driver d:availableDrivers)
{
  System.out.println(d);
}
Driver firstAvailableDriver=DriverService.findFirstAvailableDriver(driverlist);
if(firstAvailableDriver==null)
{
  System.out.println("No Available Drivers");
}
else{
  System.out.println(firstAvailableDriver);
}



}
}
