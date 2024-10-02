/*
  * This class has all about a circle... It will find a radius, diameter, circumference, and area.
  */
public class Circle {
//static does not depend on a specific object
	
	
//Data Attributes 	
private final double pi = 3.14;
private double radius;

//constructor
		public Circle(double r)
		{
			radius = r;
		}

//FUNCTIONALITY
		/**
		 * this method will return the radius of the circle
		 * @return the radius
		 */
		public double getRadius()
		{
			return radius;
		}
		/**
		 * 
		 * this method will return the diameter of the circle
		 * @return the diameter
		 */
		public double getDiameter()
		{
			return 2*radius;
		}
		/**
		 * this method will return the circumference of the circle
		 * @return the circumference
		 */
		public double getCircumference()
		{
			return 2*pi*radius;
		}
		/**
		 * this method will return the area of the circle
		 * @return the area
		 */
		public double getArea()
		{
			return pi*radius*radius;
		}
		/**
		 * this method will return the shape
		 * @return the shape
		 */
		public static String getShape()
		{
			return "Circle";
		}
		
		/**
		 * this turn everything about the circle object into a string
		 * 
		 */
		public String toString()
		{
			return "this is a cube with radius " +radius+ "and an aread of "
					+getArea()+"and circumfernece of " +getCircumference()+".";
		}
		
		public void setRadius(double r)
		{
			radius = r;
		}
		


}



