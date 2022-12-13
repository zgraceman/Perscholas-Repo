package perscholas.module303.lesson10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

class Course {  // Example Two
	
	// Fields
	private String code, courseName, instructorName;
	
	// Constuctors
	public Course() {}
	
	public Course(String code, String courseName, String instructorName) {
		this.code = code;
		this.courseName = courseName;
		this.instructorName = instructorName;
	}
	
	// Getters & Setters
	public String getCode() {
	    return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public String getInstructorName() {
		return instructorName;
	}
	
	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}
}

public class DelimitedFileReading {

	public static void main(String[] args) throws FileNotFoundException {
		exampleOne();
		exampleTwo();
	}
	
	public static void exampleOne() {
		
		try {
			File file = new File("C:\\Users\\zachg\\Documents\\cars.csv");
			Scanner input = new Scanner(file);
			ArrayList<String[]> data = new ArrayList<String[]>();
			
			while (input.hasNextLine()) {
				String Line = input.nextLine();
				String[] splitedLine = Line.split(",");
				data.add(splitedLine);
			}
			
			for (String[] line : data) {
				System.out.println("Car Name: " + line[0]);
				System.out.println("MPG: " + line[1]);
				System.out.println("Cylinder: " + line[2] );
                System.out.println("Displacement: " + line[3]);
                System.out.println("Horsepower: " + line[4]);
                System.out.println("Weight: " + line[5]);
                System.out.println("Acceleration: " + line[6]);
                System.out.println("Model: " + line[7]);
                System.out.println("Origin: " + line[8]);
                System.out.println("===============================");
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found! ");
			e.printStackTrace();
		}
	}
	
	public static void exampleTwo() {
		
		try {
			String location = "C:\\Users\\zachg\\Documents\\CourseData.csv";
			File file = new File(location);
			Scanner input = new Scanner(file);
			ArrayList<Course> data = new ArrayList<Course>();
			
			while(input.hasNextLine()) {
				String Line = input.nextLine();
				String[] splitedLine = Line.split(",");
				Course CourseObj = new Course();
				CourseObj.setCode(splitedLine[0]);
				CourseObj.setCourseName(splitedLine[1]);
				CourseObj.setInstructorName(splitedLine[2]);
				data.add(CourseObj);
			}
			
			for (Course c : data) {
				System.out.println(c.getCode() + " | " + c.getCourseName() + " | " + c.getInstructorName());
				System.out.println("==========================================");
			}
			
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found! ");
			e.printStackTrace();
		}
	}
}










