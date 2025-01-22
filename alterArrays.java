public class alteringArrays {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		//original array
		int[] nums = {5,10,15,20};
		//array wont be printed in a print statement
		System.out.print(subtract5FromAll4(nums));
		
	}
	
	// this is a array method
	public static int[] subtract5FromAll4 (int[] arr)
	{
		//this is the new array 
		int[] copyArr = new int [arr.length];
		//this for loop will take the numbers from the original array and will run through the loop.
		//when it runs through everything will minus by 5
		for(int i = 0; i<arr.length; i++)
		{
			copyArr[i] = arr[i]-5;
		}
		// it will return the final numbers in the array. 
		return copyArr;
		
	}

}

