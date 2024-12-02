/*
 * This method will declare the months when printed. 
 *
*/
public static String getMonth(int n)
	{
		//this is a string. It has all the months, January - December
		String months = "January February March April May June "
				+ "July August September October November December ";

    //This is a For Loop.. it will take the string and it will run through the for loop.
    //The int i 
		for (int i = 1; i <= 12; i++)
		{
			// 
			int sL = months.indexOf(' ');

      //
			if (n == i)
			{
        //
				return months.substring(0, sL);
			}
      //
			else
			{
        //
				months = months.substring(sL + 1);
			}
		}
		//i
		return " /* What String would you put here? */ ";
		
	}
