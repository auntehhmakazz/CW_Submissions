/*
 * Friday 20, 2024. This is the Second shape of my shape project, and it is a Cube!! I will find the perimeter and area  of the Cube.
 */
public class Cube {

//Data Attributes
  private double length;
  private double width;


//constructor
  public Cube(double l, double w)
    {
    	length = l;
    	width = w;
    }
	
//functionality
  /**
   * this method will return the perimeter of the cube
   * @return the perimeter
   */
  public double getPerimeter()
    {
    	return 2*length+width;
    }
  /**
   * this method will return the area of the cube
   * @return the area
   */
  public double getArea()
    {
    	return length*width;
    }




}
