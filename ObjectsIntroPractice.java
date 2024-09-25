/*
*this is the public class where I put my attributes, constructors and functions.
*/

public class Circle {
//static does not depend on a specific object
	
	//data attributes 	
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



}
/*
* this is the main method of my circle
*/

{
  
      Circle cirOne = new Circle (3.0);
			Circle cirTwo = new Circle (20.0);
			Circle cirThree = new Circle (-4.0);
		
			String shape = Circle.getShape();
			System.out.println(shape);
			
			
			//this is the radius of circles 1-3
			System.out.println("this is the radius of circles 1-3");
			System.out.println(cirOne.getRadius());
			System.out.println(cirTwo.getRadius());
			System.out.println(cirThree.getRadius());
			
			//this is the diameter of circles 1-3
			System.out.println("this is the diameter of circles 1-3");
			System.out.println(cirOne.getDiameter());
			System.out.println(cirTwo.getDiameter());
			System.out.println(cirThree.getDiameter());
			
			//this is the circumference of circles 1-3
			System.out.println("this is the circumference of circles 1-3");
			System.out.println(cirOne.getCircumference());
			System.out.println(cirTwo.getCircumference());
			System.out.println(cirThree.getCircumference());
			
			//this is the area of circles 1-3
			System.out.println("this is the area of circles 1-3");
			System.out.println(cirOne.getArea());
			System.out.println(cirTwo.getArea());
			System.out.println(cirThree.getArea());
}
