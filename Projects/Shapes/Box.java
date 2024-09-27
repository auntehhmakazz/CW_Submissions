/*
 * Friday 20, 2024. This is the fourth shape of my shape project, and it is a Box!! I will find the volune and area of a box.
 */
public class Box {

//data attributes
  	private double length;
  	private double width;
  	private double height;
	
//constructors
  public Box(double l, double w, double h)
    {
    	length = l;
    	width = w;
    	height = h;
    }

//functionality
  /**
   * this method will return the volume of a box
   * @return the volume
   */
  public double getVolume()
    {
    	return 2*(length*width)+2*(length*height)*2*(width*height);
    }
  /**
   * 
   * this method will return the area of a box
   * @return the area
   */
  public double getArea()
    {
    	return length*width*height;
    }


}
