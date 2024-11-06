/*
 * this is my quiz corrections for my logic quiz which was 
 * taken on October 28, 2024
 */

public class LogicQuiz_Corrections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print(findIfIsLeapYear(-4));
		
	}
	
	public static boolean findIfIsLeapYear(int year)
	{
		if (year % 400 ==0 )
		{
			return true;
		}
		else if (year % 100 == 0)
		{
			return false;
		}
		else if (year % 4 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}


	
	
	
