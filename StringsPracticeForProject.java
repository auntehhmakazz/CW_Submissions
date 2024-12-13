/*
 * this is my strings practice assignment. 
 * In question one it asks to use a while loop and then let the user print a word, however many times they want until they choose to say stop. it will also count how many times it has been repeated
 * In question two asks for the original radius of the circle and then lets a user input a radius of their own and then it will add the original radius to the new one.
 * 
 */
import java.util.Scanner;
public class StringsPractice {
	static Scanner myReader = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//I declared test true so that the while loop will run.
		boolean test = true;
		// int count will count how many times the strong will be printed
		int count = 0;
		/**
		 * this is my while loop. It will run whatever is inside the code until the user says stop.
		 */
		while(test)
		{
			//just opened the scanner again
			String userInput = new String (myReader.next());
			//this line of code is letting the user input whatever word or phrase they want. 
			System.out.println(userInput);
			//this if statement is basically saying if the user says stop then the phrase will stop printing
			if (userInput.equals("stop"))
			{
				test = false;
			}
			//this line is basically going along with the word that the user input
			// it is counting how many times the users word is being repeated until the user says stop.
			count++;
			//this code will print both the count and user input together.
			System.out.println(count + userInput);
		} 
		//this is calling the method
		makeCircle();
		
		myReader.close();
	
	
	}	
	/**
	 * this is a method for my circle that will let the user input what ever variable they would like as long as its a double.
	 * 
	 */
	public static void makeCircle()
	{
		//this code. basically states the original radius of the circle which is 3.0
		Circle cirOne = new Circle (3.0);
		// this code will print out the original radius so that the user knows what the original was
		System.out.println("the original radius is "+cirOne.getRadius());
		//for loop will run only 5 times. it basically is saying that i will start at 1
		// then it will run threw the test and so forth. 
		for(int i = 1; i <= 5; i++)	
		{
			// this line of code opens the scanner and lets the user input a double
			double r = myReader.nextDouble();
			// this will add the original circles radius and the users input
			System.out.println(cirOne.getRadius() +r);
			// this line will set the sum of the previous line of code as the new radius.
			cirOne.setRadius(cirOne.getRadius() +r);
		}
	}
	
	
	
}
