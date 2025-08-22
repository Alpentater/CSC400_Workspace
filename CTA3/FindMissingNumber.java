public class FindMissingNumber {
	//This function will return an int that is the number missing from the sequential numbers.
	public static int missingNumber(int[] numberPool){

		//Finding the length of the array passed into this function.
		int arrayLength = numberPool.length;

		//Go through each number in the array and add it up.
		int arraySum = 0;
		for(int i = 0; i < numberPool.length; i++){
			arraySum += numberPool[i];
		}

		//Assuming all the numbers in the array were sequential, this is what the sum WOULD be.
		int sequentialSum = (arrayLength+1)*(arrayLength+2)/2;

		//The missing number would be the expected sum if they were all sequential subtracted by the ACTUAL arrays sum.
		int missingNumber = sequentialSum - arraySum;

		//Returning that missing number we found.
		return missingNumber;
	}

	//This is the main entry point, the main function.
	public static void main (String[] args){
		//Making an example array based on the example provided from the assignment.
		int[] numbers = {3, 6, 5, 1, 4}; 

		//Printing that missing number to the console log. (Should print 2.)
		System.out.println("Missing Number: " + missingNumber(numbers));

		//For testing purposes, I made my own array. (Missing 5).
		int[] secondArray = {1, 2, 4, 3, 6};

		//Printing that missing number to the console log. (Should print 5.)
		System.out.println("Missing Number: " + missingNumber(secondArray));
	}
}