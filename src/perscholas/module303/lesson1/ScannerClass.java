package perscholas.module303.lesson1;

import java.util.Scanner;

public class ScannerClass {
	
	public static void main(String[] args) {
		stdinStdoutI();
		stdinStdoutII();
	}
	
	public static void stdinStdoutI() {
		Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
	}
	
	public static void stdinStdoutII() {
		Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        String s = scan.next();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
	}
	
}
