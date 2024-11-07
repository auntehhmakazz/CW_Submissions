/*
 * This is a Monty Hall Game. Created on October 23,2024
 */
import java.util.Scanner;
public class Monty_HallGame {
	static Scanner myReader = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int winDoor = pickRandomDoor();
		int playerDoor = pickPlayerDoor();
		int revealDoor = showWrongDoor(winDoor,playerDoor);
	
		
		myReader.close();
	}

	private static int pickRandomDoor() 
	{
		return (int)(Math.random()*3)+1;
	}

	private static int pickPlayerDoor()
		{
			Scanner myReader=new Scanner(System.in);
			System.out.print("please choose a number on the door. Either 1,2, or 3");
			String userInput=  new String(myReader.next());
			
			myReader.close();
			
			if (userInput.equals("one")|| userInput.equals("1"))
			{
				return 1;
			}
			else if (userInput.equals("two")|| userInput.equals("2"))
			{
				return 2;
			}
			else if (userInput.equals("three")|| userInput.equals("3"))
			{
				return 3;
			}
			else 
			{
				System.out.print("You messed up.. try again");
				return 0;
			}
		
	
		}
	
	private static int showWrongDoor(int playerselectt, int  correct )
	{
		
		if (playerselectt == 1 && correct ==2)
		{
			return 3;
		}
		else if (playerselectt == 1 && correct == 3)
		{
			return 2;
		}
		else if (playerselectt == 1 && correct == 1)
		{
			return ((int)(Math.random()*2)+2);
		}
		if (playerselectt == 2 && correct == 1)
		{
			return 3;
		}
		if (playerselectt == 2 && correct == 1)
		{
			return 3;
		}
		if (playerselectt == 2 && correct == 3)
		{
			return 1;
		}
		
		else if (playerselectt == 2 && correct ==2)
		{
			
		}
		
		return showWrongDoor(0, 0);
	}
	
	}
	
	
