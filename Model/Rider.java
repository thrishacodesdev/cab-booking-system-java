class Rider
{
  private String riderId;
  private String name;
  private String phoneNumber;
  private double rating;

  public Rider(String riderId,String name,String phoneNumber)
  {
    this.riderId=riderId;
    this.name=name;
    this.phoneNumber=phoneNumber;
    this.rating=5.0;
  }
  public String getRiderId()
  {
    return riderId;

  }
  public String getName()
  {
    return name;
  }
  public String getPhoneNumber()
  {
    return phoneNumber;
  }
  public void setRating(double points)
  {
    if(points>=0.0 && points <=5.0)
    {
      rating=points;
    }
    else
    {
      System.out.println("Rating must be between 5.0 and 0.0");
    }
  }

  public double getRating()
  {
    return rating;
  }
 @Override 
public String toString()
  {
    return "Rider{riderId="+riderId+" , name="+name+" , phoneNumber="+phoneNumber+"}";
  }
}