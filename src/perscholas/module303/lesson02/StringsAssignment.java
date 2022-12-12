package perscholas.module303.lesson02;

import java.io.*;
import java.util.*;


public class StringsAssignment {
	
	public static void main(String[] args) {
		stringReverse();
		stringIntroduction();
		stringTokens();
		stringComparisons();
		substrings();	
	}
	
	public static void stringReverse() {
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        
        String reverse = new StringBuilder(A).reverse().toString();
        if (A.compareTo(reverse) == 0) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
	}
	
	public static void stringIntroduction() {
		Scanner sc=new Scanner(System.in);
		String A=sc.next();
		String B=sc.next();
    
		System.out.println(A.length() + B.length()); // part 1
		if (A.compareTo(B) > B.compareTo(A)) {System.out.println("Yes");} // part 2
		else {System.out.println("No");} // part 2
		System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1) + " " + B.substring(0, 1).toUpperCase() + B.substring(1)); // part 3
    }
	
	public static void stringTokens() {
		Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s = s.trim();
        if (s.length()==0) {System.out.println(0); return;}
        String[] tokens = s.split("[^a-zA-Z]+");
        System.out.println(tokens.length);
        for (int i=0; i < tokens.length; i++) {
            System.out.println(tokens[i]);
        }
        
        scan.close();
	}
	
	public static void stringComparisons() {
		Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
        
		String smallest = s.substring(s.length()-k);
        String largest = s.substring(0, k);
        
        for(int i = 0; i <= s.length() - k; i++){
            String s2 = s.substring(i, k + i);
            if (smallest.compareTo(s2) > 0){
                smallest = s2;
            }
            if (largest.compareTo(s2) < 0){
                largest = s2;
            }
        }
        
        System.out.println(smallest + "\n" + largest);
	}
	
	public static void substrings() {
		Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        System.out.println(S.substring(start, end));
	}


}
