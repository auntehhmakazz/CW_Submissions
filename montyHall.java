/*
 * This is a Monty Hall Game. Created on October 23,2024
 */
import java.util.Scanner;
public class Monty_HallGame {
	static Scanner myReader = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int winnerDoor = pickRandomDoor();
		int playerDoor = pickPlayerDoor();
		int revealDoor = showWrongDoor(winnerDoor,playerDoor);
		pickNewDoor(playerDoor, revealDoor);
		correctDoor(playerDoor, winnerDoor);
		
		
		myReader.close();
	}
/**
 * this method is to pickRandomDoor
 * @return random door
 */
	private static int pickRandomDoor() 
	{
		return (int)(Math.random()*3)+1;
	}
/**
 * this method is pickPlayerDoor. This method lets a player pick a random door
 * @return pickPlayerDoor
 */
	private static int pickPlayerDoor()
		{
			//Scanner myReader=new Scanner(System.in);
			System.out.print("please choose a number on the door. Either 1,2, or 3");
			String userInput=  new String(myReader.next());
			
			//myReader.close();
			
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
/**
 * this method is showWrongDoor. this method will cover all the possiblities of the differnt types of doors
 * @param playerselectt
 * @param correct
 * @return showWrongDoor
 */
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
			int num = ((int)((Math.random()*2)+1));
			
			if (num == 2)
			{
				return 1;
			}
			else if (num == 1)
			{
				return 3;
			}
			
		}
		
		return -1;
	}
/**
 * this method is pickNewDoor. this method allows the player to choose if they want to switch doors or 
 * if they wan't to keep the one they have already.
 * @param playerselectt
 * @param openDoor
 * @return pickNewDoor
 */
	private static int pickNewDoor( int playerselectt, int openDoor)
	{
		System.out.print("Would you like to switch doors or keep the same one? Put yes if you'd like to and no if you don't");
		String userInput = new String (myReader.next());
		
	
		if(playerselectt == 2 && userInput.equals("yes") && openDoor == 1 )
		{
			return 3;
		}
		else if (playerselectt ==  2 && userInput.equals("yes") && openDoor ==3)
		{
			return 1;
		}
		else if(playerselectt == 1 && userInput.equals("yes") && openDoor == 3)
		{
			return 2;
		}
		else if(playerselectt == 1 && userInput.equals("yes") && openDoor ==2)
		{
			return 3;
		}
		else if (playerselectt == 3 && userInput.equals("yes") && openDoor == 2)
		{
			return 1;
		}
		else if (playerselectt == 3 && userInput.equals("yes") && openDoor == 1)
		{
			return 2;
		}
		
		
		return openDoor;
		
	
		
	}
/**
 * this method is correctDoor. this method tells the player whether he won or not
 * @param playerDoor
 * @param winnerDoor
 */
	private static void correctDoor(int playerDoor, int winnerDoor)
	{
		
		if (playerDoor == winnerDoor)
		{
			System.out.print("YOU WIN!!! thank you for playing");
		}
	}
	
	}
	
	
