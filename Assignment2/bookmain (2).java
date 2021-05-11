package abhishekkkkk;
import java.util.Scanner;
public class bookmain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("=========================");
		System.out.println("  Welcome to the Store !");
		System.out.println("=========================");
		System.out.println("Enter the number of books in the store :");
		int b=scan.nextInt();
		int bo = 0 ;
		int ma = 0 ;
		int z=0;
		int s=0;
		book arr1[] = new book[b];
		System.out.println("Enter book details : ");
		System.out.println();
		for(int i=0;i<b;i++) {
			book obj1=new book();
			arr1[i]=obj1.read();
			System.out.println();
		}
		System.out.println("=========================");
		System.out.println("Books : ");
		System.out.println();
		for(int i=0;i<b;i++) {
			arr1[i].display();
			arr1[i].disp();
			System.out.println();
		}
		System.out.println("=========================");
		System.out.println("Enter the number of magazines in the store :");
		int m=scan.nextInt();
		magazine arr2[] = new magazine[m];
		System.out.println("Enter magazine details : ");
		System.out.println();
		for(int i=0;i<m;i++) {
			magazine obj2=new magazine();
			arr2[i]=obj2.read();
			System.out.println();
		}
		System.out.println("=========================");
		System.out.println("Magazines : ");
		System.out.println();
		for(int i=0;i<m;i++) {
			arr2[i].display();
			System.out.println();
		}	
		System.out.println("=========================");
		System.out.println("=========================");
		System.out.println("Transactions : ");
		System.out.println();
		int x=0;
		while(x!=5) {
			System.out.println("1)Order new books \n2)Order new magazines \n3)Sell books and magazines \n4)Check stock \n5)Exit");
			System.out.println("=========================");
			x=scan.nextInt();
			switch(x) {
			case 1:
				int g = 0;
				while(g!=3) {
					System.out.println("=========================");
					System.out.println("1)Add copies to existing books.");
					System.out.println("2)Add a new book. \n3)Exit");
					System.out.println("=========================");
					g = scan.nextInt();
					switch(g) {
					case 1:
	                    System.out.println("Enter the title of book: ");
	                    String t = scan.next();
	                    System.out.println("Enter the number of copies to be added: ");
	                    int u = scan.nextInt();
	                    for (int i=0; i<b; i++){   
	                        String t1 =arr1[i].getTitle();
	                        if (t1.equals(t)){
	                            arr1[i].setcopies(arr1[i].getcopies()+u);
	                            System.out.println("=============================");
	                            System.out.println("Copies added!");
	                            System.out.println("=============================");
	                        }
	                    }
	                    break;
					case 2:                                  
	                    System.out.println("Enter the number of books to be ordered: ");
	                    bo = scan.nextInt();
	                    System.out.println();
	                    book [] temp1 = new book[b+bo];
	                    for (int i =0; i<b; i++){   
	                        book obj1 = new book();
	                        temp1[i] = obj1;
	                        temp1[i] = arr1[i];
	                    }
	                    for (int i = b; i<(b+bo); i++){   
	                        book obj1 = new book();
	                        temp1[i] = obj1.read();
	                        System.out.println();
	                    }
	                    System.out.println("=========================");
	                    System.out.println("Book added!");
	                    System.out.println("=========================");
	                    arr1 = new book[arr1.length + bo];
	                    System.arraycopy(temp1, 0, arr1, 0, temp1.length);
	                    b = b + bo;
	                    break;
					case 3:
						break;
					default:
						System.out.println("Wrong Input!");
						break;
					}	
				}
				System.out.println("=========================");
				System.out.println("The books available in the store are : ");
				System.out.println();
				for (int i=0; i<arr1.length; i++) {
					arr1[i].display();
					arr1[i].disp();
					System.out.println();
				}
				System.out.println("=========================");
				break;
			case 2:
				int f=0;
				while(f!=3) {
					System.out.println("=========================");
					System.out.println("1)Add copies to existing magazines.");
					System.out.println("2)Add a new magazine. \n3)Exit");
					System.out.println("=========================");
					f = scan.nextInt();
					switch(f) {
					case 1:
	                    System.out.println("Enter the title of magazine: ");
	                    String ti = scan.next();
	                    System.out.println("Enter the number of copies to be added: ");
	                    int v = scan.nextInt();
	                    for (int i=0; i<m; i++){   
	                        String t2 =arr2[i].getTitle();
	                        if (t2.equals(ti)){
	                            arr2[i].setcopies(arr2[i].getcopies()+v);
	                            System.out.println("=============================");
	                            System.out.println("Copies added!");
	                            System.out.println("=============================");
	                        }
	                    }
	                    break;
					case 2:                                  
	                    System.out.println("Enter the number of magazines to be ordered: ");
	                    ma = scan.nextInt();
	                    System.out.println();
	                    magazine [] temp2 = new magazine[m+ma];
	                    for (int i =0; i<m; i++){   
	                        magazine obj2 = new magazine();
	                        temp2[i] = obj2;
	                        temp2[i] = arr2[i];
	                    }
	                    for (int i = m; i<(m+ma); i++){   
	                        magazine obj2 = new magazine();
	                        temp2[i] = obj2.read();
	                        System.out.println();
	                    }
	                    arr2 = new magazine[arr2.length + ma];
                        System.arraycopy(temp2, 0, arr2, 0, temp2.length);
                        m = m + ma;
	                    
	                    break;
					case 3:
						break;
					default:
						System.out.println("Wrong Input!");
						break;
					}					
				}
				System.out.println("=========================");
				System.out.println("The magazines available in the store are : ");
				System.out.println();
				for (int i=0; i<arr2.length; i++) {
					arr2[i].display();
					System.out.println();
				}
				System.out.println("=========================");
				break;
			case 3:
				int c=0;
				double totalm=0;
				double totalb=0;
				while(c!=3) {
					System.out.println("=========================");
					System.out.println("What do you want to buy : ");
					System.out.println("1)Books \n2)Magazines \n3)Exit");
					System.out.println("=========================");
					c=scan.nextInt();
					int p = 0;
					switch(c) {
					case 1:
						book obj1 = new book();
						System.out.println("How many books do you want to buy : ");
						int q=scan.nextInt();
						System.out.println();
				    	for(int k=0; k<q; k++) {
				    		System.out.println("Enter Title : ");
				    		String t1=scan.next();	
				    		System.out.println("Enter quantity : ");
				    		int qty = scan.nextInt();
				    		boolean flag = false ;
				    		for(int o=0; o<b; o++) {
					    		if(t1.equals(arr1[o].getTitle())) {
					    			totalb=totalb+((arr1[o].getPrice())*qty);
					    			arr1[o].sellcopies(qty);
					    			flag=true;					    			
					    		}
					    		else {
					    			flag=false;
					    		}
				    		}
				    		if(flag) {
				    			System.out.println();
				    			System.out.println("Order placed!");
					    	}
					    	else {
					    		System.out.println();
					    		System.out.println("Sorry! The book is out of stock.");		
					    	}
				    	}
				    	System.out.println("=========================");
						obj1.sellCopy(totalb);
						System.out.println("=========================");
						break;
					case 2:
						magazine obj2 = new magazine();
						System.out.println("How many magazines do you want to buy : ");
						int h=scan.nextInt();
						System.out.println();
				    	for(int k=0; k<h; k++) {
				    		System.out.println("Enter Title : ");
				    		String m1=scan.next();	
				    		System.out.println("Enter quantity : ");
				    		int Qty = scan.nextInt();
				    		boolean check = false;
				    		for(int o=0; o<b; o++) {
					    		if(m1.equals(arr2[o].getTitle())) {
					    			totalm=totalm+((arr2[o].getPrice())*Qty);
					    		    arr2[o].sellcopies(Qty);
					    			check = true;					    		
					    		}
					    		else {
					    			check=false;
					    		}
				    		}
				    		if(check) {
				    			System.out.println();
					    		System.out.println("Order placed!");
					    	}
					    	else {
					    		System.out.println();
					   			System.out.println("Sorry! The magazine is out of stock.");		
					   		}
				    		 				    						    	   		
				    	}
				    	System.out.println("=========================");
						obj2.sellCopy(totalm);	
						System.out.println("=========================");
						break;
					case 3:
						break;
					default:
						System.out.println("Wrong input.");
					}
				}
				publication obj3 = new publication();
				System.out.println("=========================");
				obj3.sellCopy(totalb, totalm);
				System.out.println("=========================");
				break;
			case 4:
				System.out.println("=========================");
				System.out.println("Books Available : ");
				System.out.println();
				for(int i=0; i<arr1.length; i++) {
					System.out.println("Title : "+arr1[i].getTitle());
					System.out.println("Author : "+arr1[i].getAuthor());
					System.out.println("Price : "+arr1[i].getPrice());
					System.out.println("Copies available : "+arr1[i].getcopies());	
					System.out.println();
				}
				System.out.println("=========================");
				System.out.println("Magazines Available : ");
				System.out.println();
				for(int i=0; i<arr2.length; i++) {
					System.out.println("Title : "+arr2[i].getTitle());
					System.out.println("Price : "+arr2[i].getPrice());
					System.out.println("Copies available : "+arr2[i].getcopies());	
					System.out.println();
				} 	
				System.out.println("=========================");
				break;
			case 5:				
				break;
			default:
				System.out.println("Wrong input.");
				break;
				
			}
		}
	}
}