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


        Driver driver=new Driver("356u","Nagappan","55657434676","0569jg0");
       System.out.println(driver.getAvailiabilityStatus());

        driver.setAvailiabilityStatus(DriverStatus.AVAILABLE);
        System.out.println(driver.getAvailiabilityStatus());

        Ride ride=new Ride("loed46",9.45,rider,driver);
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

  }
}

