/**
 * this is my gameTile class
 */
public class MazeGameTile {
	
	boolean hasPlayer;
	boolean isRevealed;
	boolean isWall;

	//this class is created for the gametile
	public MazeGameTile(boolean hP, boolean isR, boolean isW)
	{
		//this is the boolean hasplayer 
		hasPlayer = hP;
		//this is the booelan isrevealed
		isRevealed = isR;
		//this is the boolean iswall
		isWall = isW;
	}
		
		
	//this is the hasplayer setter
	public void setHasPlayer(boolean newHP)
	{
		//the old hasPlayer changed into newHp
		hasPlayer = newHP;
	}
	
	//this is the isRevealed setter
	public void setIsRevealed(boolean newIsR)
	{
		//the old isRevealed changed into newHp
		isRevealed = newIsR;
	}
	
	//this is the iswall setter
	public void setIsWall(boolean newIsWall)
	{
		//the old isWall changed into isWall
		isWall = newIsWall;
	}
	
	//this is the hasplayer getter
	public boolean getHasPlayer()
	{
		//it will return hasplayer
		return hasPlayer;
	}
	
	//this is the isrevealed getter
	public boolean getIsRevealed()
	{
		//it will return isrevealed
		return isRevealed;
	}
	
	//this is the iswall getter
	public boolean getIsWall()
	{
		//it will return iswall
		return isWall;
	}
	
	
	//this is the functionality
	public String toString()
	{
		//if hasPlayer = true in the main class
		if(hasPlayer == true)
		{
			//it will return P.. to let the player know they are on that tile
			return " P ";
		}
		
		//if isRevealed = false in the main class
		if(isRevealed == false)
		{
			//it will return *.. to let the player know that there are tiles there
			return "*";	
		}
		
		//if the tile isRevealed = true
		else if(isRevealed == true)
		{
			//these if/else if statements will run
			//if isWall = true in the main class
			if(isWall == true)
			{
				//it will return W.. to let the player know that there is a wall there
				return " W ";
			}
			//if isWall = false in the main class
			else if(isWall == false)
			{
				//it will return X.. to let the player know that there is no Wall there
				return "X";
			}
		}
			
	return "A";
	}
}
