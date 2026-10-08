import java.util.List;
import java.util.ArrayList;

public class DriverService {
  public static List<Driver> findAllAvailableDriver(List<Driver> allDrivers)
  {
    List<Driver>availableDrivers=new ArrayList<>();
for(Driver d:allDrivers)
{
  if(d.getAvailiabilityStatus()==DriverStatus.AVAILABLE)
  {
    availableDrivers.add(d);
  }

}
return availableDrivers;
  }

  public static Driver findFirstAvailableDriver(List<Driver> allDrivers)
  {
    List<Driver>available=findAllAvailableDriver(allDrivers);

    if(available.isEmpty())
    {
      return null;
    }
    else{
      return available.get(0);
    }
  }
}

