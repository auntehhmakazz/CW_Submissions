/**
*Friday 20, 2024. This is my shape project. The shapes that I did are rectangle, cube, pyramid, boxes, cylinders. I found the perimeters, areas, volumes and lengths. 
*/
public class Main {
	
	//String shape = Circle.getShape();
	//System.out.print(shape);
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

 
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
			
			//the
			System.out.println(cirOne.toString());
			System.out.println(cirTwo.toString());
			System.out.println(cirThree.toString());
			System.out.println();
			
			
		  /*
		   * This is my FIRST shape a rectangle.. I will find the perimeter and area of it.
		   */
		  Rectangle recOne = new Rectangle(4.0, 5.0);
		  Rectangle recTwo = new Rectangle (20.0, 3.0);
		  Rectangle recThree = new Rectangle (-4.0, 2.0);
		
		  // this	is the perimeter of rectangles 1-3
		  System.out.println();
		  System.out.println("this is the perimeter of rectangles 1-3");
		  System.out.println(recOne.getPerimeter());
		  System.out.println(recTwo.getPerimeter());
		  System.out.println(recThree.getPerimeter());
		
		  //this is the area of rectangles 1-3
		  System.out.println("this is the area of rectangles 1-3");
		  System.out.println(recOne.getArea());
		  System.out.println(recTwo.getArea());
		  System.out.println(recThree.getArea());
				
		  /*
		   * My SECOND shape is a cube. I will find the perimeter and area of it.
		   */
		  Cube cuOne = new Cube (2.0,3.0);
		  Cube cuTwo = new Cube (6.0,7.0);
		  Cube cuThree = new Cube (1.0,10.0);
		
		  //this is the perimeter of cubes 1-3]
		  System.out.println();
		  System.out.println("this is the perimeter of cubes 1-3");
		  System.out.println(cuOne.getPerimeter());
	  	System.out.println(cuTwo.getPerimeter());
	  	System.out.println(cuThree.getPerimeter());
		
	  	//this is the area of cubes 1-3
	  	System.out.println("this is the area of cubes 1-3");
	  	System.out.println(cuOne.getArea());
	  	System.out.println(cuTwo.getArea());
	  	System.out.println(cuThree.getArea());
		
	  	/*
	  	 * my THIRD shape is a pyramid. I will find the volume and length.
	  	 */
	  	Pyramid pyOne = new Pyramid (3.0, 6.0, 4.0,9.0);
	  	Pyramid pyTwo = new Pyramid (9.0,5.0,6.0,7.0);
	  	Pyramid pyThree = new Pyramid (4.0,2.0,1.0,6.0);
		
	  	//this is the Volume of Pyramids 1-3
		  System.out.println();
		  System.out.println("this is the volume of pyramids 1-3");
	  	System.out.println(pyOne.getVolume());
	  	System.out.println(pyTwo.getVolume());
	  	System.out.println(pyThree.getVolume());
		
		  //this is the length of pyramids 1-3
	  	System.out.println("this is the length of pyramids 1-3");
		  System.out.println(pyOne.getLength());
		  System.out.println(pyTwo.getLength());
	  	System.out.println(pyThree.getLength());	
		
	  	/*
	  	 * Friday 20, 2024. This is the fourth shape of my shape project, and it is a Box!! I will find the volume and area of a box.
	  	 */
		
	  	Box boOne = new Box (3.0,4.0,9.0);
	  	Box boTwo = new Box (1.0,2.0,5.0);
	  	Box boThree = new Box (2.0,4.0,56.0);
		
	  	//this the volume of boxes 1-3
	  	System.out.println();
	  	System.out.println("this is the volume of boxes 1-3");
	  	System.out.println(boOne.getVolume());
	  	System.out.println(boTwo.getVolume());
	  	System.out.println(boThree.getVolume());
		
		  //this is the area of boxes 1-3
	  	System.out.println("this is the area of boxes 1-3");
		  System.out.println(boOne.getArea());
		  System.out.println(boTwo.getArea());
	  	System.out.println(boThree.getArea());
		
	  	/*
	  	 * Friday 20, 2024. This is the fifth shape of my shape project, and it is a Cylinder!! I will find the volume and area of a box.
		   */
		
	  	Cylinder1 cyOne = new Cylinder1(2.0, 3.0);
	  	Cylinder1 cyTwo = new Cylinder1(3.0,7.0);
	  	Cylinder1 cyThree = new Cylinder1(8.0,9.0);
		
	  	//this is the volume of cylinders 1-3
	  	System.out.println();
	  	System.out.println("this is the volume of cylinders 1-3");
	  	System.out.println(cyOne.getVolume());
	  	System.out.println(cyTwo.getVolume());
	  	System.out.println(cyThree.getVolume());
		
	  	//this is the area of cylinders 1-3
	  	System.out.println("this is the area of cylinders 1-3");
  		System.out.println(cyOne.getArea());	
  		System.out.println(cyTwo.getArea());
  		System.out.println(cyThree.getArea());
	
	  	//Rectangle rec1 = new Rectangle(3,7);

	  	System.out.println(cyOne);
	  	System.out.println(cirOne.toString());
		
  
}

}
