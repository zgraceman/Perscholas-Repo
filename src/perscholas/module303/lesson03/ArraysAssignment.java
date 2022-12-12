package perscholas.module303.lesson03;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysAssignment {

public static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Question 1:"); createArray(); // Question 1 
		System.out.println("\nQuestion 2:"); middleElementArray(); // Question 2 
		System.out.println("\nQuestion 3:"); stringArray(); // Question 3
		System.out.println("\nQuestion 4:"); integerArray(); // Question 4
		System.out.println("\nQuestion 5:"); loopControlVariableArray(); // Question 5
		System.out.println("\nQuestion 6:"); printValuesExceptMiddle(); // Question 6
		System.out.println("\nQuestion 7:"); swapElementsInArray(); // Question 7
		System.out.println("\nQuestion 8:"); sortAscendArray(); // Question 8
		System.out.println("\nQuestion 9:"); integerStringsDoubleArray(); // Question 9
		System.out.println("\nQuestion 10:"); userBelongingsArray(); // Question 10
		
	}
	
	// Question 1
	public static void createArray() {
		
		/* Write a program that creates an array of integers with a length of 3. 
		 * Assign the values 1, 2, and 3 to the indexes. Print out each array element.*/
		int[] array = new int[3];
		array[0] = 1;
		array[1] = 2;
		array[2] = 3;
		System.out.println(array[0] + " " + array[1] + " " + array[2]);
	}
	
	// Question 2
	public static void middleElementArray() {
		
		/* Write a program that returns the middle element in an array. 
		 * Give the following values to the integer array: {13, 5, 7, 68, 2} 
		 * and produce the following output: 7*/
		
		int[] array = {13, 5, 7, 68, 2};
		int middle = (array.length - 1)/2;
		System.out.println(array[middle]);
	}
	
	// Question 3 
	public static void stringArray() {
		
		/* Write a program that creates an array of String type 
		 * and initializes it with the strings “red”, “green”, “blue” and “yellow”. 
		 * Print out the array length. 
		 * Make a copy using the clone( ) method. 
		 * Use the Arrays.toString( ) method on the new array to verify that the original array was copied.*/
		
		String[] array = new String[]{"red", "green", "blue", "yellow"};
		System.out.println(array.length);
		System.out.println(Arrays.toString(array));
		String[] arrayCopy = array.clone();
		System.out.println(Arrays.toString(arrayCopy));
	}
	
	// Question 4
	public static void integerArray() {
		
		/* Write a program that creates an integer array with 5 elements (i.e., numbers). 
		 * The numbers can be any integers.  Print out the value at the first index and the last index using length - 1 as the index. 
		 * Now try printing the value at index = length ( e.g., myArray[myArray.length ] ). 
		 * Notice the type of exception which is produced. Now try to assign a value to the array index 5. 
		 * You should get the same type of exception.*/
		
		int[] array = {8, 3, 54, 8, 1};
		// Exception: System.out.println(array[array.length]);
		System.out.println(array[0] + ", " + array[array.length-1]);
		// Exception: array[5] = 17;
	}
	
	// Question 5
	public static void loopControlVariableArray() {
		
		/* Write a program where you create an integer array with a length of 5. 
		 * Loop through the array and assign the value of the loop control variable (e.g., i) to the corresponding index in the array.*/
		
		int[] array = new int[5];
		for (int i = 0; i < array.length; i++) {
			array[i] = i;
		}
		System.out.println(Arrays.toString(array));
	}
	
	// Question 6
	public static void printValuesExceptMiddle() {
		
		/* Write a program where you create an array of 5 elements. 
		 * Loop through the array and print the value of each element, 
		 * except for the middle (index 2) element.*/
		
		int[] array = new int[5];
		for (int i = 0; i < array.length; i++) {
			array[i] = i;
			if (i != array.length/2) {
				System.out.println(array[i]);
			}
		}
	}
	
	// Question 7
	public static void swapElementsInArray() {
		
		/* Write a program that creates a String array of 5 elements 
		 * and swaps the first element with the middle element without creating a new array.*/
		
		int temp;
		int[] array = new int[5];
		for (int i = 0; i < array.length; i++) {
			array[i] = i;
		}
		System.out.println(Arrays.toString(array));
		temp = array[0];
		array[0] = array[array.length/2];  // Assign value in middle element to first element
		array[(array.length)/2] = temp;
		System.out.println(Arrays.toString(array));

		
		
	}
	
	// Question 8
	public static void sortAscendArray() {
		
		/* Write a program to sort the following int array in ascending order: {4, 2, 9, 13, 1, 0}. 
		 * Print the array in ascending order, and print the smallest and the largest element of the array.*/

		int smallest, temp;
		int[] array = {4, 2, 9, 13, 1, 0,};
		smallest = array[0];
		int mid = array.length/2;
		int k = array[0];
		
		System.out.println("Before sort: " + Arrays.toString(array));
		
		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length; j++) {
				if (array[j] < smallest) {
					smallest = array[j];
					k = j;
				}
				//System.out.println(Arrays.toString(array));
			}
			temp = array[i];
			array[i] = smallest;
			array[k] = temp;
			smallest = Integer.MAX_VALUE;
		}
		
		System.out.println("After sort: " + Arrays.toString(array));
		System.out.println("Smallest: " + array[0] + " - Largest: " + array[array.length-1]);

		
	}
	
	// Question 9
	public static void integerStringsDoubleArray() {
		
		/* Create an array that includes an integer, 3 strings, and 1 double. Print the array.*/
		
		Object[] array = new Object[] {7, "red", "blue", "yellow", 19.99};
		System.out.println(Arrays.toString(array));
	}
	
	// Question 10
	public static void userBelongingsArray() {
		
		/* Write some Java code that asks the user how many favorite things they have. 
		 * Based on their answer, you should create a String array of the correct size. 
		 * Then ask the user to enter the things and store them in the array you created. 
		 * Finally, print out the contents of the array.*/
		
		System.out.println("How many favorite things do you have? Type an integer: ");
		int length = sc.nextInt();
		String[] things = new String[length];
		System.out.println("Please enter your favorite things.");
		for (int i = 0; i < things.length; i++) {
			System.out.println("Thing" + (i+1) + ": ");
			things[i] = sc.next();
		}
		System.out.println("Your favorite things are: " + Arrays.toString(things));
	}
	
}
