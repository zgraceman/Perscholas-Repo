package perscholas.module303.lesson8;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetStuff {
	
	public static void main(String[] args) {
		//exampleOne(); // Iterate Through TreeSet
		//exampleTwo(); // Remove Elements
		exampleThree(); // Methods for Navigation
	}
	
	// Iterate Through ThreeSet
	public static void exampleOne() {
		TreeSet<Integer> numbers = new TreeSet<>();
		numbers.add(20);
		numbers.add(5);
		numbers.add(15);
		numbers.add(25);
		numbers.add(10);
		System.out.println(numbers);

		Iterator<Integer> iter_set = numbers.iterator();
		System.out.println("TreeSet using Iterator:");
		while(iter_set.hasNext()) {
			System.out.print(iter_set.next());
			System.out.print(", ");
		}
	}

	// Remove Elements
	public static void exampleTwo() {
		TreeSet<Integer> numbers = new TreeSet<>()	;
		numbers.add(2);
		numbers.add(5);
		numbers.add(6);
		System.out.println("TreeSet: " + numbers);
		
		boolean val1 = numbers.remove(5);
		System.out.println("Is 5 removed? " + val1);
		
		boolean val2 = numbers.removeAll(numbers);
	    System.out.println("Are all elements removed? " + val2);
	}
	
	// Methods for Navigation
	public static void exampleThree() {
		TreeSet<Integer> numbers = new TreeSet<>();
		numbers.add(2);
		numbers.add(5);
		numbers.add(6);
		System.out.println("TreeSet " + numbers);
		
		int first = numbers.first();
		System.out.println("First Number: " + first);
		
		int last = numbers.last();
		System.out.println("Last Number: " + last);
	}
}
