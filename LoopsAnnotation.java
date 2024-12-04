/*
 * This method will return the number month in the year when printed. 
 *
*/
public static String getMonth(int n)
	{
		//this is a string. It has all the months, January - December.
		String months = "January February March April May June "
				+ "July August September October November December ";

    //This is a For Loop.. it will take the string and it will run through the for loop.
    // int i will count the month; if i is less than 12 ; then it will run the i++ which would be 2,3, etc. 
		for (int i = 1; i <= 12; i++)
		{
			// int sL will help the month be eliminated. 
			//In order for the month to be erased it would have to take the SPACE LOCATION. 
			int sL = months.indexOf(' ');

      // N is any number you picked. If the i in the for loop equals to n then it will print whatever month n landed upon.
			if (n == i)
			{
        //
				return months.substring(0, sL);
			}
      // if n and i did not equal. this code will run and it will run the month that is left after the previous has been discarded
			else
			{
        //
				months = months.substring(sL + 1);
			}
		}
		// if i has surpassed 12 or is less than 1.. this code will print.
		return " There is no month associcated with that number ";
		
	}
