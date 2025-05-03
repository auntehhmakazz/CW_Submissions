//handle creation of puppies
public class adoption_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//this is my dog object
		Dog treasure = new Dog (13, "Treasure", false);
		//this is my puppyobject
		PuppyDog star = new PuppyDog(2, "Star", false, false);
		
		//these are my two new identical dog objects
		Dog c = new Dog(3, "Zayne", false);
		Dog z = new Dog(3, "Zayne", false);
		
		//this is a print statement calling my dog TREASURE and it will print out all of my dog's attributes
		System.out.println(treasure.getAdoptionStatus());
		//this will call treasure/stateAge and then when it calls stateAge it will print out treasures name/age.
		treasure.stateAge();
		//this is a print statement calling my puppy star and it will print out all of my dog's attributes
		System.out.println(star.getAdoptionStatus());
		//this will call stars/stateAge and then when it calls stateAge it will print out stars name/age.
		star.stateAge();
		
		//this will add one onto treasures age
		treasure.increaseAge();
		//this will add one onto stars age
		star.increaseAge();
		//this will take the above code where treasures age is increased by one.. and re print her new one
		treasure.stateAge();
		//this will take the above code where stars age is increased by one.. and re print her new one.
		star.stateAge();
		//this will call treasure's toString method.. to see if we did it correctly
		treasure.toString();
		//illustrates the use of the toString method
		System.out.println(treasure);
		System.out.println(star);
		//checks whether they are the same dog or not
		System.out.println(c.equals(z));
	
	}

}
