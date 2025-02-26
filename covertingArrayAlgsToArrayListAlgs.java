
/**
 * this is my classwork on February 24, 2025
 */

import java.util.ArrayList;
public class covertingArrayAlgsToArrayListAlgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>intArrayList = new ArrayList<Integer>();
		
		intArrayList.add(4);
		intArrayList.add(5);
		intArrayList.add(1);
		intArrayList.add(6);
		intArrayList.add(3);
		
		System.out.println(checkFor4(intArrayList));
		ridAllFives(intArrayList);
		System.out.println(intArrayList);
		bubbleSort(intArrayList);
		System.out.println(intArrayList);
		
		
	
	
	}
	// 1) Create a method checkFor4() that is passed an ArrayList and returns the index of the first 4 if that array has a 4 and -1 if that array has no 4's. 
	
			public static int checkFor4(ArrayList<Integer>intArrayList)
			{
				//this starts a counter
				int counter = 0;
				// this is a for loop.. it will start at 0, then go through the whole loop
				for(int i = 0; i< intArrayList.size(); i++)
				{
					//this loop will then run and if i equals to 4 the code in side the if loop will run
					if(intArrayList.get(i)==4)
					{
						//this will return i
						return i;				
					}
				}
				
				return counter;	
			}
			
	/*
	 * 2)Create a method ridAllFives() that is passed an ArrayList nums and altars that ArrayList without returning anything. The ArrayList will have any 5’s deleted from nums.
	 * Ex: subtract5FromAll4( {5, 5, 0, 8, 5, 20}  )   -------turns nums into----->     {0, 8, 20}
	 */
		
		public static void ridAllFives(ArrayList<Integer>IntArrayList)
		{
			//this starts a counter
			int counter = 0;
			//this for loop will start at 0; then if i is less than the array list length; then the if loop will run
			for(int i = 0; i< IntArrayList.size()-1; i++)
			{
				// the if loop will run and if i equals 5... then the code inside will run
				if(IntArrayList.get(i)==5)
				{
					//if i i equals 5 then it will remove i
					IntArrayList.remove(i);				
				
				}
			}
		}
			
		
	// 3)  Create a method bubbleSort() that is passed an ArrayList and sorts it using bubblesort.
		
		public static void bubbleSort(ArrayList<Integer>IntArrayList)
		{
			//counter starts at 0
			int counter = 0;
			//this while loop will run if i isnt 0
			while(counter !=0)
			{
				//another counter will start at 0
				counter = 0;
				// this for loop will run.. i will equal 0; then if i is less than the array lists length.. the for loop will run
				for(int i=0; i<IntArrayList.size()-1; i++)
				{
					//this if loop will run.. it will get i
					if(IntArrayList.get(i)>IntArrayList.get(i+1))
					{
						int temp =IntArrayList.get(i);
						IntArrayList.set(i, i+1);
						IntArrayList.set(i+1, temp);
						counter++;
					}
				}
			}
		}
		
			
}
