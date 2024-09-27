/**
 * Friday 20, 2024. This is the fourth shape of my shape project, and it is a Cylinder!! I will find the volume and area of a box.
 */
public class Cylinder1 {

public void setRadius(double radius) 
    {
		this.radius = radius;
  	}

public void setHeight(double height) 
    {
		this.height = height;
  	}
	//data attributes
  	private final double pi = 3.14;
  	private double radius;
  	private double height;

//constructors
  	public Cylinder1(double r, double h)
  	{
  		radius = r;
  		height = h;
  	}
	
//functionality
  /**
   * This method will return the volume of the cylinder
   * @return the volume
   */
  	public double getVolume()
  	{
  		return pi*radius*radius*height;
  	}
  /**
   * this method will return out the area of the cylinder
   * @return the area 
   */
  	public double getArea()
  	{
  		return 2*pi*radius*(radius*height);
	  }
	
}

