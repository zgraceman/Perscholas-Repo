package perscholas.module303.lesson10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStreams {
	
	public static void main(String[] args) throws IOException {
		//exampleOne();
		//exampleTwo();
		//exampleThree();
		//exampleFour();
		//exampleFive();
		//exampleSix();
		//exampleSeven();
		//exampleEight();
		//exampleNine();
		//exampleTen();
		//exampleEleven();
		//exampleTwelve();
		//exampleThirteen();
		exampleFourteen();
	}
	
	public static void exampleOne() {
		// 1. Integer Stream
		IntStream
			.range(1, 10)  // Intermediate Operation
			.forEach(System.out::print);  // Terminal Opertion
		System.out.println();
	}
	
	public static void exampleTwo() {
		// 2. Integer Stream with skip
		IntStream
			.range(1, 10)  // Intemediate
			.skip(5)  // Intermediate
			.forEach(x -> System.out.println(x));  // Terminal
		System.out.println();
	}
	
	public static void exampleThree() {
		// 2. Integer Stream with sum
		System.out.println(
		IntStream
			.range(1, 6)  // Intemediate
			.sum());  // Terminal
		System.out.println();
	}
	
	public static void exampleFour() {
		// 4. Stream.of, sorted and findFirst
		Stream.of("Ava", "Aneri", "Alberto")
			.sorted()  // Intermediate
			.findFirst()  // Intermediate
			.ifPresent(System.out::println);  // Terminal
	}
	
	public static void exampleFive() {
		// 5. Stream from Array, sort, filter and print
		String[] names = {"Al", "Ankit", "Kushal", "Brent", "Sarika", "amanda", "Hans", "Shivika", "Savini"};
		Arrays.stream(names)  // same as Strem.of(names)
			.filter(x -> x.startsWith("S"))  // Intermediate
			.sorted()  // Intermediate
			.forEach(System.out::println);  // Terminal
	}
	
	public static void exampleSix() {
		// 6. Average of squares of an int array
		Arrays.stream(new int[] {2, 4, 6, 8, 10})
			.map(x -> x * x)
			.average().ifPresent(System.out::println);
	}
	
	public static void exampleSeven() {
		// 7. Stream from List, filter and print
		List<String> people = Arrays.asList("Al", "Ankit", "Kushal", "Brent", "Sarika", "amanda", "Hans", "Shivika", "Savini");
				people.stream()  // Intermediate
				.map(String::toLowerCase)  // Intermediate
				.filter(x -> x.startsWith("a"))  // Intermediate
				.forEach(System.out::println);  // Terminal
	}
	
	public static void exampleEight() throws IOException {
		
		// 8. Stream rows from text file, sort, filter, and print
		Stream<String> bands = Files.lines(Paths.get("C:\\Users\\zachg\\Documents\\bands.txt"));
		bands
			.sorted()  // Intermediate
			.filter(x -> x.length() > 13)  // Intermediate
			.forEach(System.out::println);  // Terminal
		bands.close();
	}
	
	public static void exampleNine() throws IOException {
		
		// 9. Stream rows from text file and saves to List
		List<String> bands2 = Files.lines(Paths.get("C:\\Users\\zachg\\Documents\\bands.txt"))
			.filter(x -> x.contains("jit"))
			.collect(Collectors.toList());
		bands2.forEach(x -> System.out.println(x));
	}
	
	public static void exampleTen() throws IOException {
		// 10. Stream rows from CSV file and count
		Stream<String> rows1 = Files.lines(Paths.get("C:\\Users\\zachg\\Documents\\data.txt"));
		int rowCount = (int)rows1
			.map(x -> x.split(","))
			.filter(x -> x.length == 3)
			.count();
		System.out.println(rowCount + " rows.");
		rows1.close();
	}
	
	public static void exampleEleven() throws IOException {
		
		// 11. Stream rows from CSV file, parse data from rows
		Stream<String> rows2 = Files.lines(Paths.get("C:\\Users\\zachg\\Documents\\data.txt"));
		rows2.map(x -> x.split(",")).filter(x -> x.length == 3).filter(x -> Integer.parseInt(x[1]) > 15)
			.forEach(x -> System.out.println(x[0] + "  " + x[1] + "  " + x[2]));
		rows2.close();
	}
	
	public static void exampleTwelve() throws IOException {
		
		// 12. Stream rows from CSV file, store fields in HashMap
		Stream<String> rows3 = Files.lines(Paths.get("C:\\Users\\zachg\\Documents\\data.txt"));
		Map<String, Integer> map = new HashMap<>();
		map = rows3.map(x -> x.split(","))
				.filter(x -> x.length == 3)
				.filter(x -> Integer.parseInt(x[1]) > 15)
				.collect(Collectors.toMap(x -> x[0], x -> Integer.parseInt(x[1])));
		rows3.close();
		for (String key : map.keySet()) {
			System.out.println(key + "  " + map.get(key));
		}
	}	
	
	public static void exampleThirteen(){
		
		// 13. Reduction - sum
		double total = Stream.of(7.3, 1.5, 4.8).reduce(0.0, (Double a, Double b) -> a + b);
		System.out.println("Total = " + total);
	}
	
	public static void exampleFourteen() {
		
		// 14. Reudciton - summary statistics
		IntSummaryStatistics summary = IntStream.of(7, 2, 19, 88, 73, 4, 10).summaryStatistics();
		System.out.println(summary);
	}
}
