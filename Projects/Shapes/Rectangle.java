/*
 * Friday 20, 2024. This is the first shape of my shape project, and it is a rectangle!! I will find the perimeter and area  of the rectangle.
 */
public class Rectangle {

//DATA ATTRIBUTES
	private double length;
	private double width;

//CONSTRUCTOR
		public Rectangle(double l, double w)
		{
			length = l;
			width = w;
		}


//FUNCTIONALITY
		/**
		 * 
		 *this method will return the perimeter of a rectangle
		 * @return the perimeter
		 */
		public double getPerimeter()
		{
			return 2*(length+width);
		}
		
		/**
		 * 
		 * this method will return the area of a area
		 * @return the area
		 */
		public double getArea()
		{
			return width*length;
		}

//public Rectangle(int l, int w)
//{
//	length = l;
//	width = w;
//}
//public Rectangle(int s)
//{
//	length = s;
//	width = s;
//}




}



















