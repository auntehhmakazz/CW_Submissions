/**
 * this class is my character class.
 */
public class Characters 
{
	
	private String name;
	private int age;
	private double height;
	private boolean male;
	private boolean female;
	
	// this is the character class
	public Characters(String n, int a, double h)
	{
		name = n;
		age = a;
		height = h;
	}
	// this will get the name
	public String getName()
	{
		return name;
	}
	//this will get the age
	public int getAge()
	{
		return age;
	}
	// this will get the height
	public double getHeight()
	{
		return height;
	}
	
	// this sets the game
	public void setName(String n)
	{
		name = n;
	}
	// this sets the age
	public void setAge(int a)
	{
		age = a;
	}
	// this sets the height
	public void setHeight(double h)
	{
		height = h;
	}
	
	/**
	 * 		System.out.println("You picked Female.. You'll be playing as Alice." 
				+ " Alice stands about 5'6, she is smart and very athletic."
				+ " Strengths: fast, sharp, resourceful. She is a trained mountain climber."
				+ " Weakness: endurace isn't the best, scared of lizards and afraid of confrontation.");
	 */
	
	/**
	 * System.out.println("You picked Male.. You'll be playing as Alfred."
				+ " Alfred stands about 4'9, he is quiet but is very smart."
				+ " Strengths: strategic, intellectual, kind. He is a trained opera singer"
				+ " Weakness: stamina, has mild depression, and scared of spiders and afraid of dark");
	 * 
	 */
}
