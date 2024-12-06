	/**
	 * This method is not static. What does this mean about how the method works? After code tracing, also answer
   	 * the following question: what does this method do?
	 *this means that the method will not rely on an object. 
  	*this method will return the index (first appearance) of the char in the string and the char (return the number) in which the letter was there.
	 */
	public int doesSomething(char c)
	{
		/*
		 * This line below works even though str was not instantiated in the method.
		 * What conclusion can you draw from this fact?
		 *  its a data attribute. 
		 * 
		 * 
		 * 
		 * */

		int l = str.length();
		
		/*
		 * Why might executing the loop below result in a syntax error?
		 * it might
		 * there is a syntax error because the code can't check the char if the index doesn't appear.
		 * 
		 */
		for (int i = 0; i <= l; i++)
		{
			
			/*
			 * What is this line checking for? What does it return if it is true?
			 * this line is checking for the first appearence of the letter that we choose. 
			 * if it is true it returns the i. 
			 */
			if (str.charAt(i) == c)
			{
				return i;
			}
			
		}
		/*
		 * What is the purpose of this line below? 
		 * Think about what needs to happen for it to be reached. 
		 * The purpose of this line below is just to help the code return.
		 * 
		 */
		return -1;
		
	}
