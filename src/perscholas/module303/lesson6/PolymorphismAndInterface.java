package perscholas.module303.lesson6;

interface LibraryUserI {
	
	int age = 0;
	String bookType = "";
	
	void registerAccount();
	void requestBook();
}

class AdultUser implements LibraryUserI {

	public int age;
	public String bookType;

	public AdultUser(int age, String bookType) {
		super();
		this.age = age;
		this.bookType = bookType;
	}
	
	@Override
	public void registerAccount() {
		if (age >= 12) {
			System.out.println("You have successfully registered under an Adult Account.");
		}
		else {
			System.out.println("Sorry, Age must be greater than 12 to register as an adult.");
		}
	}

	@Override
	public void requestBook() {
		if (bookType.equals("Fiction")) {
			System.out.println("Book issued successfully, please return the book within 7 days.");
		}
		else {
			System.out.println("Oops, you are allowedto take only adult Fiction books.");
		}
	}
}

class KidUser implements LibraryUserI {
	
	public int age;
	public String bookType;

	public KidUser(int age, String bookType) {
		super();
		this.age = age;
		this.bookType = bookType;
	}

	@Override
	public void registerAccount() {
		if (age <= 11) {
			System.out.println("You have successfully registered under a Kids Account.");
		}
		else {
			System.out.println("Sorry, Age must be less than 12 to register as a kid.");
		}
	}

	@Override
	public void requestBook() {
		if (bookType.equals("Kids")) {
			System.out.println("Book issued successfully, please return the book within 10 days.");
		}
		else {
			System.out.println("Oops, you are allowed to take only kids books.");
		}
			
	}
}

// LibraryInterfaceDemo
public class PolymorphismAndInterface {
	
	public static void main(String[] args) {
		
		// Test case 1
		KidUser kid1 = new KidUser(10, "Kids");
		System.out.println("Test case 1, Kid 1:");
		kid1.registerAccount();
		kid1.requestBook();
		
		KidUser kid2 = new KidUser(18, "Fiction");
		System.out.println("\nKid 2:");
		kid2.registerAccount();
		kid2.requestBook();
		
		// Test case 2
		AdultUser adult1 = new AdultUser(5, "Kids");
		System.out.println("Test case 2, Adult 1:");
		adult1.registerAccount();
		adult1.requestBook();
		
		AdultUser adult2 = new AdultUser(23, "Fiction");
		System.out.println("\nAdult 2:");
		adult2.registerAccount();
		adult2.requestBook();
	}
}
