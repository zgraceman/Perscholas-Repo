package perscholas.module303.lesson8;

import java.util.Comparator;
import java.util.TreeSet;

class citiesComparator implements Comparator<String> {
	@Override
	public int compare(String citiesOne, String citiesTwo) {
		int value = citiesOne.compareTo(citiesTwo);
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

public class TreeSetSorting {
	
	public static void main(String[] args) {
		TreeSet<String> cities = new TreeSet<>(new citiesComparator());
		cities.add("UAE");
	    cities.add("Mumbai");
	    cities.add("NewYork");
	    cities.add("Hyderabad");
	    cities.add("Karachi");
	    cities.add("Xanadu");
	    cities.add("Lahore");
	    cities.add("Zagazig");
	    cities.add("Yingkou");
	    System.out.println("TreeSet: " + cities);
	}
}
