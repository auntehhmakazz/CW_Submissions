/*
 * this is my Loops Intro Practice.. created on November 13, 2024
 */
public class LoopsIntroPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String t = "abqcdqefghqqijk";
	char x = 'q';
	System.out.println(countLetters(t,x));
	System.out.println(getFactorial(5));
	System.out.print(getIfRepeats("aabcd"));
		
	
	}
	
// question 1
	/**
	 * this method will perform a loop.
	 * When a string is input in the main, it will count the letters being used more than once.
	 * @param str
	 * @param let
	 * @return countLetters
	 */
public static int countLetters(String str, char let)
{
	int count = 0;
	for(int i = 0; i < str.length(); i++)
	{
		if(let == str.charAt(i))
		{
			count++;
		}

	}
	
	return count;

	
}
//question 2
/**
 * this method will perform a loop. 
 * it will find the factorial of a number.
 * @param count
 * @return getFactorial
 */
public static int getFactorial(int count)
{
	for (int i = count-1; i > 0; i= i-1)
	{
		count = count * i;
	}
	return count;
}
	
//question 3
/**
 * this method will perform a loop
 * this method will check if letters are being repeated in a string.
 * @param str
 * @return getIfRepeat
 */
public static Boolean getIfRepeats(String str) 
{
	for (int i = 0; i<str.length()-1; i++)
	{
		if(str.charAt(i) == str.charAt(i+1))
		{
			return true;
		}
	}
	
	
	return false;	
}

}
