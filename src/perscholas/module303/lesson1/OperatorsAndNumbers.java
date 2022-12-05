package perscholas.module303.lesson1;

public class OperatorsAndNumbers {

	// Method for Question 1
	public static void intToBinary() {

		/*
		 * Write the following integers in binary notation. Do not use any Java
		 * functions or online conversion applications to calculate the answer, as this
		 * will hinder the learning process and your understanding of the concept.
		 * However, you may check your answers using Java methods.
		 */

		int[] vals = { 1, 8, 33, 78, 787, 33987 };

		/* Answers
		 * 1 1000 100001 1001110 1100010011 1000010011000011
		 */

		// Checking Answers
		for (int val : vals) {
			System.out.println("Integer value: " + val + " - Binary: " + Integer.toBinaryString(val));
		}
	}

	// Question 2
	public static void binaryToDecimal() {

		/*
		 * Convert the following binary numbers to decimal notation. Do not use any Java
		 * functions or online conversion applications to calculate the answer, as this
		 * will hinder the learning process and your understanding of the concept.
		 * However, you may check your answers using Java methods.
		 */

		String[] vals = { "0010", "1001", "00110100", "01110010", "001000011111", "0010110001100111" };

		// Checking Answers
		for (String val : vals) {
			System.out.println("Binary Value: " + val + " - Decimal: " + Integer.parseInt(val, 2));
		}
	}

	// Question 3
	public static void leftShiftOperator() {

		/*
		 * Write a program that declares an integer a variable x and assigns the value 2
		 * to it and prints out the binary string version of the number (
		 * Integer.toBinaryString(x) ). Now, use the left shift operator (<<) to shift
		 * by 1 and assign the result to x. Before printing the results, write a comment
		 * with the predicted decimal value and binary string. Now, print out x in
		 * decimal form and in binary notation.
		 */

		int[] vals = { 2, 9, 17, 88 };

		for (int val : vals) {
			System.out.println(Integer.toBinaryString(val));
			int ans = val << 1;
			// 4? (first iteration)
			System.out.println("Decimal: " + ans);
			System.out.println("Binary: " + Integer.toBinaryString(ans) + "\n");
		}
	}

	// Question 4
	public static void rightShiftOperator() {
		
		/* Write a program that declares a variable x 
		 * and assigns 150 to it, and prints out the binary string version of the number. 
		 * Now use the right shift operator (>>) to shift by 2 and assign the result to x. 
		 * Write a comment indicating what you anticipate the decimal and binary values to be. 
		 * Now print the value of x and the binary string.*/
		
		int[] vals = {150, 225, 1555, 32456};
		
		for (int val : vals) {
			System.out.println(Integer.toBinaryString(val));
			int ans = val >> 2;
			System.out.println("Decimal: " + ans);
			System.out.println("Binary: " + Integer.toBinaryString(ans) + "\n");
		}
	}

	// Question 5
	public static void bitwiseOperators() {
		
		/* Write a program that declares three int variables x, y, and z. Assign 7 to x and 17 to y. 
		 * Write a comment that indicates what you predict will be the result of the bitwise & operation on x and y. 
		 * Now use the bitwise & operator to derive the decimal and binary values and assign the result to z.*/
		
		int x = 7;
		int y = 17;
		int z = x & y;
		
		// result z = 24?
		System.out.println("Decimal: " + z);
		System.out.println("Binary: " + Integer.toBinaryString(z));
	}

	// Question 6
	public static void postfixIncrementOperator() {
		/* Write a program that declares an integer variable, assigns a number, 
		 * and uses a postfix increment operator to increase the value. 
		 * Print the value before and after the increment operator.*/
		
		int x = 11;
		System.out.println(x);
		x++;
		System.out.println(x);
	}

	// Question 7
	public static void incrementByOne() {
		/* Write a program that demonstrates at least 3 ways to increment a variable by 1 
		 * and does this multiple times. 
		 * Assign a value to an integer variable, print it, increment by 1,
		 * print it again, increment by 1, and then print it again.*/
		int x = 10;
		System.out.println(x);
		x++;
		System.out.println(x);
		x=x+1;
		System.out.println(x);
		x+=1;
		System.out.println(x);
	}

	// Question 8
	public static void sumIncrementPostfix() {

		/* Write a program that declares 2 integer variables, x, and y, and then assigns 5 to x and 8 to y. 
		 * Create another variable sum and assign the value of ++x added to y, and print the result. 
		 * Notice the value of the sum (should be 14). Now change the increment operator to postfix (x++) and re-run the program. 
		 * Notice what the value of the sum is. 
		 * The first configuration incremented x and then calculated the sum, 
		 * while the second configuration calculated the sum and then incremented x.*/
		
		int x = 5, y = 8;
		int sum = x++ + y;
		System.out.println(sum);
		
	}

	public static void main(String[] args) {

		// System.out.println("Question 1:"); intToBinary(); // Question 1 
		// System.out.println("\nQuestion 2:"); binaryToDecimal(); // Question 2 
		// System.out.println("\nQuestion 3:"); leftShiftOperator(); // Question 3
		// System.out.println("\nQuestion 4:"); rightShiftOperator(); // Question 4
		// System.out.println("\nQuestion 5:"); bitwiseOperators(); // Question 5
		// System.out.println("\nQuestion 6:"); postfixIncrementOperator(); // Question 6
		// System.out.println("\nQuestion 7:"); incrementByOne(); // Question 7
		System.out.println("\nQuestion 8:"); sumIncrementPostfix(); // Question 8

		
	}
}
