/*
 * My name is Makamae Lyu-Napoleon and today is September 11, 2024. I am doing a Method Intro Practice. In this class I declared my name, hair style and favorite food.
  In this class it will also find the diameter, radius, circumfernce and area of a circle.
 */
public class Methods_Intro_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StateName();
		StateHairStyle();
		stateFavoriteFood();
		circleStats(4.0);
		printMathStuffs(9,8);
		
	
	}

	// this method will print my name, eye color, hair style, best friend, and favorite food.
	public static void StateName()
	{
		System.out.print("My name is Thandie Lyu-Napoleon.");
	}
	public static void StateEyeColor()
	{
		System.out.print(" I have brown eyes.");
	}
	public static void StateHairStyle()
	{
		System.out.print(" My hair is wavy and flows down my back.");
	}
	
	public static void stateBestFriend()
	{
		System.out.print(" My best friend is Jolie Baretto-Valmoja.");
	}
	public static void stateFavoriteFood()
	{
		System.out.println(" I think my favorite food is brownies");
	}
	
	// this method will find the radius, diameter, circumference and area of a circle In which I declared my radius as 4.0.
	public static void circleStats(double r)
	{
		final double pi=3.14159;
		double d = 2*r;
		double c = 2*pi*r;
		double a = pi*r*r;
		
    System.out.print("the radius is "+r);
		System.out.print(" the diameter is "+d);
		System.out.print(" the circumference is "+c);
		System.out.println(" the area is "+a);
	}
		
	// this method will find the sum, difference, product, quotient and remainder. Of the numbers 9 and 8 which are declared when I call it in the main method.
	public static void printMathStuffs(int t, int h)
	{
		int sum = t+h;
		int diff = t-h;
		int prod = t*h;
		int quot = t/h;
		int remain = t%h;
		
		System.out.print("the sum is " +sum+" and the differnce is "+diff+ " and the product is "+prod+ " and the quotient is " +quot+ " and finally the remainder is " +remain );
	
	}
	
	
}


