package abhishekkkkk;

import java.util.Scanner;//importing scanner class

public class book extends publication{//inheriting publication class
	Scanner s = new Scanner(System.in);
	private String author;
	double total_books;
	public String getAuthor() {//getting author name
        return author;
    }
    public void setAuthor(String Author) {//setting author name
        author = Author;
    }
    public void orderCopies(int p) {  	//function to order copies
       	setcopies(getcopies()+p);
    }
    public void sellcopies(int r) {//function to sell copies
    	setcopies(getcopies()-r);
    }
    public void sellCopy(double a) {
    	System.out.println("Total Book sales : "+a+"$");
    }
    book read() {                   
		book B=new book();
		B.Read();
		System.out.println("Enter the author of the book: ");
		B.setAuthor(s.nextLine());
		return B;	
	}
    public void disp() {//function to display
    	System.out.println("Author : "+getAuthor());
    }
}