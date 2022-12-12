package perscholas.module303.lesson08;

import java.util.HashSet;

public class HashSetStuff {

	public static void main(String[] args) {
		exampleOne();  // Inserts elements to HashSet using addAll()
		exampleTwo();  // Union of Sets
		exampleThree();  // Difference of Sets
		exampleFour(); // Enhanced for() Loop
	}
	
	// Inserts elements to HashSet using addAll()
	public static void exampleOne() {
		HashSet<Integer> evenNumbers = new HashSet<>();
		evenNumbers.add(2);
		evenNumbers.add(4);
		evenNumbers.add(6);
		System.out.println("HashSet: " + evenNumbers);
		
		HashSet<Integer> numbers = new HashSet<>();
		numbers.addAll(evenNumbers);
		numbers.add(5);
		System.out.println("New HashSet: " + numbers);
	}
	
	// Union of Sets
	public static void exampleTwo() {
		HashSet<Integer> evenNumbers = new HashSet<>();
		evenNumbers.add(2);
		evenNumbers.add(4);
		System.out.println("HashSet1: " + evenNumbers);
		
		HashSet<Integer> numbers = new HashSet<>();
		evenNumbers.add(1);
		evenNumbers.add(3);
		System.out.println("HashSet2: " + evenNumbers);
		
		numbers.addAll(evenNumbers);
		System.out.println("Union is: " + numbers);
	}
	
	// Difference of Sets
	public static void exampleThree() {
		HashSet<Integer> primeNumbers = new HashSet<>();
        primeNumbers.add(2);
        primeNumbers.add(3);
        primeNumbers.add(5);
        System.out.println("HashSet1: " + primeNumbers);
        
        HashSet<Integer> oddNumbers = new HashSet<>();
        oddNumbers.add(1);
        oddNumbers.add(3);
        oddNumbers.add(5);
        System.out.println("HashSet2: " + oddNumbers);
        
        primeNumbers.removeAll(oddNumbers);
        System.out.println("Difference : " + primeNumbers);
	}
	
	public static void exampleFour() {
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("Apple");
		hashSet.add("Mango");
		hashSet.add("Grapes");
		hashSet.add("Orange");
		hashSet.add("Fig");
		
		// Addion of duplicate elements
		hashSet.add("Apple");
		hashSet.add("Mango");
		
		// Addition of null values
		for (String str : hashSet) {
			System.out.println(" ---> " + str);
		}
	}
}
