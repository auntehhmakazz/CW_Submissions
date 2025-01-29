public class searchignArraysIntro {
	/*
	 * 
	 * 1. Create a method checkFor4() that is passed an int array and returns true if that array has a 4 and false if that array has no 4's. 
	 * 2. Create a method countFor4() that is passed an int array and returns how many times 4 shows up in the array. 
	 * 3. Create a method checkForFour4() that is passed an int array and return true if the array has exactly four 4's in it. 
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//this is the fake array that the methods will use as a test
		int[] fakeArray = {8,0,3,2};
		//this will run the methods
		System.out.print(checkFor4(fakeArray)+ "\n" + countFor4(fakeArray) +"\n" + checkForFour4(fakeArray));
		
	}
	
	//this method will check if there is any 4 in the array
	public static boolean checkFor4(int[] arr)
	{
	
		boolean isFound = false;
		//this for loop will check each number in the array if there is an array
		for(int i=0; i<arr.length; i++)
		{
			//if any of the number in the boolean equals 4 then it will print whats in the if statement
			if(arr[i] == 4)
			{
				//originally the boolean was false but if the array has a 4 it will change into true
				isFound = true;
			}
		}
		//if there is no 4 then the original isFound variable will print false
		return isFound;
		
	}
	
	//this method will count how many times a 4 is in the array. 
	public static int countFor4(int[] array)
	{
		//this variable is the counter of the 4.. it will start at 0
		int add4 = 0;
		//this for loop run starting from 0 and check if there is any fours in the array
		for(int i = 0; i<array.length; i++)
		{
			//this if statement will run after the for loop has been ran. if there is a for in the array,
			//then the insinde of the if statement will add onto the counter
			if(array[i] ==4)
			{
				add4++;
			}
		}
		//if there is no 4 throughout the whole array then what the counter started at will be printed
		return add4;
	}
	
	//this mehtod will print true if there is 4 fours in the array.. ex. {4,4,4,4} it would be printed true because their is 4 fours
	public static boolean checkForFour4(int[] array)
	{
		//this is the counter and it is started at 0
		int add4 = 0;
		//the for loop will run and see if there is any 4 in the loop.
		for(int i=0; i<array.length; i++)
		{
			//thsi statement will run if i is equal to 4
			if(array[i]==4)
			{
				add4++;
			}
		}
		//if the count is 4 then it will print true
		if(add4==4)
		{
			return true;
		}
		// if there is no 4 it will print false.
		else 
		{
			return false;
		}
	}
	
	
}
