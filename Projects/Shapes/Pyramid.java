/*
 * Friday 20, 2024. This is the Third shape of my shape project, and it is a Box!! I will find the volume and length of a pyramid.
 */
public class Pyramid {

//Data Attributes
		private double length;
		private double width;
		private double height;
		private double volume;

//Constructors

		public Pyramid(double l, double w, double h, double v)
		{
			length = l;
			width = w;
			height = h;
			volume = v;
		}


//functionality

		/**
		 * this method will return the volume of the pyramid
		 * @return the volume
		 */	
		public double getVolume()
		{
			return length*width*height/3;
		}
		
		
		/**
		 * this method will return the length of the pyramid
		 * @return the length
		 */
		public double getLength()
		{
			return volume/(height*width)/3;
		}
	
	
	
	}
