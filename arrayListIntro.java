/**
 * this is my array list intro classwork. 
 * February 21,2025
 */

import java.util.ArrayList;
public class arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 1) Instantiate an empty ArrayList that could have any type in it.
	
		
		ArrayList colors = new ArrayList();
		
		
		
		
		// 2) Instantiate an empty ArrayList called intArrList that specifically stores ints. Repeat this for Strings.
		
		ArrayList<Integer> intArrList = new ArrayList<Integer>();
		ArrayList<String> stringArrList = new ArrayList<String>();
		
		
		
		
		// 3)  Add 1, 2, and 3 to your intArrList one at a time so that its values are {1, 2, 3}. Then add elements to stringArrList so its values are {"Alice , "Bob" , "Charlie"}
		
		//this declares that the first index will be 1
		intArrList.add(1);
		//this declares that the second index will be 2
		intArrList.add(2);
		//this declares that the third index will be 3
		intArrList.add(3);
		//the first index will be alice
		stringArrList.add("Alice");
		//the second index will be bob
		stringArrList.add("Bob");
		//third index will be charlie
		stringArrList.add("Charlie");
		
		
		//will print out the ints in the array list
		System.out.println(intArrList);
		//will print out the strings in the array list
		System.out.println(stringArrList);
		
		
		
		
		// 4) Add 5 to your intArrList so that its values are now {1, 2, 5, 3}. Then add "Derek" to your stringArrList so its values are {"Alice" , "Derek" , "Bob" , "Charlie"}
		
		//this code basically will add 5 in the in the second spot in the array
		intArrList.add(2, 5);
		// this code basically will add derek in the second spot
		stringArrList.add(1, "Derek");
		
		
		
		
		// 5) Print out the second and last elements in both intArrList and stringArrList.
		
		//this code basically will print out the second element in the array list
		System.out.println(intArrList.get(1));
		//this code will print the last element in the array list
		System.out.println(intArrList.get(intArrList.size()-1));
		
		// this code basically will print out the second element
		System.out.println(stringArrList.get(1));
		// this code will print out the last element in the array list
		System.out.println(stringArrList.get(stringArrList.size()-1));
		
		
		
		
		
		// 6) Change the first element in intArrList to 0, and change the first element in stringArrList to "Zero". Print out the first element in each array before and after the change. 

		//this will get the first element in the array list
		System.out.println(intArrList.get(0));
		//this will change that first element into something different
		intArrList.set(0, 0);
		//then after the code was changed I called the new code
		System.out.println(intArrList.get(0));
		
		// this will get the first element in the array list
		System.out.println(stringArrList.get(0));
		//this will change the fist element that was called... into somethign different
		stringArrList.set(0, "Zero");
		//then after the code was changed I called the new code
		System.out.println(stringArrList.get(0));
		
		// 7) Delete the last element in both arrays. Print out what that removed element was. 
		
		//this will call the last element and print it out
		System.out.println(intArrList.get(3));
		//this code will remove the last element that I have called
		intArrList.remove(3);
		//this will call the last element and print it out
		System.out.println(stringArrList.get(3));
		//this will remove the last element that I have called
		stringArrList.remove(3);
		
		
	}

}
