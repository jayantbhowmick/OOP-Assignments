package abhishekkkkk;
import java.util.*;
public class magazine extends publication{//inheriting publication class
	Scanner sc=new Scanner(System.in); 
	private String currissue;
	private int orderQty;
	double total_mag;
	int b;
	public void recNewIssue(String p) {
		setcopies(orderQty);
		currissue=p;
	}
	public void orderCopies(int p) {  //function to order copies	
	     setcopies(getcopies()+p);
	}
	public void sellcopies(int r) {//function to sell copies
    	setcopies(getcopies()-r);
    }
	public void sellCopy(double a) {//function to sell a copy
    	System.out.println("Total Magazine sell : "+a+"$");	
	}
	magazine read() {                //reading from user   
		magazine M=new magazine();
		M.Read();		
		return M;
	}
}