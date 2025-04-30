/**
 * this is my 2D Array Sorter
 */
public class TwoDArray_Soarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double [][] gridNums = 
			{
					{3.6, 4.5, 3.5},
					{4.1, 2.1, 6.5},
					{7.1, 9.2, 8.1}
			};
		
		printArray(gridNums);
		printElementRowMajor(gridNums);
		printElementColumnMajor(gridNums);
	}


	
	//this method will print the array
	public static void printArray(double[][] arr)
	{
		//this for loop will run as long as i is less than the length-1 of the array
		for(int i = 0; i<=arr.length-1; i++)
		{
			//this for loop will run as long as j is less than the length-1
			for(int j = 0; j<=arr.length-1; j++)
			{
				//this will print out the array..I is row and J is column
				System.out.print(arr[i][j]);
				//this leaves a space
				System.out.print("  ");			
			} 
			//this leaves a row
			System.out.println();
		}
	}
	
	//this method will print out the elements in row major
	public static double[][] printElementRowMajor(double[][] arr)
	{
		//this for loop will run as long as i is less than the length of the first rows length-1
		for (int i = 0; i<=arr[0].length-1; i++)
		{
			//this line of code will run after the for loop above runs
			//this line of code will run as long as r is less than or equal to length-1
			for(int r=0; r<=arr.length-1;r++)
			{
				//then this line will print the r and i 
				System.out.println(arr[r][i]);
			}
			printArray(arr);
		}
		// then it will return the array
		return arr;
	}
	
	
	//this method will print out the elements column major
	public static double[][] printElementColumnMajor(double[][] arr)
	{
		//this for loop will run as long as i is less than the length of the array -1
		for(int i=0; i<=arr.length-1;i++)
		{
			//this line of code will run after the for loop above runs
			//this for loop will run as long as r is less than the first row length-1.
			for(int r=0;r<arr[0].length-1;r++)
			{
				//then this line will print out the i and r
				System.out.println(arr[i][r]);
			}
			printArray(arr);
		}
		// then it will return the array
		return arr;
	}
	

}
