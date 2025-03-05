**
 * this is my arrays project assignment
 */
public class arraysProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int[] fakeArray = {2,3,4,5,6};	
		
	//1
	System.out.println(smallestArray(fakeArray));
	
	//2
	System.out.println(smallestNumber(fakeArray));
	
	//3
	System.out.println(allNumbers(fakeArray));
	
	
	//4
	System.out.println(evenNumbers(fakeArray));
	
	//5
	System.out.println(twoConsecutiveFives(fakeArray));
	for (int i=0; i<fakeArray.length; i++)
	{
		System.out.println((fakeArray[i]));
	}
	//6
	System.out.println(anyNumberShowsThreeTimesInRow(fakeArray));
	
	//7
	System.out.println(returnManyTimes(fakeArray));
	
	//8
	
	System.out.print(backwardsVersion(fakeArray));
	//9
	
	for (int i=0; i<fakeArray.length; i++)
	{
		System.out.println((fakeArray[i]));
	}
	//10
	
	
	}
	
	
	
	
// 1) Return the smallest number in the array. 
public static int[] smallestArray(int[] nums)
{
	//this is basically how many numbers in the array
	int counter = 5;
	//this while loop will keep he for loop going as long as the counter is not 0
	while(counter !=0)
	{
		counter = 0;
		//this for loop will run the if statement
		for(int i=0; i<nums.length-1; i++)
		{
			//if nums i is less than i+1
			if(nums[i]>nums[i+1])
			{
				//the temp will equal i
				int temp = nums[i];
				//i from the previous code will then equal i + 1(number after i)
				nums[i] = nums[i+1];
				//the number after i will equal temp
				nums[i+1] = temp;
				//then the counter will add one onto counter
				counter++;
			}
		}
	}
	//this will return the new array
	return nums;
}



// 2) Return the index of the smallest number in the array. 
public static int smallestNumber(int[] nums)
{
	// the min value is equal to the first int in the array
	 int min = nums[0];
	 //the indx is equal to 0
	 int indx = 0;
	 //this for loop will take the int i which is 0.. run it through the loop in which case 0 is less than the l=length of the array.
	 for(int i =0; i<nums.length; i++)
	 {
		 //if the min value is less than what i is.. then the if loop will run
		 if (min> nums[i])
		 {
			 //the min value will then equal whatever nums[i] is
			 min = nums[i];
			 //now the indx will equal whatever i is
			 indx=i;
		 }
	 
	 }
	//this will return the final indx
	return indx;
}


// 3) Return the average of all numbers in the array.
public static int allNumbers(int[] nums)
{
	//the sum will start at 0
	int sum = 0;
	//this for loop will check every number in the array
	for(int i = 0; i<nums.length; i++)
	{
		//sum will add all nums up.. one by one
		sum += nums[i];
	}
	//it will return all the added up nums and then divide by the length of the array.
	return sum/nums.length;
	
}


// 4) Return true if all numbers in the array are even, and return false otherwise 
public static boolean evenNumbers(int[] nums)
{
	int count = 0;
	for(int i= 0; i<nums.length; i++)
	{
		if(nums[i]%2==0)
		{
			count++;
		}
		if(count==nums.length)
		{
			return true;
		}
	}
	return false;
}


// 5) If the array ever has two consecutive 5's, change them to 0's. (For example, passing {4,5,5,2,1} changes the array to {4,0,0,2,1}).
public static int[] twoConsecutiveFives(int[] nums)
{
	//this for loop will run.. if i is less than then the length-1
	for(int i =0; i<nums.length-1; i++)
	{
		//if nums[i] is equal to 5 and nums[i+1] is equal to 5.. then this loop will run
		if(nums[i] ==5 && nums[i+1] ==5)
		{
			//nums[i] will than equal to 0
			nums[i] = 0;
			//nums[i+1] will than equal tot 0
			nums[i+1] =0;
		}
	}
	//this will return then nums
	return nums;
}


// 6) Return true if any number shows up three times in a row, and return false otherwise.
public static boolean anyNumberShowsThreeTimesInRow(int[] nums)
{
	for(int i=0; i<nums.length-2; i++)
	{
		if(nums[i] == nums[i+1] && nums[i]== nums[i+2])
		{
			return true;
		}
		
	}
	return false;
}


// 7) Pass an array of ints and an int to be searched for. Return how many times that int shows up in the array. (For example, passing ({ 4,5,5,2,1}, 5) returns 2 because 5 shows up twice)
public static int returnManyTimes(int[] nums, int r)
{
	int count = 0;
	for(int i=0; i < nums.length; i++)
	{
		if (nums[i] == r )
		{
			count++;
		}
	}
	return count;
}

// 8) Alter an array so that is the backwards version of the array initially passed (for example, passing {4,5,5,2,1} changes the array to {1,2,5,5,4})
public static int[] backwardsVersion(int[] nums)
{
	//this will make a copy of the array
	int copy[] = new int[nums.length];
	//this for loop will run if i is less than the length of nums
	for(int i = 0; i<nums.length; i++)
	{
		//the copy array[i] will than equal what nums[i] is
		copy[i] = nums[i];
		
		copy[0] = nums[4];
		copy[1] = nums[3];


		
		//int[] copyArr = new int[nums.length];
	}
	return nums;
}


// 9) Shift all elements in an array to the right. (For example, passing {4,5,5,2,1} changes the array to {1,4,5,5,2})
public static void shiftArrayToTheRight(int[] nums)
{
	int temp = nums[nums.length-1];
	
	for(int i=1; i<nums.length; i++)
	{
		nums[i] = nums[i-1];
		
	}
	

}


// 10) Use either selection sort or insertion sort to sort an array. (For example, passing {4,5,5,2,1,} changes the array to {1,2,4,5,5})
public static void sortToSortArr(int[] nums)
{
	for(int i=0; i<nums.length-1; i++)
	{
		
		
		
	}
}


}

