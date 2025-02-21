/**
 * this is my arrays project assignment
 */
public class arraysProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int[] fakeArray = {2,3,4,5,6};	
		
	//1
	smallestArray(fakeArray);
	System.out.println(fakeArray[0]);
	
	//2
	allNumbers(fakeArray);
	System.out.println(fakeArray[0]);
	
	//3
	
	
	//4
	
	
	//5
	
	
	//6
	
	
	//7
	
	
	//8
	backwardsVersion(fakeArray);
	System.out.print(fakeArray[0]);
	//9
	
	
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
	for (int i=0; i<nums.length; i++)
	{
		
	}
	
	
	
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
public static int evenNumbers(int[] nums)
{
	
}


// 5) If the array ever has two consecutive 5's, change them to 0's. (For example, passing {4,5,5,2,1} changes the array to {4,0,0,2,1}).



// 6) Return true if any number shows up three times in a row, and return false otherwise.



// 7) Pass an array of ints and an int to be searched for. Return how many times that int shows up in the array. (For example, passing ({ 4,5,5,2,1}, 5) returns 2 because 5 shows up twice)



// 8) Alter an array so that is the backwards version of the array initially passed (for example, passing {4,5,5,2,1} changes the array to {1,2,5,5,4})
public static int[] backwardsVersion(int[] nums)
{
	int copy[] = new int[nums.length];
	for(int i = 0; i<nums.length; i++)
	{
		copy[i] = nums[i];
		copy[0] = nums[4];
		copy[1] = nums[3];


		
		//int[] copyArr = new int[nums.length];
	}
	return nums;
}


// 9) Shift all elements in an array to the right. (For example, passing {4,5,5,2,1} changes the array to {1,4,5,5,2})



// 10) Use either selection sort or insertion sort to sort an array. (For example, passing {4,5,5,2,1,} changes the array to {1,2,4,5,5})
public static int[] sortToSortArr(int[] nums)
{
	
}


}
