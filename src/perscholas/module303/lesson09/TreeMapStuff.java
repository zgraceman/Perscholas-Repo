package perscholas.module303.lesson09;

import java.util.Comparator;
import java.util.TreeMap;

class CustomComparator implements Comparator<String> {
	
	@Override
	public int compare(String number1, String number2) {
		int value = number1.compareTo(number2);
		if (value > 0) {
			return -1;
		}
		else if (value < 0) {
			return 1;
		}
		else {
			return 0;
		}
	}
}


public class TreeMapStuff {
	
	public static void main(String[] args) {
		//exampleOne();
		//exampleTwo();
		exampleThree();
	}
	
	public static void exampleOne() {
		TreeMap<String, Integer> numbers = new TreeMap<>();
		numbers.put("One", 1);
		numbers.put("Two", 2);
		numbers.put("Three", 3);
		System.out.println("TreeMap: " + numbers);
		
		int value = numbers.remove("Two");
		System.out.println("Removed value: " + value);
		
		boolean result = numbers.remove("Three", 3);
		System.out.println("Is the entry {Three=3} removed? " + result);
		System.out.println("Updated TreeMap: " + numbers);
	}
	
	public static void exampleTwo() {
		TreeMap<String, Integer> numbers = new TreeMap<>();
		numbers.put("First", 1);
		numbers.put("Second", 2);
		numbers.put("Third", 3);
		System.out.println("TreeMap: " + numbers);
		
		String firstKey = numbers.firstKey();
		System.out.println("First Key: " + firstKey);
		
		String lastKey = numbers.lastKey();
		System.out.println("Last Key: " + lastKey);
		
		System.out.println("First Entry: " + numbers.firstEntry());
		System.out.println("Last Entry: " + numbers.lastEntry());
	}
	
	public static void exampleThree() {
		TreeMap<String, Integer> numbers = new TreeMap<>(new CustomComparator());
		numbers.put("First", 1);
		numbers.put("Second", 2);
		numbers.put("Third", 3);
		numbers.put("Fourth", 4);
		System.out.println("TreeMap: " + numbers);
	}
}
