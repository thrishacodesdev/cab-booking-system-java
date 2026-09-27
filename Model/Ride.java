class Ride
{
  private double fare;
  private double distance;
private String rideId;
private RideStatus rideStatus;
private Driver driver;
private Rider rider;

public Ride(String rideId,double distance,Rider rider,Driver driver)
{
  this.rideId=rideId;
  this.distance=distance;
  this.rider=rider;
  this.driver=driver;
  this.fare=0.0;
  this.rideStatus=RideStatus.REQUESTED;
}
public String getRideId()
{
  return rideId;
}
public double getDistance()
{
  return distance;
}
public Rider getRider()
{
  return rider;
}
public Driver getDriver()
{
  return driver;
}
public void setFare(double fare)
{
  if(fare>=0.0)
  {
    this.fare=fare;
  }
  else{
    System.out.println("the fare should be more than zero rupee");
  }
}
public void setRideStatus(RideStatus rideStatus)
{
this.rideStatus=rideStatus;
}
public double getFare()
{
  return fare;
}
public RideStatus getRideStatus()
{
  return rideStatus;
}
}