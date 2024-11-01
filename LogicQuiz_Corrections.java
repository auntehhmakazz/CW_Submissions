/*
 * this is my quiz corrections for my logic quiz which was 
 * taken on October 28, 2024
 */

public class LogicQuiz_Corrections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print(findIfIsLeapYear(300));
		
	}

	// this is the method
	public static boolean findIfIsLeapYear(int year)
	{
		// if the year is divisble by 400 it will return true 
		if ( year % 400 ==0)
		{
			return true;
		}
		// if it isn't divisible by 400 or 100 it will return false
		else if (year % 400 != 0 || year % 100 == 0)
		{
			return false;
		}

		return false;
	}


	
	
	
}
