/*
 * this is my Create My Own Game.
 * My game is an Adventure game. In my game the player gets to choose their gender, character and what path they would like to take.
 */
import java.util.Scanner;
public class AdventureGame {
	
	static Scanner myReader = new Scanner(System.in);
	static Characters player = new Characters("Alfred", 45, 4.9);
public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	

	welcomeToGame();
	characterChoice();
	storyPlotOne();
	storyPlotOneChoice();
	System.out.println();
	storyEnding();
	
	myReader.close();
	
	}

/**
 * this method is my welcome to game.
 */
public static void welcomeToGame()
{
	System.out.println("Welcome to Jungle Adventure."
			+ " This game is based on you answering question that will lead you to find the treasure at then end."
			+ "\n"+"You may go through many crazy incidents. You may die or you may live!"
			+ " \n" +"ALTHOUGH.... you don't know what will happen!");
}

/**
 * this method lets the character choose whether the character wants to be a male or female. 
 * it will then also list the character attributes
 * @param x
 * @param r
 */
public static void characterChoice()
{

	//Characters alice1 = new Characters("alice", 35, 5.4);
	//Characters alfred1 = new Characters("alfred", 45, 4.9);
	System.out.println("");
	//This will print out and ask the user if they want to be female or male
	System.out.println("please choose a gender, female or male?");
	String userInput=  new String(myReader.nextLine());
	
	//lets the user input female
	if (userInput.equals("female"))
	{
		//lists all the attributes.
		player.setName("Alice");
		player.setAge(35);
		player.setHeight(5.3);
		
	}
	//lets the user input male
	else if (userInput.equals("male"))
	{
		//lists all the attributes
		player.setName("Alfred");
		player.setAge(45);
		player.setHeight(4.9);
		
	}
	// will print it out
	System.out.println("Your name is "+player.getName()+ "\n"+ "Your age is " +player.getAge() +"\n" + "Your height is "+player.getHeight());
	
}
/**
 * this is the first plot and asks the user questions.
 * this method is mostly made up of strings.
 */	
public static void storyPlotOne()
{
	System.out.println("");
	System.out.println("You were at work and then fell asleep. When you wake up, you see you are stranded on an island."
			+ "\n" +"You don't know how you got there. You are currently on the beach. "
			+ "\n" +"You notice that there is a path that can lead you into the jungle. ");
	System.out.println("Do you want to travel into the jungle or do you want to stay on the beach? ");
	System.out.println("please input jungle or beach.");
	
}

/**
 * this method lets the user input there answer for the previous questions.
 */
public static void  storyPlotOneChoice() 
{
	String h = "beach";
	String r = "jungle";
	String userInput = new String(myReader.nextLine());
	
	System.out.println("");
	
	
//this codes lets the user input h (which is beach).. then the IF statement will be printed. 
	if(userInput.equals(h))	
	{
		System.out.println("Staying on the beach, you see a little boat. You wave to the boat, you notice that it starts to come in."
				+ "\n"+"You were able to jump in the boat. When the boat is a couple miles off shore, you start to belive that you are free."
				+ "\n"+"Then you notice that there is a hole in the bow of the boat. The boat starts to sink and water starts to come in."
				+ "\n"+" the boat starts to sink. You are left in the ocean floating on a log. "
				+"\n "+"Would you like to swim in or stay floating");
// everything about the beach will be in this method.
		carryOnStoryPlotChoiceBeach();
		
	}
	

//this codes lets the user input r (which is jungle).. then the IF statement will be printed.
	else if (userInput.equals(r))
	{
		System.out.println("As you start to walk on the path in the jungle. The trees are swaying and you hear a noise coming from behind you."
				+ "\n"+ "You turn back to see there is nothing behind you and trees blocking the way out and the only way to move is forward."
				+ "\n"+ "You come to a pond, you sit down and drink some water. You didn't know thought but the water makes you sleepy."
				+ "\n"+ "You fall asleep, you wake up to there being no pond in front of you and only trees there. "
				+"\n"+ "You see a cave towards your right and a another path leading further into the jungle on your left."
				+ "\n"+ "Would you like to travel further into the jungle or go into the cave?");
		//everything about the jungle will be in this method
		carryOnStoryPlotChoiceJungle();
	}

}

/**
 * this method has all the answers for the beach. 
 */
public static void carryOnStoryPlotChoiceBeach()
{
	String t = "swim in";
	String w = "stay floating";

	String userInput = new String(myReader.nextLine());
	
	System.out.println("");
// if the user inputs swim in.. then this if statement will run.
	if (userInput.equals(t))
		{
		 
			System.out.println("As your trying to swim in, the wind and the waves start to pick up."
					+"\n"+"You fight so hard to make in to shore. Then all of a sudden and huge tidal waves comes out of nowhere."
					+ "\n"+"You are fighting so hard to fight to live but you just couldn't find air to breathe...");
			
			System.out.println("");
			System.out.println("GAME OVER.. THANK YOU FOR PLAYING");

		}
// if the user inputs stay floating.. then this if statement will run.
	else if(userInput.equals(w))
		{
			
			System.out.println("You are still floating out on the water."
					+ "\n"+"All of a sudden you feel something tickling your leg."
					+ "\n"+"Next thing you get dragged in the water. You try to fight and wiggle your way out but you just can't"
					+ "\n"+"You fight so hard but then you gave up and accepted fate... ");
			System.out.println("");
			System.out.println("GAME OVER.. THANK YOU FOR PLAYING");

		}
	
	
}

/**
 * this method has all the answers for the jungle. 
 */
public static void carryOnStoryPlotChoiceJungle()
{
	String q = "jungle";
	String r = "cave";
	
	String userInput = new String(myReader.nextLine());
	
	System.out.println();
	
//if the user inputs cave.. then this if statment will run.
	if(userInput.equals(r))
	{
		System.out.println("you turn right, and travel into the cave. As you are walking further into the cave. You accidently nugde something with your feet and notice a flash light on the ground."
				+ "\n"+ "You come to think there might've been another human on this island. You pick up the flashlight and try to see if it works. It does and you jump with rejoice."
				+ "\n"+ "When you walk through the cave, bats start flying everywhere revealing a body on the ground, totally gone. You are totally spooked and try to run back out."
				+ "\n"+ "When you make it to where you came in from you notice there is no opening. Before you turn around accepting fate, you get knocked out."
				+ "\n"+ "Waking up from being knocked out. You're stuck in a giant web. You think you are alone and so you start to try and wiggle out of the web."
				+ "\n"+ "Low and behold, a giant spider lands onto the web. You stark to freak out. You try to untangle your hands but you can't. The spider got closer."
				+ "\n"+ "It keeps coming and coming. Then when it close enough it kills you... ");
		System.out.println("");
		System.out.println("GAME OVER.. THANK YOU FOR PLAYING");
	}
	
// if the user inputs jungle.. then this if statement will run.
	else if(userInput.equals(q))
	{
		System.out.println("");
		System.out.println("Waking up after getting hit in the head. You can't remember anything about you.");
		storyJungleWithCharacters();
		System.out.println("Turning away from the cave. You decided to travel further into the jungle. As you are walking into the jungle, you notice it starts getting dark."
				+"\n" +"Not having a place to stay in, you build a treehouse. As you are starting to climb, a branch starts to fall down and lands on your head and knocks you out."
				+"\n" +"You notice your not in the same spot instead there is a path towards your right and left. "
				+"\n" +"The path on the right leads back to the pond where there is water while on the left path there is a little cottage."
				+"\n" +"Would you like to go to the left or the right?");
		storyPlotEnding();
	}
	
}

/**
 * this method is another character method. It changes the original character selection to a new one.
 */
public static void storyJungleWithCharacters()
{
	System.out.println("");
	System.out.println("please choose a gender again, female or male?");
	String userInput=  new String(myReader.nextLine());
//lists all female attributes
	if (userInput.equals("female"))
	{
		
		player.setName("Stephanie");
		player.setAge(19);
		player.setHeight(5.10);
		
	}
//lists all male attributes
	else if (userInput.equals("male"))
	{
		player.setName("Harold");
		player.setAge(25);
		player.setHeight(6.4);
		
	}
	
//will print it out
	System.out.println("Your name is "+player.getName()+ "\n"+ "Your age is " +player.getAge() +"\n" + "Your height is "+player.getHeight());
	
	
}

/**
 * this is the ending
 */
public static void storyPlotEnding()
{
// cottage
	String h = "left";
// pond
	String w = "right";
	String userInput=  new String(myReader.nextLine());
// this just adds a break between the strings
	System.out.println();
//if the user inputs left.. then this if statment will run.
	if(userInput.equals(h))
	{
		System.out.println("You began walking to the cottage, when you near the cottage. You ae hesitant on entering but you proceed to.  "
				+"\n" +"When entering you notice that it lights up and there is table. Upon the table there is a phone with a number in it."
				+"\n" +"Hesitantly, you call the number. On teh other side, you hear voices and you ask them help."
				+"\n" +"When you exit the cottage, you see that you can see the ocean and you head towards it and looking into the distant, you see a boat coming in."
				+"\n" +"When it reaches shore, you jump in and you are free.");
		System.out.println("CONGRATULATIONS.. YOU WON.");
	}
// if the user inputs right.. then this if statment will run.
	if(userInput.equals(w))
	{
		System.out.println("Taking the path on the right. You start to notice that the pond isn't getting closer. You continue to walk but it keeps getting farther."
				+ "\n" +"You start to think that it will never end. You try to turn back but you can't. You look down and notice that you are stuck in this green substance."
				+ "\n" +"You start to sink. Next thing you know its up to your neck and you accept fate...");
		System.out.println();
		System.out.println("GAME OVER!");
	}
}	

// the ending.
public static void storyEnding()
{
	System.out.println("thank you for playing.");
}

