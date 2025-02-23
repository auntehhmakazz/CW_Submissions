/*
 * this is my wordle game, created on October 29,2024.
 */
import java.util.Scanner;

public class WordleGame {

static Scanner myReader = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// I declared my word as Saint
		String solution = new String ("saint");


		//this will call welcomeToGame method
		welcomeToGame();
		//i declared a string as playerGuess which is used in my possibleErrors. 
		//this will also help my code after 
		String playerGuess = possibleErrors();
		//this will call my guesssWord. In my guess word parameters I input playerGuess
		guesssWord(playerGuess,solution);
		//this will call my endGame. Which will finish the game. 
		//In my parameters I called both playerGuess and solution. 
		endGame(playerGuess,solution);
	
		myReader.close();
	

	
	
	
	}
/**
 * this method welcomeToGame.. this method will introduce the game and the rules. 
 */
	public static void welcomeToGame()
	{

		System.out.print("Welcome to Wordle. Please choose a word, it can only be 5 words and you may not duplicate letters."
						+ "if you duplicate letters the FBI will be at your Door Tomorrow :) ");
		//String userInput= new String(myReader.next());
		//String playerGuess = new String(myReader.next());
		//myReader.close();

	}
	
	/**
	 * this method possibleErrors.. this method will introduce all the possibilities of errors with the wordle
	 * such as duplicating letters and if the word is to short or to long
	 * @return possibleErrors
	 */
	public static String possibleErrors()
	{
		String playerGuess = new String (myReader.next());
		
		// letter is too long or too short
		if (playerGuess.length() != 5)
		{
			System.out.print("your word is too short or maybe to long... TRY AGAIN");
		}
		// Repeating letters
		else if (playerGuess.charAt(0) == playerGuess.charAt(1) || playerGuess.charAt(0) == playerGuess.charAt(2) || playerGuess.charAt(0) == playerGuess.charAt(3) || playerGuess.charAt(0) == playerGuess.charAt(4))
		{
			System.out.print("YOUR REPEATING LETTERS.... TRY AGAIN");
		}
		
		else if (playerGuess.charAt(1) == playerGuess.charAt(2) ||playerGuess.charAt(1) == playerGuess.charAt(3) || playerGuess.charAt(1) == playerGuess.charAt(4))
		{
			System.out.print("YOUR REPEATING LETTERS.... TRY AGAIN");
		}
		
		else if (playerGuess.charAt(2) == playerGuess.charAt(3) || playerGuess.charAt(2) == playerGuess.charAt(4))
		{
			System.out.print("YOUR REPEATING LETTERS.... TRY AGAIN");
		}
		
		else if(playerGuess.charAt(3) == playerGuess.charAt(4))
		{
			System.out.print("YOUR REPEATING LETTERS.... TRY AGAIN");
		}
		
		return playerGuess;
	}
		
	
	/**
	 * this method is guesssWord.. this method will help with predicting if the players guess is correct. 
	 * @param playerGuess
	 * @return guesssWord
	 */
	public static String guesssWord(String playerGuess)
	{
	//this is my first letter guess
		
		if (playerGuess.charAt(0) == solution.charAt(0) )
		{
			System.out.print(solution.charAt(0));
		}
		
		
		else if (playerGuess.charAt(0) == solution.charAt(1) || playerGuess.charAt(0) == solution.charAt(2) || playerGuess.charAt(0) == solution.charAt(3) || playerGuess.charAt(0) == solution.charAt(4))
		{
			System.out.print("?");
		}
	
		else 
		{
			System.out.print("X");
		}
		
		// second letter of correct word
		if (playerGuess.charAt(1) == solution.charAt(1))
		{
			System.out.print(solution.charAt(1));
		}
		
		else if (playerGuess.charAt(1) == solution.charAt(0) || playerGuess.charAt(1) == solution.charAt(2) || playerGuess.charAt(1) == solution.charAt(3) || playerGuess.charAt(1) == solution.charAt(4))
		{
			System.out.print("?");
		}
	
		else 
		{
			System.out.print("X");
		}
		
		//third letter of correct word
		if (playerGuess.charAt(2) == solution.charAt(2))
		{
			System.out.print(solution.charAt(2));
		}
		
		else if (playerGuess.charAt(2) == solution.charAt(0) || playerGuess.charAt(2) == solution.charAt(1) || playerGuess.charAt(2) == solution.charAt(3) || playerGuess.charAt(2) == solution.charAt(4))
		{
			System.out.print("?");
		}
		
		else 
		{
			System.out.print("X");
		}
		
		// this is my fourth letter
		if (playerGuess.charAt(3) == solution.charAt(3))
		{
			System.out.print("n");
		}
		
		else if (playerGuess.charAt(3) == solution.charAt(0) || playerGuess.charAt(3) == solution.charAt(1) || playerGuess.charAt(3) == solution.charAt(2) || playerGuess.charAt(3) == solution.charAt(4))
		{
			System.out.print("?");
		}
		
		else 
		{
			System.out.print("X");
		}
		// this is my last letter
		if (playerGuess.charAt(4) == solution.charAt(4))
		{
			System.out.print("t");
		}
		
		else if (playerGuess.charAt(4) == solution.charAt(0) || playerGuess.charAt(4) == solution.charAt(1) || playerGuess.charAt(4) == solution.charAt(2) || playerGuess.charAt(4) == solution.charAt(3))
		{
			System.out.print("?");
		}
		
		else 
		{
			System.out.print("X");
		}
			
		
		return playerGuess;
	
	}

	}

/**
 * this method is endGame.. this method is the ending of the game. 
 * in this method it will provide the answer if the player gets the word correctly or not		
 * @param playerGuess
 * @param solution
 */
	public static void endGame(String playerGuess, String solution)
	{
		if(playerGuess.equals(solution))
		{
			System.out.println("You've guessed it!!! Congratulations on completing the Wordle");
		}
		
		if(!playerGuess.equals(solution))
		{
			System.out.println("Incorrect word. The word was SAINT, thank you for playing wordle.");
		}
		
		
		
	}
	
	
	
}
	
	

