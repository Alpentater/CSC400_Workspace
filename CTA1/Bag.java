package cta1;

import java.util.ArrayList;

//The 'Bag' class.
public class Bag<T> {
	//Class variables that are needed. (The list of data)
	ArrayList<T> items;
	
	//This is the constructor for the bag class.
	public Bag() {
		items = new ArrayList<>();
	}
	
	//This function adds an item to the list within the bag class.
	public void add(T item) {
		items.add(item);
	}
	
	//This function removes an item to the list within the bag class.
	public void remove(T item) {
		items.remove(item);
	}
	
	//This function checks to see if something is within the list in the bag class.
	public Boolean contains(T item) {
		return items.contains(item);
	}
	
	//This function goes through and counts the occurrences of items in the bag.
	public int count(T item) {
		//Essentially for looping through the list and counting how many times that same item is found.
		int result = 0;
		for(int i = 0; i < items.size(); i++) {
			if(items.get(i) == item) {
				result++;
			}
		}
		return result;
	}
	
	//This function will return all items in a string format.
	public String printList() {
		String toPrint = "";
		//For looping through the list and adding each item + a new line at the end.
		for(int i = 0; i < items.size(); i++) {
			toPrint += items.get(i).toString() + '\n';
		}
		return toPrint;
	}
	
	//Main entry point for testing the program.
	public static void main(String[] args) {
		
		//Creating a bag of type integer.
		Bag<Integer> myBag = new Bag<>();
		
		//Filling up the bag with some numbers.
		//Notice the integer '1' is the only one I have put in twice... this is to test the count function.
		myBag.add(1);
		myBag.add(2);
		myBag.add(12);
		myBag.add(22);
		myBag.add(69);
		myBag.add(40);
		myBag.add(12);
		myBag.add(420);
		myBag.add(1);
		myBag.add(11);
		myBag.add(9);
		myBag.add(1337);
		
		//Printing the bag contents.
		System.out.println(myBag.printList());
		
		//Checking if the bag contains the number '22'.
		System.out.println("Does bag contain 22? " + myBag.contains(22).toString());
	
		//Testing the count method by counting the number of ones. (Should be 2)
		System.out.println("Occurances of 1 in bag: " + myBag.count(1));
		
		//Removing a 22 and a 1 from the bag.
		myBag.remove(22);
		myBag.remove(1);
		
		//Testing the inclusion of 22 again after removing. (Should not be false)
		System.out.println("Does bag contain 22? " + myBag.contains(22).toString());
				
		//Testing the count of ones again, to see it decreased. (Should now be 1)
		System.out.println("Occurances of 1 in bag: " + myBag.count(1));
		
		//Printing the contents again after removing the 22 and 1.
		System.out.println(myBag.printList());
	}
}
