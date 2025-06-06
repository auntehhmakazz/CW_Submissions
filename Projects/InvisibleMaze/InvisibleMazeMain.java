import java.util.Scanner;

public class InvisibleMazeMain {
	
	static Scanner myReader = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MazeGameTile[][] maze = new MazeGameTile[5][5];
		
		maze[0][0] = new MazeGameTile(true,true, false);
		maze[0][1] = new MazeGameTile(false,false, false);
		maze[0][2] = new MazeGameTile(false,false, false);
		maze[0][3] = new MazeGameTile(false,false, true);
		maze[0][4] = new MazeGameTile(false,false, true);
		
		maze[1][0] = new MazeGameTile(false,false, true);
		maze[1][1] = new MazeGameTile(false,false, true);
		maze[1][2] = new MazeGameTile(false,false, false);
		maze[1][3] = new MazeGameTile(false,false, true);
		maze[1][4] = new MazeGameTile(false,false,true);
		
		maze[2][0] = new MazeGameTile(false,false,true);
		maze[2][1] = new MazeGameTile(false,false,true);
		maze[2][2] = new MazeGameTile(false,false,false);
		maze[2][3] = new MazeGameTile(false,false,false);
		maze[2][4] = new MazeGameTile(false,false,true);
		
		maze[3][0] = new MazeGameTile(false,false,true);
		maze[3][1] = new MazeGameTile(false,false,true);
		maze[3][2] = new MazeGameTile(false,false,true);
		maze[3][3] = new MazeGameTile(false,false,false);
		maze[3][4] = new MazeGameTile(false,false, true);
		
		maze[4][0] = new MazeGameTile(false,false,true);
		maze[4][1] = new MazeGameTile(false,false,true);
		maze[4][2] = new MazeGameTile(false,false,true);
		maze[4][3] = new MazeGameTile(false,false,false);
		maze[4][4] = new MazeGameTile(false,false,false);
		
		//this is the object that represents the player object.. creates the player
		InvisibleMazeCharacters player = new InvisibleMazeCharacters();
		//this prints a maze
		Maze(maze);
		//this prints out an introduction into the game.. and tells the player they can mvoe up,down, left or right
		System.out.println("welcome to invisbible maze! please choose which way you would like to go."
				+ "\n" +"You may move either right, left, up or down!");
		//this calls the moveonmaze method.. and the parameters will call the maze(MazeGameTile) and the player(InvisibleMazeCharacters)
		moveonMaze(maze,player);
		
		
	
	}
	//this prints out the grid
	public static void Maze(MazeGameTile[][] tempMaze)
	{
		//this for loop will run if i is less than the length of the tempMaze-1
		for(int i =0; i<=tempMaze.length-1; i++)
		{
			//this code inside will run when.. j is less than the first row of i's length
			for(int j=0; j<=tempMaze[0].length-1; j++)
			{
				//print statement will run and it will print out the row
				System.out.print(tempMaze[i][j]);
				//this will print out a comma to space out the code above
				System.out.print(", ");
			}
			//this will return
			System.out.println(" ");
		}
		//this will return
		System.out.println(" ");
		
	}
	
	


	//this class is basically all the commands for the player to move
	public static void moveonMaze(MazeGameTile[][] tempMaze, InvisibleMazeCharacters player)
	{
		//this will let the userinput
		String userInput=  myReader.next();
		
		/**
		 * BASICALLY BOTH RIGHT/LEFT ARE MOVING COLUMNS NOT ROWS... 
		 * SO THE ONLY THING THAT WILL BE ADDED OR MINUS WILL BE THE COLUMNS
		 */
		
		//if the user inputs "right"
		if(userInput.equals("right"))
		{
			//if the players column position is less than or equal to 4
			if(player.getcPos()<=4)
			{
				//then this code will run..
				//when the player inputs right this code will run and test if there is a wall and if its out of bounds then the code will run
				if(tempMaze[player.getrPos()][player.getcPos()+1].getIsWall() == true)
				{
					//this will run if the IF STATEMENT is correct
					//this will basically look at the tempMaze.. 
					//then the player well get the grids row/column position and reveal if it is true 
					tempMaze[player.getrPos()][player.getcPos()].setIsRevealed(true);
					//this print statement will let the player know if there is a wall there and will alert them that they cannot move
					System.out.println("there is a wall there.. You can't move!");
				}
				
				//this else if statement will check if there is not a wall.. and if there isn't than this code will run
				else if(tempMaze[player.getrPos()][player.getcPos()+1].getIsWall() == false)
				{
					//this line of code will leave the player in the same row and will move columns if not out of bounds.
					tempMaze[player.getrPos()][player.getcPos()+1].setIsRevealed(true);
					//this line of code will set the players position to false
					tempMaze[player.getrPos()][player.getcPos()].setHasPlayer(false);
					//this line of code will move the player forward to true
					tempMaze[player.getrPos()][player.getcPos()+1].setHasPlayer(true);
					//this basically moves 
					player.setC(player.getcPos()+1);
					//this will print out the statement.
					System.out.println("You have moved right one block");
				}
			}
			
		}
		
		//if the user inputs "left"
		else if(userInput.equals("left"))
		{
			//if the players column position is less than or equal to 0
			if(player.getcPos()<=0)
			{
				//then this code will run..
				//if there is a wall and if its out of bounds then the code will run
				if(tempMaze[player.getrPos()][player.getcPos()-1].getIsWall())
					{
						//this line of code will set the players position to true and will reveal a W (for WALL)
						tempMaze[player.getrPos()][player.getcPos()].setIsRevealed(true);
						//this print statement will be printed if the statements above can run
						System.out.println("there is a wall there.. You can't move!");
			
					}
				//this else if statement will check if there is not a wall.. and if there isn't than this code will run
				else if(!tempMaze[player.getrPos()][player.getcPos()-1].getIsWall())
					{
						//this line of code will leave the player in the same column/row and change the hasPlayer to false
						tempMaze[player.getrPos()][player.getcPos()].setHasPlayer(false);
						//this line of code will the players position
						player.setC(player.getcPos()-1);
						//this line of code will set the players new position to true
						tempMaze[player.getrPos()][player.getcPos()].setHasPlayer(true);
						//this print statement will be printed as long as the statement above can run
						System.out.println("you have moves left one block");
					
					}
			}
		}
				
		/**
		 * BASICALLY BOTH UP/DOWN ARE MOVING ROWS AND NOT COLUMNS... 
		 * SO THE ONLY THING THAT WILL BE ADDED OR MINUS WILL BE THE ROWS
		 */
		
		//if the user inputs "up"
		else if(userInput.equals("up"))
		{
			//if the players row position is less than or equal to 0
			if(player.getrPos()<=0)
			{
				//than this code will run..
				//if there is a wall and if its out of bounds then this code will run
				if(tempMaze[player.getcPos()-1][player.getrPos()].getIsWall() == true)
				{
					//this line of code will set the players column/row position to true
					tempMaze[player.getcPos()-1][player.getrPos()].setIsRevealed(true);
					//this print statement will be printed as long as the statements above are all true and will reveal a wall
					System.out.println("there is a wall there.. You can't move!");
				}
				//this else if statement will run if there is no wall there
				else if(tempMaze[player.getcPos()-1][player.getrPos()].getIsWall() == false)
				{
					//this line of code will set the players position to true
					tempMaze[player.getrPos()-1][player.getcPos()].setIsRevealed(true);
					//this line of code will sets the tile the player was on to false
					tempMaze[player.getcPos()][player.getrPos()].setHasPlayer(false);
					//this line of code will set the tile the player is on to true
					tempMaze[player.getcPos()-1][player.getrPos()].setHasPlayer(true);
					//this will change the players r position
					player.setR(player.getrPos()-1);
					//this will print that the player has moved
					System.out.println("you have moved up one block");
					
				}
			}
			
		}
		
		
		//if the user inputs "down"
		else if(userInput.equals("down"))
		{
			//this statement will run if the players row position is greater than 4
			if (player.getrPos() >= 4)
			{
				//if the player is out of bounds.. then this print statement will run
				System.out.println("Too far");
			}
			//this else statement will run after
			else 
			{
				//this will get the wall
				if(tempMaze[player.getrPos()+1][player.getcPos()].getIsWall())
				{
					//this will check if there is a wall
					tempMaze[player.getrPos()+1][player.getcPos()].setIsRevealed(true);
					//this code will print out that there is a wall
					System.out.println("there is a wall there.. You can't move!");
					
				}
				else 
				{
					//this will reveal the players position it was firstly on to true
					tempMaze[player.getrPos()+1][player.getcPos()].setIsRevealed(true);
					//the old position the player was on will change to false
					tempMaze[player.getrPos()][player.getcPos()].setHasPlayer(false);
					//this will change the new position to true
					tempMaze[player.getrPos()+1][player.getcPos()].setHasPlayer(true);
					//this will change the players position 
					player.setR(player.getrPos()+1);
					//this will print out that the player has moved one
					System.out.println("you have moved up one block");
				}
			
			}
		}
		//this prints the maze over and over
		Maze(tempMaze);
		
		//this will check if the player made it to the end goal
		if(player.getrPos() == 4 && player.getcPos() == 4)
		{
			//this will print that the player has won
			System.out.println("Congratulations.. YOU WON");
		}
		
		else
		{
			//this will go back to the beginning
			moveonMaze(tempMaze, player);
		}
	}
	
}

