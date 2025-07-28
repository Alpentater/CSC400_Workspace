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
	
	//========BELOW THIS COMMENT ARE FUNCITONS ADDED FOR THE MODULE 2 CTA.==========
	//This function returns the size of a bag in integer.
	public int size(){
		return items.size();
	}

	//This function will return a combination of the two lists.
	public ArrayList<T> merge(ArrayList<T> bagOne, ArrayList<T> bagTwo){
		ArrayList<T> newList = new ArrayList<T>();
		newList.addAll(bagOne);
		newList.addAll(bagTwo);
		return newList;
	}

	//This function returns all distinct elements in a list.
	public ArrayList<T> distinct(ArrayList<T> originalList){
		ArrayList<T> newList = new ArrayList<T>();
		//This for loop goes through and adds each item into the list starting from the 0th slot...
		//...it checks if the one being added is already in the list before adding.
		for(int i = 0; i < originalList.size(); i++){
			//If the new list does NOT contain what is trying to be added from original list...
			if(!newList.contains(originalList(i))){
				//... then add it to the new list.
				newList.add(originalList(i));
			}
		}
		return newList;
	}

	//Main entry point for testing the program.
	public static void main(String[] args) {
		
		//Creating two bags of type integer.
		Bag<Integer> myBagOne = new Bag<>();
		Bag<Integer> myBagTwo = new Bag<>();

		//Filling up bag one with some numbers.
		myBagOne.add(1);
		myBagOne.add(2);
		myBagOne.add(3);
		myBagOne.add(3);
		myBagOne.add(4);
		myBagOne.add(5);

		//Filling up bag two with some numbers.
		myBagTwo.add(0);
		myBagTwo.add(3);
		myBagTwo.add(6);
		
		//Printing the size of both bags.
		System.out.println("Size of bag 1: " + myBagOne.size());
		System.out.println("Size of bag 2: " + myBagTwo.size());
		//STUCK HERE
		//Creating a new list that will become the two merged lists... and then merging them.
		ArrayList<T> mergedList = merge(myBagOne, myBagTwo);

		//Printing the merged list.
		System.out.println(mergedList.printList());

		
	}
}
