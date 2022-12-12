/*
 * LAB - 303.8.1 - LinkedList Processing
 * Using build-in methods with Linked Lists
 * @zgraceman 
 */
package perscholas.module303.lesson08;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListProcessing {
	
	public static void main(String[] args) {
		LinkedListMethods();
		LinkedListSorting();
	}
	
	public static void LinkedListMethods() {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Item1");
		list.add("Item4");
		list.add("Item3");
		list.add("Item5");
		list.add("Item2");
		System.out.println("Linked List Contents: " + list);
		
		list.addFirst("First Item");
		list.addLast("Last Item");
		System.out.println("Contents after additions: " + list);
		
		System.out.println(list.get(0));
		list.set(0, "Changed first item");
		System.out.println("First element after update by set method: " + list.get(0));
		
		list.removeFirst();
		list.removeLast();
		System.out.println("List after deletion of first and last element: " + list);
		
		list.add(0, "Newly added element");
		list.remove(2);
		System.out.println("Final Contents: " + list);
	}
	
	public static void LinkedListSorting() {
		LinkedList<String> list = new LinkedList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		System.out.println("Contents Unsorted: " + list);
		
		Collections.sort(list);
		System.out.println("Sorted: " + list);
		
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("Sorted in Reverse: " + list);
		

		
	}
}
