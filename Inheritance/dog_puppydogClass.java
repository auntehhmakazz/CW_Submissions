/**
*  THIS PUPPYDOG CLASS
*/
public class PuppyDog extends Dog{
	
	//protected means its private except in the subclass
	protected boolean isFed;
	
	// this is the Puppy dog class and attributes
	public PuppyDog(int a, String n, boolean ad, boolean f)
	{
		//DOG CLASS = SUPER.. it took the attributes from DOG Class
		super(a,n,ad);
		//is Fed equals f
		isFed = f;
	}
	///this is stateage
	public void stateAge()
	{
		//if state age is called this print statement will eb printed
		System.out.println(name + " is " + age + " years old.");
	}
	
	//this is feed puppy
	public void feedPuppy()
	{
		//if is fed is true then the puppy is fed
		isFed = true;
	}
	//this is increase age.. basically does the same thing it does in DOG class
	public void increaseAge()
	{
		super.increaseAge();
		//is fed is changed to false
		isFed = false;
	}
	
	//this is the tostring method
	public String toString()
	{
		//if isfed
		if(isFed)
		{
			//it will return the toString method in DOG class alongside a print statement
			return super.toString() + "I'm fed";
		}
		//if is notFed.. tostring method from DOG class will be printed alongside a print statement 
		return super.toString() + "I must be fed";
	}
	
	//this is equals class
	public boolean equals(PuppyDog lildoggy)
	{	
		//this if statemnt will do he same thing that has been done in the DOG class.. alongside with isFed
		if(super.equals(lildoggy) && this.isFed == lildoggy.isFed)
		{
			//will return true if everything above is correct
			return true;
		}
		//if the if statement does not run.. it will return false.
		return false;
	}
}

/**
*  THIS DOG CLASS
*/

//DOG CLASS = SUPER
public class Dog {
	
	//protected means its private exeept in the subclass
	protected int age;
	protected String name;
	protected boolean isAdopted;
	
	// this is the DOG class... 
	public Dog(int a, String name, boolean ad)
	{
		//age will equal a
		age = a;
		//makes it specific to the name
		this.name = name;
		//isAdopted = ad
		isAdopted = ad;
	}
	
	//this my boolean Adoption Status
	public boolean getAdoptionStatus()
	{
		//if getadoption is called it will return whatever isAdopted equals
		return isAdopted;
	}
	
	//this is stateage
	public void stateAge()
	{
		//if state age is called this print statement will eb printed
		System.out.println(name + " is " + age + " years old.");
	}
	//this is increase age
	public void increaseAge()
	{
		//if increase age is called then the previous age will be added by 1
		age++;
	}
	
	//this is toString method
	public String toString()
	{
		//it will take state age and reprint it in here
		stateAge();
		
		//if the dog is adopted
		if(isAdopted)
		{
			//this return statement will be printed
			return "YOU HAVE GAVE A DOG A FOREVER HOME!";
		}
		//if not
		else
		{
			//this return statement will be printed
			return "You have not gave a dog a forever home :(";
		}
	}
	
	//this is boolean equals method.. this will check if two dogs are the same
	public boolean equals(Dog doggy)
	{	
		//if any of the attributes matches the doggy's attributes
		if(this.age == doggy.age && this.name.equals(doggy.name)&& this.isAdopted == doggy.isAdopted)
		{
			//it will return true
			return true;
		}
		//if the two dogs aren't the same it will print false.
		return false;
	}
}


