package perscholas.module303.lesson8;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetStuff {
	
	public static void main(String[] args) {
		exampleOne(); // Iterate Through TreeSet
	}
	
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
}
