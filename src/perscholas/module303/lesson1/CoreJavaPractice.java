package perscholas.module303.lesson1;

public class CoreJavaPractice {

	// Program 1
	public static int addInts(int a, int b) {
		return a + b;
	}
	
	// Program 2
	public static double addDoubles(double a, double b) {
		return a + b;
	}
	
	// Program 3 & 7
	public static double addIntDouble(int a, double b) {
		// Variable type double must be the sum
		return a + b;
	}
	
	// Program 4
	public static int divideInts(int a, int b) {
		if (a >= b) {
			return a/b;
		} 
		else {
			return b/a;
		}
	}
	
	// Program 5
	public static double divideDoubles(double a, double b) {
		if (a >= b) {
			return a/b;
		} 
		else {
			return b/a;
		}
	}
		
	public static void main(String[] args) {
		
		// Program 1
		System.out.println(CoreJavaPractice.addInts(2, 5));  
		
		// Program 2
		System.out.println(CoreJavaPractice.addDoubles(2.50, 6.25)); 
		
		// Program 3
		System.out.println(CoreJavaPractice.addIntDouble(2, 19.25));  
		
		// Program 4a
		System.out.println(CoreJavaPractice.divideInts(4, 12));  
		// Program 4b
		// Following code causes error. First 12.50 is not an integer. 
		// System.out.println(JavaBasicsClass.divideInts(12.50, 4));  
		
		// Program 5
		System.out.println((int)CoreJavaPractice.divideDoubles(45.60, 3.25));
		
		// Program 6
		double q = CoreJavaPractice.divideInts(5, 6);
		System.out.println(q);
		double y = 6;
		q = y;
		System.out.println(q);

		// Program 7
		final int seven = 7;
		System.out.println(CoreJavaPractice.addIntDouble(seven, 19.25));
		
		// Program 8
		System.out.println("\nProgram 8, Cafe Register.");
		double coffee = 4.25;
		double cappuccino = 5.00;
		double espresso = 2.50;
		double subtotal = ((coffee*3)+(cappuccino*4)+(espresso*2));
		final double SALES_TAX = 0.07;
		double totalSale = (subtotal+(subtotal*SALES_TAX));
		System.out.println("Subtotal: $" + subtotal);
		System.out.println("Total Sale: $" + String.format("%.2f", totalSale));
	}

}
