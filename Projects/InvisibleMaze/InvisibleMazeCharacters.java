/**
 * this is my character class for my Invisible Maze game
 */
public class InvisibleMazeCharacters {
	
	int rPos;
	int cPos;

	public InvisibleMazeCharacters()
	{
		//this sets the rPos to 0
		rPos = 0;
		//this sets the cPos to 0
		cPos = 0;
	}
	
	//this is a position getter
	public int[] getPos()
	{
		//this position will automatically put both the rPos and cpos together
		int[] pos = {rPos,cPos};
		//this will return the pos
		return pos;
	}
	
	//this is the row setter
	public void setR(int newR)
	{
		//the original row position is changed to a newR
		rPos = newR;
	}

	//this is the column setter
	public void setC(int newC)
	{
		//the original column position is changed to a newC
		cPos = newC;
	}
	
	//this is the row getter
	public int getrPos()
	{
		//it will return the row position
		return rPos;
	}
	
	//this is the column getter
	public int getcPos()
	{
		//it will return the colum position
		return cPos;
	}
}
