import java.util.Scanner;

public class Strings_intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//this is my scanner
		Scanner myReader = new Scanner(System.in);
		String myWord = new String(myReader.next());
		
		
		myReader.close();
		
		
		
	
		printSecondAndLastLetter(myWord);
		findTheEThat(myWord);
		getLength(myWord);
		firstAndLastThree(myWord);
	
	}
	
	//question 2.. I do know how to spell exeute but I thought it was funny
	/**
	 *  this method will print the second and last letter of the word
	 * @param xecute
	 */
	public static void printSecondAndLastLetter(String xecute)
	{
		System.out.print("the second letter is " +xecute.charAt(1)+ " and the last letter is "+xecute.charAt(xecute.length()-1) +".");
	}
	
	
	//question 3
	/**
	 * This method finds the index of E
	 * @param Xylophone
	 */
	public static int findTheEThat(String Xylophone)
	{
		
		return Xylophone.indexOf('e');
	}
	
	//question 4
	/**
	 * this method will find the length of the word
	 * @param Rat
	 */
	public static int getLength(String Rat)
	{
		return Rat.length();
	}
	
	//question 5
	/**
	 * this method will find the first character and the last three characters.
	 * @param paniolos
	 */
	
	public static void firstAndLastThree(String paniolos)
	{
		System.out.print("the first three character is "+paniolos.substring(0,3));
		System.out.print(" and the last three letters are " +paniolos.substring(paniolos.length()-3));

	}
}

