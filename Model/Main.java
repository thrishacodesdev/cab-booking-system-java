public class Main {
  public static void main(String[]args)
  {
    Rider ride=new Rider("4567E","Trisha","847593946028");
    System.out.println(ride.getRiderid());
        System.out.println(ride.getName());
    System.out.println(ride.getPhonenumber());
    
    

    ride.setRating(4.0);
    System.out.println(ride.getRating());
    ride.setRating(6.0);
        System.out.println(ride.getRating());


        Driver driver=new Driver("356u","Nagappan","55657434676","0569jg0");
       System.out.println(driver.getAvailiabilityStatus());

        driver.setAvailiabilityStatus(DriverStatus.AVAILABLE);
        System.out.println(driver.getAvailiabilityStatus());

  }
}

