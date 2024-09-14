/*
 * This is our Non Void Method Practice on Friday September 13, 2025. It features everything we did in the Methods Intro Practice but instead of using void we are using return. 
 */
public class NonVoidMethodPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//task 1
		System.out.println(stateName());
		System.out.println(StateEyeColor());
		System.out.println(StateHairStyle());
		System.out.println(stateBestFriend());
		System.out.println(stateFavoriteFood());
		
	//task 2
		final double pi = 3.14159;
		double radius = 8.0;
		double diameter = calcDiameter(radius);
		double circumference = calcCircumference(radius, pi);
		double area = calcArea(radius,pi);
		System.out.println("The diameter is " + diameter+ ". The circumference is " +circumference+ ". Finally,the area is " +area);
	
	//task 3
		int h = 2;
		int n= 3;
		findSum(h,n);
		findDifference(h,n);
		findProduct(h,n);
		findQuotient(h,n);
		findModulus(h,n);
		System.out.print("this sum of 2,3 is "+(h+n)+ ". The differnce of 2,3 is "+(h-n)+ ". The product of 2,3 is "+(h*n)+". The quotienet of 2,3 is "+(h/n)+". The modulus of 2,3 is"+(h%n)+".");	
	
  }
	
	// this is task 1; and this says my name,eye color, hair style, best friends, favorite food
	public static String stateName()
	{
		return"My name is Makamae Lyu-Napoleon";	
	}
	public static String StateEyeColor()
	{
	 return"I have brown eyes.";
	}
	public static String StateHairStyle()
	{
		return"My hair is wavy and flows down my back.";
	}
	public static String stateBestFriend()
	{
		return"My best friend is Jolie Baretto-Valmoja.";
	}
	public static String stateFavoriteFood()

	{
		return"I think my favorite food is brownies";
	}
	
	// this is task 2; and this finds  the diameter, circumference, area
	public static double calcDiameter(double r)
	{
		return r+r;
	}
	public static double calcCircumference(double rain, double pie)
	{
		return 2*pie*rain;
	}
	public static double calcArea(double razor, double pile)
	{
		return pile*razor*razor;
		
	}
	
	//this is task 3; and this creates a prints math stuff
	
	public static double findSum(int x, int y)
	{
		return x+y;
	}
	public static double findDifference(int x, int y)
	{
		return x-y;
	}
	public static double findProduct(int x, int  y)
	{
		return x*y;
	}
	public static double findQuotient(int x, int y)
	{
		return x/y;
	}
	public  static double findModulus(int x, int y)
	{
		return x%y;
	}
	
	
}
