/**
 * this is my tic-tac-to project 
 */
import java.util.Scanner;
public class tic_tac_toProject {
	
	static boolean check = false;
	static Scanner myReader = new Scanner(System.in);
	static String[][] gridNums = new String[3][3];

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//this is the introduction to tic-tac-to 
		System.out.println("welcome to tic-tac-to! Um so you should know the rules already for tic-tac-to."
				+ " But if you don't, the objective is to get either X's or O's in a row. Either Vertical or Horizontal.  "
				+ "\n" +"This is the grid for Tic-Tac-To");
		System.out.println();
		
		//this will print out my method makeTable this will print out the grid to help the player choose where to put an X or O
		makeTable();
			
		//this while loop will run when check equals false
			while(check == false)
			{
				//this method will print out the 2D Array and all the possiblitys of where to put an X or O
				gameStart(ticTacToGrid(gridNums));
				//this method will print out my 2D array grid for tic-tac-to.. the grid is 3 rows and 3 columns
				ticTacToGrid(gridNums);
				//this is the end of the game
				endGame();
				
			}
		
	}
	

public static String[][] ticTacToGrid(String[][] gridNums2)
	  {
		//this for loop will run if i is less than the length of the gridNums2
		for(int i =0; i<gridNums2.length; i++)
		{
			//this code inside will run when.. j is less than the first row of i's length
			for(int j=0; j<gridNums2[i].length; j++)
			{
				//print statement will run and it will print out the row
				System.out.print(gridNums2[i][j]);
				//this will print out a comma to space out the code above
				System.out.print(", ");
			}
			//this will return
			System.out.println(" ");
		}
		//this will return
	 	System.out.println(" ");
	 	//this will return the gridNums
		return gridNums2;
		
	}
	 
	
public static void makeTable()
{
	//this will print out tic-tac-to table and what the player could pick
	System.out.println("Please Choose a letter to put an X or O.. "
			+ "\n"+"Capital = X and Lowercase = O"
			+"\n"+"  A  |  B  |  C  \n-----------------\n  "
			+ "D  |  E  |  F  \n-----------------\n  "
			+ "G  |  H  |  I   ");
	System.out.println();
}
	
	
	public static String[][] gameStart(String[][] gridNums2)
	{
		//this will let the userInput what they want
		String userInput=  new String(myReader.nextLine());
		
		//A
		//if the userinputs a capital A
		if(userInput.equals("A"))
		{
			//it will print an x
			gridNums[0][0] = "X";
		}
		//if the userinput a lowercase a
		else if(userInput.equals("a"))
		{
			//it will print a O
			gridNums[0][0] = "O";
		}
		
		
		//B
		//if the userinputs a capital B
		if(userInput.equals("B"))
		{
			//it will print an x
			gridNums[0][1] = "X";
		}
		//if the userinput a lowercase b
		else if(userInput.equals("b"))
		{
			//it will print a O
			gridNums[0][1] = "O";
		}
		
		
		//C
		//if the userinputs a capital C
		if(userInput.equals("C"))
		{
			//it will print an x
			gridNums[0][2] = "X";
		}
		//if the userinput a lowercase c
		else if(userInput.equals("c"))
		{
			//it will print a O
			gridNums[0][2] = "O";
		}
		
		
		//D
		//if the userinputs a capital D
		if(userInput.equals("D"))
		{
			//it will print an x
			gridNums[1][0] = "X";
		}
		//if the userinput a lowercase d
		else if(userInput.equals("d"))
		{
			//it will print a O
			gridNums[1][0] = "O";
		}
		
		
		//E
		//if the userinputs a capital E
		if(userInput.equals("E"))
		{
			//it will print an x
			gridNums[1][1] = "X";
		}
		//if the userinput a lowercase e
		else if(userInput.equals("e"))
		{
			//it will print a O
			gridNums[1][1] = "O";
		}
		
		
		//F
		//if the userinputs a capital F
		if(userInput.equals("F"))
		{
			//it will print an x
			gridNums[1][2] = "X";
		}
		//if the userinput a lowercase f
		else if(userInput.equals("f"))
		{
			//it will print a O
			gridNums[1][2] = "O";
		}
		
		
		//G
		//if the userinputs a capital G
		if(userInput.equals("G"))
		{
			//it will print an x
			gridNums[2][0] = "X";
		}
		//if the userinput a lowercase g
		else if(userInput.equals("g"))
		{
			//it will print a O
			gridNums[2][0] = "O";
		}
		
		
		//H
		//if the userinputs a capital H
		if(userInput.equals("H"))
		{
			//it will print an x
			gridNums[2][1] = "X";
		}
		//if the userinput a lowercase h
		else if(userInput.equals("h"))
		{
			//it will print a O
			gridNums[2][1] = "O";
		}
		
		
		//I
		//if the userinputs a capital I
		if(userInput.equals("I"))
		{
			//it will print an x
			gridNums[2][2] = "X";
		}
		//if the userinput a lowercase i
		else if(userInput.equals("i"))
		{
			//it will print a O
			gridNums[2][2] = "O";
		}
		//this will print out the method after the player puts in a letter
		makeTable();
		return gridNums;
	}

	public static String[][] endGame()
	{
		
		//Row
		//this checks if X's or O's are all in the same row
		if(gridNums[0][0] == gridNums[0][1] && gridNums[0][2] == gridNums[0][1] && (gridNums[0][1] == "X" || gridNums[0][1] == "O"))
		{
			//if checks equal to true than it will run
			check = true;
			//this will print out the congratulations and ends the game
			System.out.println("Congratulations!! You won TicTacTo.. 5 BIG BOOMS FOR YOU.. BOOM..BOOM..BOOM..BOOM..BOOM");
		}
		//this checks if X's or O's are all in the same row
		if(gridNums[1][0]==gridNums[1][1] && gridNums[1][2] == gridNums[1][1] && (gridNums[1][0] == "X"|| gridNums[1][0] == "O"))
		{
			//if checks equal to true than it will run
			check = true;
			//this will print out the congratulations and ends the game
			System.out.println("Congratulations!! You won TicTacTo.. 5 BIG BOOMS FOR YOU.. BOOM..BOOM..BOOM..BOOM..BOOM");
		}
		//this checks if X's or O's are all in the same row
		if(gridNums[2][0]==gridNums[2][1] && gridNums[2][2]==gridNums[2][1] && (gridNums[2][0] == "X"|| gridNums[2][0] == "O"))
		{
			//if checks equal to true than it will run
			check = true;
			//this will print out the congratulations and ends the game
			System.out.println("Congratulations!! You won TicTacTo.. 5 BIG BOOMS FOR YOU.. BOOM..BOOM..BOOM..BOOM..BOOM");
		}
		
		//Column
		//this checks if X's or O's are all in the same column
		if(gridNums[0][0] == gridNums[1][0] && gridNums[2][0] == gridNums[1][0] && (gridNums[0][0] == "X"|| gridNums[0][0] == "O"))
		{
			//if checks equal to true than it will run
			check = true;
			//this will print out the congratulations and ends the game
			System.out.println("Congratulations!! You won TicTacTo.. 5 BIG BOOMS FOR YOU.. BOOM..BOOM..BOOM..BOOM..BOOM");
		}
		//this checks if X's or O's are all in the same column
		if(gridNums[0][1] == gridNums[1][1] && gridNums[2][1] == gridNums[1][1] && (gridNums[0][1] == "X"|| gridNums[1][0] == "O"))
		{
			//if checks equal to true than it will run
			check = true;
			//this will print out the congratulations and ends the game
			System.out.println("Congratulations!! You won TicTacTo.. 5 BIG BOOMS FOR YOU.. BOOM..BOOM..BOOM..BOOM..BOOM");
		}
		//this checks if X's or O's are all in the same column
		if(gridNums[0][2] == gridNums[1][2] && gridNums[2][2] == gridNums[1][2] && (gridNums[1][1] == "X") && (gridNums[1][1] == "X"|| gridNums[1][1] == "O"))
		{
			//if checks equal to true than it will run
			check = true;
			//this will print out the congratulations and ends the game
			System.out.println("Congratulations!! You won TicTacTo.. 5 BIG BOOMS FOR YOU.. BOOM..BOOM..BOOM..BOOM..BOOM");
		}
		//this will return the gridNums
		return gridNums;
	}
	
}
