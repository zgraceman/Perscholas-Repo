package perscholas.module303.lesson09;

import java.util.HashMap;

public class HashMapStuff {
	
	public static void main(String[] args) {
		exampleOne();
		exampleTwo();
	}
	
	public static void exampleOne() {
		HashMap<Integer, String> languages = new HashMap<>();
		languages.put(1, "Java");
		languages.put(2, "Python");
		languages.put(3, "JavaScript");
		languages.put(4, "C Sharp");
		System.out.println("HashMap: " + languages);
		
		String value = languages.remove(2);
		System.out.println("Removed value: " + value);
		System.out.println("Updated Hashap: " + languages);
	}
	
	public static void exampleTwo() {
		HashMap<String, String> newHashMap = new HashMap<>();
		newHashMap.put("Key1", "Lenovo");
		newHashMap.put("Key2", "Motorola");
		newHashMap.put("Key3", "Nokia");
		newHashMap.put("Key4", null);
		newHashMap.put(null, "Sony");
		System.out.println("Oringinal map contains: " + newHashMap);
		System.out.println("Size of original map: " + newHashMap.size());
		
		HashMap<String, String> copyHashMap = new HashMap<>();
		copyHashMap.putAll(newHashMap);
		System.out.println("copyHashMap mappings: " + copyHashMap);
		
		String nullKeyValue = copyHashMap.remove(null);
		System.out.println("copyHashMap null key value: " + nullKeyValue);
		System.out.println("copyHashMap after removing null key: " + copyHashMap);
		System.out.println("Size of copyHashMap: " + copyHashMap.size());
	}
}
