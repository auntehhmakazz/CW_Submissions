/**
 * this is my arrays intro class.
 */
public class Arrays_Intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//question 1.. this is empty arrays
		double[] doubArr = {};
		int[] intArr = {};
		boolean[] booArr = {};
		String[] strArr = {};
		//this would work if I had a circle class
		//Circle[] cirArr = {};
		
		//question 2.. 
		int[] intArray = {7,-12,88-88,0,5,2000};
		System.out.println(intArray[intArray.length-1]);
		
		//question 3.. the default value for ints is 0, the double is 0. the booleans false, Strings/reference data types is null.
		String[] fruitArr = new String[5];
		
		//question 4.. this will put bapple at the second fruit array.
		fruitArr[1] = "Bapple";
		
		//question 5.. this will print the last word in the fruit array.
		fruitArr[fruitArr.length-1] = "Zanana";
		System.out.println(fruitArr[fruitArr.length-1]);

		//question 6.. this will print bapple which is the second element in the fruits array
		System.out.println(fruitArr[1]);
		
		//question 7.. this will print a each thing in the array.
		for(int i = 0 ; i<=fruitArr.length-1; i++)
			{
				System.out.print(fruitArr[i]);
			}
			
	}

}
