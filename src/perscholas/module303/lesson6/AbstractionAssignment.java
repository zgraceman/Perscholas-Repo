// HackerRank Assignment

package perscholas.module303.lesson6;

import java.util.*;

abstract class Book{
	String title;
	abstract void setTitle(String s);
	String getTitle(){
		return title;
	}
}

class MyBook extends Book {
    String title;
    
    @Override
    void setTitle(String s) {
        title = s;
    }
    
    @Override
    String getTitle() {
        return title;
    }
}

public class AbstractionAssignment {
	public static void main(String[] args) {
			//Book new_novel=new Book(); This line prHMain.java:25: error: Book is abstract; cannot be instantiated
			Scanner sc=new Scanner(System.in);
			String title=sc.nextLine();
			MyBook new_novel=new MyBook();
			new_novel.setTitle(title);
			System.out.println("The title is: "+new_novel.getTitle());
	      	sc.close();
	}
}
