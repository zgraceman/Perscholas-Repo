package perscholas.module303.lesson09;

import java.util.Map;
import java.util.TreeMap;

class PhoneDirectoryWithTreeMap {
	
	// Fields
	private TreeMap<String, String> data;
	
	// Constructors
	public PhoneDirectoryWithTreeMap() {
		this.data = new TreeMap<String, String>();
	}

	// Getters & Setters
	public String getNumber(String name) {
	    return this.data.get(name);
	}
	
	public void putNumber(String name, String number) {
		if (name == null || number == null) {
			throw new IllegalArgumentException("Name nor Number cannot be null");
		}
		this.data.put(name,  number);
	}
	
	// Print contents
	public void print() {
		for (Map.Entry<String, String> entry : this.data.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}

	}
}

public class PhoneDirectory {
	
	public static void main(String[] args) {
		PhoneDirectoryWithTreeMap directory = new PhoneDirectoryWithTreeMap();
	    System.out.println("This program creates a PhoneDirectoryWithTreeMap and");
	    System.out.println("adds several entries.  It then prints the contents of");
	    System.out.println("directory and does a few lookups.");
	    System.out.println();
	    directory.putNumber("Fred","555-1234");
	    directory.putNumber("Barney","555-2345");
	    directory.putNumber("Wilma","555-3456");
        directory.putNumber("Wilma","555-3456");
	    directory.putNumber("Wilma","555-2563");
	    // directory.putNumber("James",null);
	    // directory.putNumber(null,"555-2853");

	    System.out.println("Contents are:");
	    System.out.println();
	    directory.print();
	    System.out.println();
	    System.out.println("Number for Fred is " + directory.getNumber("Fred"));
	    System.out.println("Number for Wilma is " + directory.getNumber("Wilma"));
	    System.out.println("Number for Tom is " + directory.getNumber("Tom"));
	    System.out.println("Number for Tom is " + directory.getNumber("Alex"));
	    // The output from the last line should be null
	}
}
