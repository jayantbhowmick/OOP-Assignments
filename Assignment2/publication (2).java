package abhishekkkkk;

import java.util.Scanner;

public class publication {//publication class
	private String title;
    private double price;
    private int copies;
    public String getTitle() {//getting title
        return title;
    }
    public void setTitle(String Title) {//setting title
        title = Title;
    }
    public void setPrice(double Price) {//setting price
    	int flag=0;
        if (Price > 0) {
            price = Price;
        } 
        else {
            System.out.println("Invalid price");
        }
    }
    public double getPrice() {//getting price
        return price;
    }
    public void setcopies(int a) {//setting copies
    	copies=a;
    }
    public int getcopies() {//getting copies
    	return copies;
    }
    public void sellCopy(double a, double b) {//selling a copy
    	System.out.println("Total Publication sell : "+a+b+"$");    	
    }
    public void Read() {		//read data from user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the title : ");
		setTitle(sc.nextLine());		
		System.out.println("Enter the price : ");
		setPrice(sc.nextDouble());
		System.out.println("Enter no of copies : ");
		setcopies(sc.nextInt());
	}
	public void display() {        //display details      
		System.out.println("Title: "+getTitle());		
		System.out.println("Price: "+getPrice());
		System.out.println("Copies available : "+getcopies());
	}
}