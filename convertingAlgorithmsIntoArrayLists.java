import java.util.ArrayList;
/**
 * this is my converting arrays into ArrayLists
 */
public class convertingArrAgstoArrayListAlgsProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer>intArrayList = new ArrayList<Integer>();
		
		//1
		System.out.println(smallestArray(intArrayList));
		
		
		//2
		System.out.println(smallestNumber(intArrayList));
		
		
		//3
		System.out.print(allNumbers(intArrayList));
		
		
		//4
		System.out.println(evenNumbers(intArrayList));
		
		
		//5
		twoConsecutiveFives(intArrayList);
		System.out.println(intArrayList);
		
		
		//6
		System.out.println( anyNumberShowsThreeTimeInRow(intArrayList));
		
		
		//7
		System.out.println(returnManyTimes(intArrayList));
		
		
		//8
		System.out.print(backwardsVersion(intArrayList));

		
		//9
		
		
		
		//10
		
		
		
		}
		
		
		
		
	// 1) Return the smallest number in the array. 
	public static int smallestArray(ArrayList<Integer>Arr)
	{
		// this declares an int called min which will than equal ArrayList(0)
		int min = Arr.get(0);
		// this for loop will run as long as i is less than the length of the ArrayList
		for(int i = 0; i<Arr.size(); i++ )
		{
			// this if statement will take the min value which is whatever the first value is in the arraylist. 
			//it will than see if the min is greater than what i is 
			if(min>Arr.get(i))
			{
				//this code will run if the min value is greater than what i is
				//this code basically changes the min value to what i is
				min = Arr.get(i);
			}
		}
		//this will return the min value
		return min;
	}
	
// 2) Return the index of the smallest number in the array
	public static int smallestNumber(ArrayList<Integer>Arr)
	{
		// this declares an int called min which will than equal ArrayList(0)
		int min = Arr.get(0);
		// this for loop will run as long as i is less than the length of the ArrayList
		for (int i =0; i<Arr.size(); i++)
		{
			// this if statement will take the min value which is whatever the first value is in the arraylist. 
			//it will than see if the min is greater than what i is 
			if(min>Arr.get(i))
			{
				//this code will run if the min value is greater than what i is
				//this code basically changes the min value to what i is
				min = Arr.get(i);
			}
		}
		// this will return the index of the min value
		return Arr.indexOf(min);
	}
	
// 3) Return the average of all numbers in the array.
	public static int allNumbers(ArrayList<Integer>Arr)
	{
		//this declares an int called sum.. in which sum starts at 0
		int sum = 0;
		//this for loop will run as long as i is less than the length of the ArrayList
		for(int i =0; i<Arr.size(); i++)
		{
			//the sum will add one to whatever i was in the in the ArrayList
			sum+=Arr.get(i);
		}
		//this will return the sum divided by the length of the ArrayList
		return sum/Arr.size();
	}
	
// 4) Return true if all numbers in the array are even, and return false otherwise 
	public static boolean evenNumbers(ArrayList<Integer>Arr)
	{
		//this is counter which starts at 0
		int count = 0;
		//this for loop will run as long as i is less than the lenght of the ArrayList
		for(int i = 0; i<Arr.size(); i++)
		{
			//this if statement will run as long as i modulus of 2 equals 0
			if(Arr.get(i) % 2 ==0)
			{
				// then the counter will get added one
				count++;
			}
			//if the count is equal to the ArrayList Length
			if(count==Arr.size())
			{
				//then it will return true
				return true;
			}
		}
		//if not it will return false
		return false;
	}
	
// 5) If the array ever has two consecutive 5's, change them to 0's. (For example, passing {4,5,5,2,1} changes the array to {4,0,0,2,1}).
	public static void twoConsecutiveFives(ArrayList<Integer>Arr)
	{
		// this for loop will run as long as i is less then the length of the ArrayList
		for(int i=0; i<Arr.size()-1; i++)
		{
			//if i is equal to 5 and  i + 1 is equal to five then the code will run
			if(Arr.get(i)==5 && Arr.get(i+1)==5)
				{
					Arr.set(i,0);
					Arr.set(i+1,0);
			
				}
		}

	}

// 6) Return true if any number shows up three times in a row, and return false otherwise.
	public static boolean anyNumberShowsThreeTimeInRow(ArrayList<Boolean>Arr)
	{
		// this for loop will run as long as i is less than the length of the ArrayList minus 2
		for(int i =0; i<Arr.size()-2; i++)
		{
			//this if statement will run as long as i and i+1 are equal to each other and i & i+2 equal the same thing as well
			if(Arr.get(i) == Arr.get(i+1) && Arr.get(i)==Arr.get(i+2))
			{
				//if everything goes smoothly then it will return true
				return true;
			}
		}
		//if nothing equals each other it will return false
		return false;
	}

	// 7) Pass an array of ints and an int to be searched for. Return how many times that int shows up in the array. (For example, passing ({ 4,5,5,2,1}, 5) returns 2 because 5 shows up twice)
	public static int returnManyTimes(ArrayList<Integer>Arr, int r)
	{
		// this is counter and it starts at 0
		int count = 0;
		// this for loop will run as long as i is less than the length of the ArrayList
		for(int i=0; i<Arr.size(); i++) 
		{
			// if i equals to what r is then the if statement will run
			if(Arr.get(i)==r)
			{
				// then this count will add 1
				count++;
			}
		}
		// if nothing works out then the count will just be returned
		return count;

	}
	
// 8) Alter an array so that is the backwards version of the array initially passed (for example, passing {4,5,5,2,1} changes the array to {1,2,5,5,4})
	public static int backwardsVersion(ArrayList<Integer>Arr)
	{
		
		
	}
	

// 9) Shift all elements in an array to the right. (For example, passing {4,5,5,2,1} changes the array to {1,4,5,5,2})
	public static void shiftArrayToTheRight(ArrayList<Integer>Arr)
	{
		
	}
	
