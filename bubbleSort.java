public class ArrayWork_2_10_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	int[] nums = {2,3,4};
	int counter = 3;
	while(counter !=0)
	{
		counter = 0;
		for(int i=0; i<nums.length-1; i++)
		{
			if(nums[i]>nums[i+1])
			{
				int temp = nums[i];
				nums[i] = nums[i+1];
				nums[i+1] = temp; 
				counter++;
			}
		}
	}
		
		
	}

}
