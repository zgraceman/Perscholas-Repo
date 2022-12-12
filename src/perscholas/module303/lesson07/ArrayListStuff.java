package perscholas.module303.lesson07;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListStuff {
	
	public static void main(String[] args) {
		//addStuff();
		//collectionToArrayList();
		//accessingElements();
		//removingElements();
		arrayListIterating();
	}
	
	public static void addStuff() {
		List<String> animals = new ArrayList<>();
		animals.add("Lion");
		animals.add("Walrus");
		animals.add("Goat");
		animals.add("Pig");
		System.out.println(animals);
		
		animals.add(2, "Elephant");
		System.out.println(animals);
	}
	
	public static void collectionToArrayList() {
		List<Integer> firstFourPrimeNumbers = new ArrayList<>();
		firstFourPrimeNumbers.add(2);
		firstFourPrimeNumbers.add(3);
		firstFourPrimeNumbers.add(5);
		firstFourPrimeNumbers.add(7);
		
		// ArrayList from anotherCollection
		List<Integer> firstEightPrimeNumbers = new ArrayList<>(firstFourPrimeNumbers);
		
		List<Integer> nextFourPrimeNumbers = new ArrayList<>();
		firstEightPrimeNumbers.add(11);
		firstEightPrimeNumbers.add(13);
		firstEightPrimeNumbers.add(17);
		firstEightPrimeNumbers.add(19);
		
		firstEightPrimeNumbers.addAll(nextFourPrimeNumbers);
		System.out.println(firstEightPrimeNumbers);
	}
	
	public static void accessingElements() {
		List<String> topCompanies = new ArrayList<>();
		System.out.println("Is the topCompanies list empty? : " + topCompanies.isEmpty());
		
		 topCompanies.add("Google");
	     topCompanies.add("Apple");
	     topCompanies.add("Microsoft");
	     topCompanies.add("Amazon");
	     topCompanies.add("Facebook");
	     System.out.println("\nHere are the top " + topCompanies.size() + " companies in the world");
	     System.out.println(topCompanies);
	     
	     String bestCompany = topCompanies.get(0);
	     String secondBestCompany = topCompanies.get(1);
	     String lastCompany = topCompanies.get(topCompanies.size() - 1);
	     System.out.println("\nBest Company: " + bestCompany);
	     System.out.println("Second Best Company: " + secondBestCompany);
	     System.out.println("Last Company in the list: " + lastCompany);

	     topCompanies.set(4, "Walmart");
	     System.out.println("\nModified top companies list: " + topCompanies);
	}
	
	public static void removingElements() {
		List<String> programmingLanguages = new ArrayList<>();
		programmingLanguages.add("C");
		programmingLanguages.add("C++");
		programmingLanguages.add("Java");
		programmingLanguages.add("Kotlin");
		programmingLanguages.add("Python");
		programmingLanguages.add("Perl");
		programmingLanguages.add("Ruby");
		System.out.println("Initial List: " + programmingLanguages);

        // Remove the element at index `5`
        programmingLanguages.remove(5);
        System.out.println("After remove(5): " + programmingLanguages);

        // Remove the first occurrence of the given element from the ArrayList
        // (The remove() method returns false if the element does not exist in the ArrayList)
        boolean isRemoved = programmingLanguages.remove("Kotlin");
        System.out.println("After remove(\"Kotlin\"): " + programmingLanguages);

        // Remove all the elements that exist in a given collection
        List<String> scriptingLanguages = new ArrayList<>();
        scriptingLanguages.add("Python");
        scriptingLanguages.add("Ruby");
        scriptingLanguages.add("Perl");

        programmingLanguages.removeAll(scriptingLanguages);
        System.out.println("After removeAll(scriptingLanguages): " + programmingLanguages);

        // Remove all elements from the ArrayList
        programmingLanguages.clear();
        System.out.println("After clear(): " + programmingLanguages);
	}
	
	public static void arrayListIterating() {
		List<String> tvShows = new ArrayList<>();
	     tvShows.add("Breaking Bad");
	     tvShows.add("Game Of Thrones");
	     tvShows.add("Friends");
	     tvShows.add("Prison break");
	     System.out.println("\n=== Iterate using an iterator() ===");
	     Iterator<String> tvShowIterator = tvShows.iterator();
	     while (tvShowIterator.hasNext()) {
	        String tvShow = tvShowIterator.next();
	        System.out.println(tvShow);
	     }

	System.out.println("==Iterate using an iterator() and forEachRemaining() method ===");
	     tvShowIterator = tvShows.iterator();
	     tvShowIterator.forEachRemaining(tvShow -> {
	        System.out.println(tvShow);
	     });


	     System.out.println("\n=== Iterate using simple for-each loop ===");
	     for(String tvShow: tvShows) {
	        System.out.println(tvShow);
	     }

	     System.out.println("\n=== Iterate using for loop with index ===");
	     for(int i = 0; i < tvShows.size(); i++) {
	        System.out.println(tvShows.get(i));
	     }
	     System.out.println("\n=== Iterate iterator ===");
	     ListIterator iterator = tvShows.listIterator();
	     System.out.println("Elements in forward direction");

	     System.out.println("\n====== Iterate using while loop=======");

	     while (iterator.hasNext())
	     {
	        System.out.println(iterator.next());
	     }

	     System.out.println("=========Elements in backward direction======");

	     while (iterator.hasPrevious())
	     {
	        System.out.println(iterator.previous());
	     }

	}

}
