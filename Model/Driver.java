class Driver
{
 private String driverId;
  private String name;
 private String phoneNumber;
 private String vehicleNumber;
  private DriverStatus availiabilityStatus;

  public Driver(String driverId,String name,String phoneNumber,String vehicleNumber)
  {
    this.driverId=driverId;
    this.name=name;
    this.phoneNumber=phoneNumber;
    this.vehicleNumber=vehicleNumber;
    this.availiabilityStatus=DriverStatus.OFFLINE;
  }
  public String getDriverId()
  {
    return driverId;
  }
  public String getName()
  {
    return name;
  }
  public String getPhoneNumber()
  {
    return phoneNumber;
  }
  public String getVehicleNumber()
  {
    return vehicleNumber;
  }
  public DriverStatus getAvailiabilityStatus()
  {
    return availiabilityStatus;
  }
  public void setAvailiabilityStatus(DriverStatus status)
  {
    this.availiabilityStatus=status;
  }
@Override 
  public String toString()
  {
    return "Driver{driverId="+driverId+" , name="+name+" , status="+availiabilityStatus+"}";
  }
}